package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDAO empDAO;
	

	@Override
	public String registerEmployee(Employee emp) throws Exception {
		//calculate the gross salary and netsalary
		double grossSalary=emp.getSalary()+(emp.getSalary()*0.4f);
		double netSalary=grossSalary-(grossSalary*0.2f);
		//set grossSalary,netSalry to EMployee class object
		emp.setGrossSalary(grossSalary);
		emp.setNetSalary(netSalary);
		//use DAO
		int count=empDAO.insert(emp);
		return count==0?"Employee Registration failed":"Employee Registration and the salary=="+emp.getSalary()+"--grossSalary=="+emp.getGrossSalary()+"--NetSalary=="+emp.getNetSalary();
	
	}

}
