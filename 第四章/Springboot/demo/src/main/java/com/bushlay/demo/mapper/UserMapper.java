package com.bushlay.demo.mapper;

import com.bushlay.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {


    // 查询全部数据
    List<User> getAll();

    // 插入数据
    int save(User user);

    // 根据id查询数据
    User findById(int id);

    // 根据id删除数据
    void delete(int id);

    // 更新数据
    int update(User user);

    //创建表
    void createTable();
}
