package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("comp1")
@Data
public class Company1 {
	
	@Value("${org.nit.name}")
	private String name;
	@Value("${org.nit.addrs}")
	private String location;
	@Value("${hcl.size}")
	private Integer csize;
	@Value("${org.nit.type}")
	private String ctype;
	@Value("${org.nit.contact}")
	private Long mobileno;
	
	
	
	
	

}
