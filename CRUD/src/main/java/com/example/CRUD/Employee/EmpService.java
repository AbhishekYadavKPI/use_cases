package com.example.CRUD.Employee;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	@Autowired
	private EmpRepository emp;
	
	public List<EmployeeEntity> list(){
		return emp.findAll();
		
	}
	
	
		
	}


