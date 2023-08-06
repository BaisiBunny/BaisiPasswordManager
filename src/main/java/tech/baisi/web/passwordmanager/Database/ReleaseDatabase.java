package tech.baisi.web.passwordmanager.Database;

import ch.qos.logback.core.util.FileUtil;
import org.apache.commons.io.FileUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Component
public class ReleaseDatabase implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        File sqliteFile = new File("BaisiPassword.db");
        if(!sqliteFile.exists()){
            //复制文件
            //创建新文件
            sqliteFile.createNewFile();
            //获取文件流
            InputStream in = FileUtil.class.getClassLoader().getResourceAsStream("static/BaisiPassword.db");
            //将流写入新文件
            FileUtils.copyInputStreamToFile(in,sqliteFile);
        }
    }
}
