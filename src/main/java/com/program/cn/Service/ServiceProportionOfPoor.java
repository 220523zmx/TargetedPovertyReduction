package com.program.cn.Service;

import java.util.List;

import com.program.cn.model.arearesult.Arearesult;
import com.program.cn.model.information.Information;

public interface ServiceProportionOfPoor {

	public long countofpoor();

	public long countofrich();

	public List<Arearesult> returncity();

	public long countfromcity(String area,String poor);

	public List<String> returntime();

	public List<Information> returnfromtie();
}
