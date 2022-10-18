package com.example.CRUD;


import com.example.CRUD.Employee.EmpService;
import com.example.CRUD.Employee.EmployeeEntity;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;



@RunWith(SpringRunner.class)
@SpringBootTest
public class EmpServiceUnitTest {
	
	@Autowired
	private EmpService empService;
	
	@Test
	public void whenApllicationStarts_thenHibernateCreatesInitialRecords() {
		List<EmployeeEntity> list1 = empService.list();
		
		Assert.assertEquals(8,list1.size());
	}
	
	

}
