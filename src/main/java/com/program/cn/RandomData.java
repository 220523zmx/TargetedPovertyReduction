package com.program.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.druid.stat.TableStat.Condition;
import com.program.cn.dao.mapper.ConditionsMapper;
import com.program.cn.dao.mapper.InformationMapper;
import com.program.cn.model.conditions.Conditions;
import com.program.cn.model.information.Information;
import com.program.cn.model.information.InformationExample;
@Service
public class RandomData {
	@Resource
	InformationMapper informationMapper;
	@Resource
	ConditionsMapper conditionsMapper;
	String[] s1={"小学及以上","文盲或半文盲"};
	String[] s2={"健康","慢性病","残疾","瘫痪"};
	String[] s3={"无劳动力","普通劳动力","丧失劳动力"};
	String[] s4={"未参","参"};
	String[] s5={"未脱贫","已脱贫"};
	public void createdata() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		RandomData re = new RandomData();
		//Conditions in = new Conditions();
			Information in = new Information();
			Date date = re.Randomdate();
			int ran1 = (int) (Math.random()*(2-0)+0); 
			int ran2 = (int) (Math.random()*(4-0)+0); 
			int ran3 = (int) (Math.random()*(3-0)+0); 
			int ran4 = (int) (Math.random()*(2-0)+0); 
			int ran5 = (int) (Math.random()*(2-0)+0);
			int ran6 = (int) (Math.random()*(2021-2010)+2010);
			//System.out.println("year "+date+" 1_"+s1[ran1]+" 2_"+s2[ran2]+" 3_"+s3[ran3]+" 4_"+s4[ran4]+" 5_"+s5[ran5]);
			in.setDate(format.format(date));
			in.setHealth(s2[ran2]);
			in.setLaborSkills(s3[ran3]);
			in.setLevelOfEducation(s1[ran1]);
			in.setResult(s5[ran5]);
			in.setRuralCooperative(s4[ran4]);
			System.out.println(in.getDate().toString());
			System.out.println(in.getHealth().toString());
			System.out.println(in.getLaborSkills().toString());
			System.out.println(in.getLevelOfEducation().toString());
			System.out.println(in.getResult().toString());
			System.out.println(in.getRuralCooperative().toString());
			informationMapper.insert(in);
			//conditionsMapper.insertno(in);
			
		}
		
		
	public Date Randomdate() {
		Random rand = new Random();
		Calendar cal = Calendar.getInstance();
		cal.set(2000, 1, 1);
		long start = cal.getTimeInMillis();
		cal.set(2020, 12, 31);
		long end = cal.getTimeInMillis();
		Date d = new Date(start + (long)(rand.nextDouble() * (end - start)));
		return d;
	}
	public static void main(String[] args) {
		RandomData rd = new RandomData();
		rd.createdata();
	}
}
