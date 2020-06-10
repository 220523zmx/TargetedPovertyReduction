package com.program.cn.ServiceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.program.cn.Service.ServiceProportionOfPoor;
import com.program.cn.dao.mapper.*;
import com.program.cn.model.conditions.ConditionsExample;

@Service
public class ServiceIMPLProportionOfPoor implements ServiceProportionOfPoor {
	@Resource
	ConditionsMapper conditionsMapper;

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

}
