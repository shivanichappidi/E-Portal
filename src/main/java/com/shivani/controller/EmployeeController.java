package com.shivani.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivani.model.Employee;
import com.shivani.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
//	@PostMapping("/add")
//	public Employee addEmp(@RequestBody Employee empObj) {
//		return empService.addEmp(empObj);
//	}
	
	@PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee savedEmployee = empService.addEmp(employee);
        return ResponseEntity.ok(savedEmployee);
    }
}
