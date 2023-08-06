package tech.baisi.web.passwordmanager;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tech.baisi.web.passwordmanager.Database.Entity.KeyEntity;
import tech.baisi.web.passwordmanager.Database.Entity.PasswordEntity;
import tech.baisi.web.passwordmanager.Database.Mapper.KeyMapper;
import tech.baisi.web.passwordmanager.Database.Mapper.PasswordMapper;

import java.util.UUID;

@RestController
public class MainWeb {
    @Autowired
    private PasswordMapper passwordMapper;
    @Autowired
    private KeyMapper keyMapper;

    @RequestMapping("/")
    public String mainPage(
        @RequestParam(name = "l1", defaultValue = "无备注") String line1,
        @RequestParam(name = "l2", defaultValue = "无账号") String line2,
        @RequestParam(name = "l3", defaultValue = "无密码") String line3,
        @RequestParam(name = "rm", defaultValue = "无删除") String remove_item,
        @CookieValue(value = "key",defaultValue = "无密钥") String cookie_key,
        HttpServletResponse response
    ){
        //初始化-检查key是否为"无密钥"
        String system_key = keyMapper.selectById(0).getKey();
        if(system_key.equals("无密钥")){
            //生成key
            String new_key = UUID.randomUUID().toString().trim().replaceAll("-", "");
            keyMapper.updateById(new KeyEntity(0,new_key));
            passwordMapper.insert(new PasswordEntity("此网页的密钥 ↓",new_key,"新的浏览器需访问: [此网站]/setcookie?key=[上面一行密钥] 进行设置"));
            passwordMapper.insert(new PasswordEntity("第一行始终显示（点我）","后面两行需用光标/触控查看","完整复制第一行内容输入右边框框可进行删除"));
            cookie_key = new_key;
            system_key = new_key;
            response.addCookie(new Cookie("key",new_key));
        }

        //检验合法key
        if(!cookie_key.equals(system_key)){
            return ""; //返回空白页面
        }

        if(!remove_item.equals("无删除")){
            //执行删除
            passwordMapper.deleteById(remove_item);
        }

        if(!line1.equals("无备注")){
            //新增项目
            passwordMapper.insert(new PasswordEntity(line1,line2,line3));
        }

        //返回主页面
        String toReturn; //最终返回的html片段
        String passwordData = ""; //密码的html片段

        for(PasswordEntity password : passwordMapper.selectList(new QueryWrapper<PasswordEntity>().orderByDesc("timestamp"))){
            passwordData = passwordData.concat("\n<p class=\"item\">").concat(password.getLine1()).concat("<span class=\"white\"><br>").concat(password.getLine2()).concat("<br>").concat(password.getLine3()).concat("</span></p>");
        }
        passwordData = passwordData.concat("\n");

        toReturn = HtmlStrings.beforeItem.concat(passwordData).concat(HtmlStrings.afterItem);

        return toReturn;
    }
}
