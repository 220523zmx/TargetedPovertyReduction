package com.program.cn.Controller;

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
	@RequestMapping(value = "/getrenshubi", method = RequestMethod.GET)
	public Map<String, Object> getrenshubi() {

		Map<String, Object> map = new HashMap<String, Object>();
		long countpoor = proportionOfPoor.countofpoor();
		long countrich = proportionOfPoor.countofrich();
		map.put("countpoor", countpoor);
		map.put("countrich", countrich);
		System.out.println("+" + countpoor + "-" + countrich);
		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/getconditionbytime", method = RequestMethod.GET)
	public Map<String, Object> getconditionbytime() {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("1");

		return map;
	}

	@ResponseBody
	@RequestMapping(value = "/getresultbyarea", method = RequestMethod.GET)
	public Map<String, Object> getresultbyarea() {
		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("2");
		List<Arearesult> list = proportionOfPoor.returncity();
		List<Object> listlong = new ArrayList<Object>();
		for(int i = 0;i<list.size();i++) {
			listlong.add(proportionOfPoor.countfromcity(list.get(i).getArea(), list.get(i).getResult()));
			System.out.println(listlong.get(i));
			System.out.println(i);
		}

		return map;
	}

}
