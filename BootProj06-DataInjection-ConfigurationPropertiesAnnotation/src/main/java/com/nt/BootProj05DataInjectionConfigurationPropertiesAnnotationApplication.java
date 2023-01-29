package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Company1;
import com.nt.sbeans.Company2;

@SpringBootApplication
public class BootProj05DataInjectionConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		//get IOC container
		
		ApplicationContext ctx=SpringApplication.run(BootProj05DataInjectionConfigurationPropertiesAnnotationApplication.class, args);
		//get company1 class obj ref
		Company1 comp1=ctx.getBean("comp1",Company1.class);
		System.out.println(comp1);
		System.out.println("===========================================================");
		//get company2 class obj ref
		Company2 comp2=ctx.getBean("comp2",Company2.class);
		System.out.println(comp2);
	}

}
