package com.bushlay.demo.mapper;

import com.bushlay.demo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
//    查询全部数据
    @Select("select * from user")
    List<User> getAll();

//    插入数据
    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    int save(User user);

//    根据id查询数据
    @Select("SELECT * FROM user WHERE id = #{id}")
    User findById(int id);

//    根据id删除数据
    @Insert("DELETE FROM user WHERE id = #{id}")
    void delete(int id);

//    更新数据
    @Insert("UPDATE user SET name = #{name}, age = #{age} WHERE id = #{id}")
    int update(User user);
}
