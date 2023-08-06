package tech.baisi.web.passwordmanager.Database.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("password")
public class PasswordEntity {

    private long timestamp;
    @TableId
    private String line1;
    private String line2;
    private String line3;

    public String getLine1() {
        return line1;
    }

    public String getLine2() {
        return line2;
    }

    public String getLine3() {
        return line3;
    }

    public PasswordEntity(String line1, String line2, String line3) {
        this.timestamp = System.currentTimeMillis();
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }
}
