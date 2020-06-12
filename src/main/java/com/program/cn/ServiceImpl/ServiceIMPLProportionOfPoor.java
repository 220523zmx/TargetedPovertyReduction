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
import com.program.cn.model.information.InformationExample;

@Service
public class ServiceIMPLProportionOfPoor implements ServiceProportionOfPoor {
	@Resource
	ConditionsMapper conditionsMapper;// conditions表sql语句类声明
	@Resource
	InformationMapper informationMapper;// information表sql语句类声明
	@Resource
	ArearesultMapper arearesultMapper;// arearesult表sql语句类声明

	@Override
	public long countofpoor() {
		ConditionsExample conditionsExample = new ConditionsExample();
		ConditionsExample.Criteria criteria = conditionsExample.createCriteria();
		criteria.andResultEqualTo("0");// 贫困户属性
		long count = conditionsMapper.countByExample(conditionsExample);
		return count;
	}

	@Override
	public long countofrich() {
		ConditionsExample conditionsExample = new ConditionsExample();
		ConditionsExample.Criteria criteria = conditionsExample.createCriteria();
		criteria.andResultEqualTo("1");// 脱贫户属性
		long count = conditionsMapper.countByExample(conditionsExample);
		return count;
	}

	@Override
	public List<Arearesult> returncity() {
		ArearesultExample arearesultExample = new ArearesultExample();
		ArearesultExample.Criteria criteria = arearesultExample.createCriteria();
		arearesultExample.setDistinct(true);// 查询结果去重（无视是否贫困脱贫数量）
		arearesultExample.setOrderByClause("area"); // 查询结果按照地区分组
		List<Arearesult> arearesultlist = arearesultMapper.selectByExample(arearesultExample);

		return arearesultlist;
	}

	@Override
	public long countfromcity(String area, String poor) {
		ArearesultExample arearesultExample = new ArearesultExample();
		ArearesultExample.Criteria criteria = arearesultExample.createCriteria();
		criteria.andAreaEqualTo(area);// 当前地区
		criteria.andResultEqualTo(poor);// 贫困/脱贫
		long count = arearesultMapper.countByExample(arearesultExample);
		return count;
	}

	@Override
	public List<String> returntime() {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		List<String> strlist = informationMapper.selectdistincttime();
		return strlist;
	}

	@Override
	public List<Information> returnfromtime(String time) {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<String> bubbleSort(List<String> list) {
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - 1 - i; j++) {
				if (Integer.parseInt(list.get(j)) < Integer.parseInt(list.get(j + 1))) {
					String temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
			}
		}
		return list;
	}

	@Override
	public long countoflevel_of_education_0(String time) {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		criteria.andDateEqualTo(time);
		criteria.andLevelOfEducationEqualTo("文盲或半文盲");
		return informationMapper.countByExample(informationExample);
	}

	@Override
	public long countoflevel_of_education_1(String time) {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		criteria.andDateEqualTo(time);
		criteria.andLevelOfEducationEqualTo("小学及以上");
		return informationMapper.countByExample(informationExample);
	}

	@Override
	public long countofhealth_0(String time) {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		criteria.andDateEqualTo(time);
		criteria.andHealthEqualTo("健康");
		return informationMapper.countByExample(informationExample);
	}

	@Override
	public long countofhealth_1(String time) {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		criteria.andDateEqualTo(time);
		criteria.andHealthEqualTo("慢性病");
		return informationMapper.countByExample(informationExample);
	}

	@Override
	public long countofhealth_2(String time) {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		criteria.andDateEqualTo(time);
		criteria.andHealthEqualTo("残疾");
		return informationMapper.countByExample(informationExample);
	}

	@Override
	public long countofhealth_3(String time) {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		criteria.andDateEqualTo(time);
		criteria.andHealthEqualTo("瘫痪");
		return informationMapper.countByExample(informationExample);
	}

	@Override
	public long countoflabor_skills_0(String time) {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		criteria.andDateEqualTo(time);
		criteria.andLaborSkillsEqualTo("无劳动力");
		return informationMapper.countByExample(informationExample);
	}

	@Override
	public long countoflabor_skills_1(String time) {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		criteria.andDateEqualTo(time);
		criteria.andLaborSkillsEqualTo("普通劳动力");

		return informationMapper.countByExample(informationExample);
	}

	@Override
	public long countoflabor_skills_2(String time) {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		criteria.andDateEqualTo(time);
		criteria.andLaborSkillsEqualTo("丧失劳动力");
		return informationMapper.countByExample(informationExample);
	}

	@Override
	public long countofrural_cooperative_0(String time) {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		criteria.andDateEqualTo(time);
		criteria.andRuralCooperativeEqualTo("未参");
		return informationMapper.countByExample(informationExample);
	}

	@Override
	public long countofrural_cooperative_1(String time) {
		InformationExample informationExample = new InformationExample();
		InformationExample.Criteria criteria = informationExample.createCriteria();
		criteria.andDateEqualTo(time);
		criteria.andRuralCooperativeEqualTo("参");
		return informationMapper.countByExample(informationExample);
	}

}
