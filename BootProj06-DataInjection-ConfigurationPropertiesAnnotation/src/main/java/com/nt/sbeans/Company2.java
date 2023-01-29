package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("comp2")
@ConfigurationProperties(prefix = "org.nit")
@PropertySource("info.properties")
public class Company2 {
	
	private String name;
	private String addrs;
	@Value("${hcl.size}")
	private Integer size;
	private String type;
	private Long contact;

}
