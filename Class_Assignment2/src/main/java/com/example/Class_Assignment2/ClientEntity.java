package com.example.Class_Assignment2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client_Details")
public class ClientEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	private Integer term_plan;
	private Integer Insurance_number;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTerm_plan() {
		return term_plan;
	}
	public void setTerm_plan(Integer term_plan) {
		this.term_plan = term_plan;
	}
	public Integer getInsurance_number() {
		return Insurance_number;
	}
	public void setInsurance_number(Integer insurance_number) {
		Insurance_number = insurance_number;
	}
	
	
	

}
