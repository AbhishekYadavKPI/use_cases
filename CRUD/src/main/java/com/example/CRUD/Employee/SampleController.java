package com.example.CRUD.Employee;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SampleController {
	@Autowired
	private EmployeeRepo er;// up to date

	@GetMapping("/sample")
	public List<EmployeeEntity> getSample() {
		ArrayList<EmployeeEntity> transformedvalues = new ArrayList<EmployeeEntity>();
		for (EmployeeEntity emt : er.findAll()) {
			EmployeeEntity temp = new EmployeeEntity();
			temp.setId(emt.getId());
			if (emt.getEmployee_name().contains("$")) {
				temp.setEmployee_name(emt.getEmployee_name().replaceAll("\\$", ""));
			}
			transformedvalues.add(temp);
		}
		return transformedvalues;
	}

	@Autowired
	private EmpRepository ob;

	@GetMapping("/employeename")
	public ArrayList<String> list() {
		ArrayList<String> list2 = new ArrayList<String>();
		for (EmployeeEntity emt : ob.findAll()) {

			list2.add(emt.getEmployee_name());
		}
		return list2;
	}

	@GetMapping("/employee=a")
	public List<EmployeeEntity> startingWith_a() {
		ArrayList<EmployeeEntity> list3 = new ArrayList<EmployeeEntity>();
		for (EmployeeEntity emt : er.findAll()) {
			EmployeeEntity temp2 = new EmployeeEntity();

			if (emt.getEmployee_name().startsWith("a")) {
				temp2.setId(emt.getId());

				temp2.setEmployee_name(emt.getEmployee_name());
				list3.add(temp2);
			}
		}
		return list3;
	}
	@GetMapping("/id")
	public ArrayList<Integer> id() {
		ArrayList<Integer> list3 = new ArrayList<Integer>();
		for (EmployeeEntity emt : er.findAll()) {

			list3.add(emt.getId());
		}
		return list3;
		
	}
	
	@GetMapping("/department")
	public ArrayList<String> department() {
		ArrayList<String> list4 = new ArrayList<String>();
		for (EmployeeEntity emt : er.findAll()) {

			list4.add(emt.getDepartment());
		}
		return list4;
		
	}	
	}




