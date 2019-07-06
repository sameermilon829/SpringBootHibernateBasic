package com.sam.bootProject2.dao;

import org.springframework.stereotype.Component;

@Component
public interface IEmployeeDAO {

	public String fetchEmployeeById(Long id);
	
}
