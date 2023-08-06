package tech.baisi.web.passwordmanager.Database.Entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("user")
public class KeyEntity {
    @TableId
    private Integer key_id;
    private String key;

    public String getKey() {
        return key;
    }

    public KeyEntity(Integer key_id, String key) {
        this.key_id = key_id;
        this.key = key;
    }
}
