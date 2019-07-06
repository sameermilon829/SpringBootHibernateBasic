package com.sam.bootProject2.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
    @Column(name = "EMP_ID")
	private Long empId;
	
	@Column(name = "EMP_NAME")
	private String empName;

	@Column(name = "EMP_PHONE")
	private String empPhone;
	
	@Column(name = "EMP_CITY")
	private String empCity;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	
	
}
