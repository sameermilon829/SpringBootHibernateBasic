package com.sam.bootProject2.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sam.bootProject2.dao.IEmployeeDAO;

@Component
public class EmployeeService {
	
	@Autowired
	private IEmployeeDAO employeeDAO;
	
	@Transactional
	public String fetchEmployeeDetails(long id){
		
		System.out.println("Fetching results for empId:"+id);
		String name= employeeDAO.fetchEmployeeById(id);
		if(null !=name){
			System.out.println("Name:"+name);
			return name;
		}else
			return "getting null output";
	}
}
