package com.program.cn.Service;

import java.util.List;

import com.program.cn.model.information.Information;

public interface ServiceProportionOfPoor {

	public long countofpoor();

	public long countofrich();

	public List<String> returncity();

	public long countfromcity();

	public List<String> returntime();

	public List<Information> returnfromtie();
}
