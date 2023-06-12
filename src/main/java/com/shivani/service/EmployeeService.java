package com.shivani.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivani.model.Employee;
import com.shivani.repository.EmpRepo;

@Service
public class EmployeeService {
	@Autowired
	EmpRepo emRepo;

	public Employee addEmp(Employee empObj) {
		// TODO Auto-generated method stub
		return emRepo.save(empObj);
	}

}
