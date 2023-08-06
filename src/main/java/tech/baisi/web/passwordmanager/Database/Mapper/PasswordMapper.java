package tech.baisi.web.passwordmanager.Database.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import tech.baisi.web.passwordmanager.Database.Entity.PasswordEntity;

@Mapper
public interface PasswordMapper extends BaseMapper<PasswordEntity> {
}
