package com.bushlay.demo.mapper;

import com.bushlay.demo.entity.Plan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PlanMapper {
    @Select("SELECT * FROM word_plan")
    List<Plan> getPlan();

    @Insert("INSERT INTO word_plan(date, num) VALUES(#{date}, #{num})")
    Plan addPlan(Plan plan);

    @Delete("DELETE FROM word_plan WHERE date = #{id}")
    void deletePlan(String id);
}
