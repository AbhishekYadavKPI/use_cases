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
	final String equal = "equalto5";
	final String more = "greaterthan5";
	Integer Discount=0;
	@GetMapping("/details{id}")
	public List<ClientEntity> getDetails(@PathVariable("id") int id){
		
		return cr.getinfo(id);
	}
	
	@GetMapping("/term/{years}-{premium}")
	public Integer getDiscount(@PathVariable("years") String years,@PathVariable("premium") int premium){
		
		if(years.equals(more)) {
			Discount=(premium*12/100);
		}
		else if(years.equals(equal)) {
			Discount=(premium*10/100);
		}
		else
			Discount=0;
		
		return premium-Discount;
	}
	
	@GetMapping("/user{id}-{premium}") 
	public Integer calDiscount(@PathVariable("id")int id,@PathVariable("premium")int premium) {
		
		int t=cr.getTerm(id); 
		
		if(t>5) {  
			return (premium -(premium*12/100));} 
		else if(t<5) { 
			return (premium -(premium*10/100));}
		else 
			return premium;
	}
	 
	@GetMapping("/{name1}-{premium}") 
	public Integer calDiscount1(@PathVariable("name1")String name1,@PathVariable("premium")int premium) {
		
		int t=cr.getTerm1(name1); 
		
		if(t>5) {  
			return (premium -(premium*12/100));} 
		else if(t<5) { 
			return (premium -(premium*10/100));}
		else 
			return premium;
	}
	}
	

