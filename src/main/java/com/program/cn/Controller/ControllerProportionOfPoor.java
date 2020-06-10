package com.program.cn.Controller;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.program.cn.ServiceImpl.ServiceIMPLProportionOfPoor;

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

		return map;
	}

}
