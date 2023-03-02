package com.seleniumexpress.employeeservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.seleniumexpress.employeeservice.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;
	
//	public EmployeeResponse getEmployeeById(int id) {
//		
//		Employee emp = employeeRepo.findById(id).get();
//		EmployeeResponse employeeResponse = new EmployeeResponse();
//		
//		employeeResponse.setId(emp.getId());
//		employeeResponse.setName(emp.getName());
//		employeeResponse.setEmail(emp.getEmail());
//		employeeResponse.setBloodGroup(emp.getBloodGroup());
//		
//		return employeeResponse;
//		
//	}
}
