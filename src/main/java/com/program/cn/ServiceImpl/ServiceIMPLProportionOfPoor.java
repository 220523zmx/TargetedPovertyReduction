package com.program.cn.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.program.cn.Service.ServiceProportionOfPoor;
import com.program.cn.dao.mapper.*;
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
	public List<String> returncity() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long countfromcity() {
		// TODO Auto-generated method stub
		return 0;
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
