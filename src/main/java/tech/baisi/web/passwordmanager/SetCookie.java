package tech.baisi.web.passwordmanager;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetCookie {
    @RequestMapping("/setcookie")
    public String setCookie(String key, HttpServletResponse response){
        Cookie cookie = new Cookie("key",key);
        response.addCookie(cookie);

        return "<h1>已成功设置密钥</h1><p>如果密钥正确，您现在就可以进入网站了。</p>";
    }
}
