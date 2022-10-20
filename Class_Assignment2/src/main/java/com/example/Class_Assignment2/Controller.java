package com.example.Class_Assignment2;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
	@Autowired
	private ClientRepo cr;
	
	@GetMapping("/details{id}")
	public List<ClientEntity> getDetails(@PathVariable("id") int id){
		
		return cr.getinfo(id);
	}
		
	}
	

