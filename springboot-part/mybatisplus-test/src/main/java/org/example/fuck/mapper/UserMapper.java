package org.example.fuck.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.fuck.pojo.User;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
