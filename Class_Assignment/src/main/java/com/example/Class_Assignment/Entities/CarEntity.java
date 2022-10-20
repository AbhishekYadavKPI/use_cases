package com.example.Class_Assignment.Entities;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="Car")
public class CarEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int car_id;
	private String car_name;
	private int NoOfTyres;
	
	/*
	 * @OneToMany(targetEntity=BikeEntity.class, cascade = CascadeType.ALL) private
	 * Set<BikeEntity> bike;
	 */
	
	
	
	public int getCar_id() {
		return car_id;
	}
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public int getNoOfTyres() {
		return NoOfTyres;
	}
	public void setNoOfTyres(int noOfTyres) {
		NoOfTyres = noOfTyres;
	}
	

}
