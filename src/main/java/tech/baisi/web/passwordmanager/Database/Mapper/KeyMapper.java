package tech.baisi.web.passwordmanager.Database.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import tech.baisi.web.passwordmanager.Database.Entity.KeyEntity;

@Mapper
public interface KeyMapper extends BaseMapper<KeyEntity> {
}
