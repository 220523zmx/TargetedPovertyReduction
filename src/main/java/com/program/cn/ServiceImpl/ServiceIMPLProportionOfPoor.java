package com.program.cn.ServiceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.program.cn.Service.ServiceProportionOfPoor;
import com.program.cn.dao.mapper.*;
import com.program.cn.model.arearesult.Arearesult;
import com.program.cn.model.arearesult.ArearesultExample;
import com.program.cn.model.conditions.ConditionsExample;
import com.program.cn.model.information.Information;

@Service
public class ServiceIMPLProportionOfPoor implements ServiceProportionOfPoor {
	@Resource
	ConditionsMapper conditionsMapper;
	@Resource
	InformationMapper informationMapper;
	@Resource
	ArearesultMapper arearesultMapper;

	@Override
	public long countofpoor() {
		ConditionsExample conditionsExample = new ConditionsExample();
		ConditionsExample.Criteria criteria = conditionsExample.createCriteria();
		criteria.andResultEqualTo("0");
		long count = conditionsMapper.countByExample(conditionsExample);
		return count;
	}

	@Override
	public long countofrich() {
		ConditionsExample conditionsExample = new ConditionsExample();
		ConditionsExample.Criteria criteria = conditionsExample.createCriteria();
		criteria.andResultEqualTo("1");
		long count = conditionsMapper.countByExample(conditionsExample);
		return count;
	}

	@Override
	public List<Arearesult> returncity() {
		ArearesultExample arearesultExample = new ArearesultExample(); 
		ArearesultExample.Criteria criteria = arearesultExample.createCriteria();
		arearesultExample.setDistinct(true);
		arearesultExample.setOrderByClause("area"); 
		List<Arearesult> arearesultlist= arearesultMapper.selectByExample(arearesultExample);
		
		return arearesultlist;
	}

	@Override
	public long countfromcity(String area,String poor) {
		ArearesultExample arearesultExample = new ArearesultExample(); 
		ArearesultExample.Criteria criteria = arearesultExample.createCriteria();
		criteria.andAreaEqualTo(area);
		criteria.andResultEqualTo(poor);
		long count = arearesultMapper.countByExample(arearesultExample);
		return count;
	}

	@Override
	public List<String> returntime() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Information> returnfromtie() {
		// TODO Auto-generated method stub
		return null;
	}

}
