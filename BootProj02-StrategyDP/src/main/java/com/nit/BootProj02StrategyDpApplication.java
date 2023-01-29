package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nit.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nit/cfgs/ApplicationContext.xml")
public class BootProj02StrategyDpApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj02StrategyDpApplication.class, args);
		//get Target spring bean class object
		Vehicle vehicle=ctx.getBean("vehicle", Vehicle.class);
		
		//invoke the business method
		vehicle.move("hyd", "Goa");
		
		//close the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
