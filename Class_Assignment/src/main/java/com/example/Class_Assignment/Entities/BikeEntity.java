package com.example.Class_Assignment.Entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name="Bike")
public class BikeEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bike_id;
	private String bike_name;
	private int NoOftyres;
	/*
	 * @ManyToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "car_id", insertable = false, updatable = false)
	 * 
	 * @Fetch(FetchMode.JOIN) priate CarEntity car;
	 */
	
	
	/*
	 * @OneToMany(targetEntity=TruckEntity.class, cascade = CascadeType.ALL) private
	 * List<TruckEntity> truck;
	 * 
	 * public BikeEntity(int bike_id, String bike_name, int noOftyres) { super();
	 * this.bike_id = bike_id; this.bike_name = bike_name; NoOftyres = noOftyres; }
	 */
	public int getNoOftyres() {
		return NoOftyres;
	}
	public void setNoOftyres(int noOftyres) {
		NoOftyres = noOftyres;
	}
	
	public int getBike_id() {
		return bike_id;
	}
	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	
	
	
	

}
