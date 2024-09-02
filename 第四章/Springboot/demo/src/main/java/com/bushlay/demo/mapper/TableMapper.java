package com.bushlay.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TableMapper {
    void createTable(@Param("name") String tableName);
}
