package com.seleniumexpress.employeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
//	
//	@Autowired
//	RestTemplate restTemplate;
	
//	@Autowired
//	EmployeeService employeeService;
	
//	@Autowired
//	EmployeeRepo employeeRepo;
	
	@GetMapping("/employee")
	String getEmployee() {
		//return the address data along with employee data
	    //get the data from address service from hitting this http://localhost:8080/address
		//String address = restTemplate.getForObject("http://localhost:8080/address", String.class);
		return "Mani , TCS ";
	}
	
//	@GetMapping("/employee/{id}")
//	ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id")int id) {
//		
//		//db call
//		EmployeeResponse employee = employeeService.getEmployeeById(id);
//		return ResponseEntity.status(HttpStatus.OK).body(employee);
//				
//	}
	
	

}
