package com.program.cn.dao.mapper;

import com.program.cn.model.information.Information;
import com.program.cn.model.information.InformationExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface InformationMapper {
	long countByExample(InformationExample example);

	int deleteByExample(InformationExample example);

	int insert(Information record);

	int insertSelective(Information record);

	List<Information> selectByExample(InformationExample example);

	List<String> selectdistincttime();

	int updateByExampleSelective(@Param("record") Information record, @Param("example") InformationExample example);

	int updateByExample(@Param("record") Information record, @Param("example") InformationExample example);
}