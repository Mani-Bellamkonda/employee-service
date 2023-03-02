package com.seleniumexpress.employeeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.employeeservice.entity.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
