package com.program.cn.dao.mapper;

import com.program.cn.model.conditions.Conditions;
import com.program.cn.model.conditions.ConditionsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ConditionsMapper {
    long countByExample(ConditionsExample example);

    int deleteByExample(ConditionsExample example);

    int insert(Conditions record);

    int insertSelective(Conditions record);

    List<Conditions> selectByExample(ConditionsExample example);

    int updateByExampleSelective(@Param("record") Conditions record, @Param("example") ConditionsExample example);

    int updateByExample(@Param("record") Conditions record, @Param("example") ConditionsExample example);
}