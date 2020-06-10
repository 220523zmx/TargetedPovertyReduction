package com.program.cn.dao.mapper;

import com.program.cn.model.arearesult.Arearesult;
import com.program.cn.model.arearesult.ArearesultExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ArearesultMapper {
	long countByExample(ArearesultExample example);

	int deleteByExample(ArearesultExample example);

	int insert(Arearesult record);

	int insertSelective(Arearesult record);

	List<Arearesult> selectByExample(ArearesultExample example);

	int updateByExampleSelective(@Param("record") Arearesult record, @Param("example") ArearesultExample example);

	int updateByExample(@Param("record") Arearesult record, @Param("example") ArearesultExample example);
}