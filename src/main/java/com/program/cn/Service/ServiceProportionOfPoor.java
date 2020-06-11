package com.program.cn.Service;

import java.util.List;

import com.program.cn.model.arearesult.Arearesult;
import com.program.cn.model.information.Information;

public interface ServiceProportionOfPoor {

	public long countofpoor();//conditions表统计贫困人数

	public long countofrich();//conditions表统计脱贫人数

	public List<Arearesult> returncity();//arearesult表返回地区名

	public long countfromcity(String area,String poor);//arearesult表按照地区统计脱贫或贫困人数

	public List<String> returntime();//

	public List<Information> returnfromtie();
}
