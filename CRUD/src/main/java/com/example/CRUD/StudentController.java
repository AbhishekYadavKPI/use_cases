package com.example.CRUD;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
	@Autowired
	private StudentRepo er;//up to date
	@GetMapping("/student") 
	public List<StudentEntity> getSample(){
		ArrayList<StudentEntity> list=new ArrayList<StudentEntity>();
    	for(StudentEntity emt:er.findAll()) {
    		StudentEntity temp=new StudentEntity();
    		
    		if(emt.getStudent_name().startsWith("M")) {
    			temp.setId(emt.getId());
    			temp.setStudent_name(emt.getStudent_name());
    			list.add(temp);
    		}
    		
    	}
    	return list;
	}
		




}
