package com.program.cn.Controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.program.cn.ServiceImpl.ServiceIMPLProportionOfPoor;
import com.program.cn.model.arearesult.Arearesult;

@Controller
@RequestMapping("/survey")
public class ControllerProportionOfPoor {
	@Resource
	ServiceIMPLProportionOfPoor proportionOfPoor;

	@ResponseBody
	@RequestMapping(value = "/getrenshubi", method = RequestMethod.GET) // 当前贫困比例
	public Map<String, Object> getrenshubi() {
		Map<String, Object> map = new HashMap<String, Object>();// 返回前端数据类型定义
		long countpoor = proportionOfPoor.countofpoor();// 统计贫困户数量变量定义
		long countrich = proportionOfPoor.countofrich();// 统计脱贫户数量变量定义
		map.put("countpoor", countpoor);// 统计贫困户数量变量加入
		map.put("countrich", countrich);// 统计脱贫户数量变量加入
		return map;// 数据返回前端
	}

	@ResponseBody
	@RequestMapping(value = "/getconditionbytime", method = RequestMethod.GET) // 每年的贫困户特征统计
	public Map<String, Object> getconditionbytime() {
		Map<String, Object> map = new HashMap<String, Object>();//
		System.out.println("1");
		return map;//
	}

	@ResponseBody
	@RequestMapping(value = "/getresultbyarea", method = RequestMethod.GET) // 各地区贫困户与脱贫户的比例
	public Map<String, Object> getresultbyarea() {
		Map<String, Object> map = new HashMap<String, Object>();// 返回前端数据类型定义
		List<Arearesult> list = proportionOfPoor.returncity();// 接受数据库查询（已分组、去重）
		for (int x = 1; x < 4; x++) {// 总共34个地区，分3个图在前端展示
			List<Object> firstrow = new ArrayList<Object>();// 导入分类标签数据变量定义
			List<Object> alllist = new ArrayList<Object>();// 每图的所有数据的数据变量定义
			firstrow.add("product");// 横坐标属性列名（可隐藏）
			firstrow.add("已脱贫");// 每个地区第一个数据柱含义
			firstrow.add("未脱贫");// 每个地区第二个数据柱含义
			alllist.add(firstrow);// 导入分类标签变量加入
			for (int i = (x - 1) * 24; i < x * 24 & i < list.size(); i += 2) {
				List<Object> row = new ArrayList<Object>();// 将地区+脱贫数量/比例+贫困数量/比例以行数据形式的数据类型定义
				float rich = proportionOfPoor.countfromcity(list.get(i).getArea(), list.get(i).getResult());// 已脱贫人数
				float poor = proportionOfPoor.countfromcity(list.get(i + 1).getArea(), list.get(i + 1).getResult());// 未脱贫人数
				float addnum = poor + rich;// 总人数
				// poor = poor / addnum * 100;// 当地贫困比
				// rich = rich / addnum * 100;// 当地脱贫比
				row.add(list.get(i).getArea());// 地区名
				row.add(rich);// 脱贫变量（数量、比例）
				row.add(poor);// 贫困变量（数量、比例）
				alllist.add(row);// 行数据变量加入
			}
			map.put("num" + x, alllist);// 每图数据变量加入
		}

		return map;// 数据返回前端
	}

}
