package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj07DataInjectionConfigurationPropertiesOnArrayListSetMapHasAPropertiesApplication {

	public static void main(String[] args) {
		//get IOC container
		ApplicationContext ctx=SpringApplication.run(BootProj07DataInjectionConfigurationPropertiesOnArrayListSetMapHasAPropertiesApplication.class, args);
		//get Employee object ref
		Employee emp=ctx.getBean("emp", Employee.class);
		System.out.println(emp);
		//close the IOC container
		((ConfigurableApplicationContext) ctx).close();
	}

}
