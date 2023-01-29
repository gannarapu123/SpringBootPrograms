package com.nt;


import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.PayrollOperationsController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootProj03LayeredAppRealTimeDiApplication {

	public static void main(String[] args) {
		
		//read inputs from the scanner
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Employee name::");
		String name=scn.next();
		System.out.println("Enter Employee desg::");
		String desg=scn.next();
		System.out.println("Enter Employee basicSalary::");
		Double basicSalary=scn.nextDouble();
		//create EMployee class object
		Employee emp=new Employee();
		emp.setDesg(desg);
		emp.setEname(name);
		emp.setSalary(basicSalary);
		
		//get IOC Container
		ApplicationContext ctx=SpringApplication.run(BootProj03LayeredAppRealTimeDiApplication.class, args);
		//get Controlle class object
		PayrollOperationsController controller=ctx.getBean("payrollController",PayrollOperationsController.class);
		//invoke the method
		try {
			String result=controller.processEmployee(emp);
			System.out.println(result);
		} //try
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem --Try again"+e.getMessage());
		}
		//close the container
		scn.close();
		((ConfigurableApplicationContext) ctx).close();
	}//main

}//class
