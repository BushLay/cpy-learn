package com.bushlay.springbootmybatis.mapper;

import com.bushlay.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from t_user")
    public List<User> findAll();
}
