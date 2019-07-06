package com.sameer.bootProject2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sam.bootProject2.service.EmployeeService;

@SpringBootApplication(scanBasePackages={"com.sam.bootProject2"})
@RestController
@EnableAutoConfiguration
public class BootProject2Application {

	@Autowired
	private EmployeeService employeeService;	
	
	
	public static void main(String[] args) {
		SpringApplication.run(BootProject2Application.class, args);
	}

	
	@RequestMapping("/")
	public @ResponseBody String working(){
		return employeeService.fetchEmployeeDetails(1);
	}
	
}
