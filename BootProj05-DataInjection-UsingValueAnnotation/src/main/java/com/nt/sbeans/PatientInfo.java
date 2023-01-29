package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pInfo")
@Data
public class PatientInfo {
	@Value("1001")
	private Integer pid;
	@Value("${pi.name}")
	private String pname;
	@Value("${pi.mobileno}")
	private Long mobileNo;
	@Value("${pi.addrs}")
	private String paddrs;
	@Value("#{dcc.xrayPrice+dcc.ctscanPrice+dcc.ecgPrice}")//SPEL based  injection
	private Double billAmount;
	@Value("#{dcc.ecgPrice<=0}")//SPEL
	private Boolean ecgFree;
	@Value("${os.name}")
	private String osName;//To hold system property value
	@Value("${Path}")
	private String pathData;//To hold env..variable value
	

}
