package com.example.Class_Assignment.Entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Truck")
public class TruckEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int truck_id;
	private String truck_name;
	private int no_Of_tyres;
	/*
	 * @ManyToOne(cascade=CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "bike_id", insertable = false, updatable = false)
	 * 
	 * @Fetch(FetchMode.JOIN) private BikeEntity bikes;
	 */
	/*
	 * public TruckEntity(int truck_id, String truck_name, int no_Of_tyres) {
	 * super(); this.truck_id = truck_id; this.truck_name = truck_name;
	 * this.no_Of_tyres = no_Of_tyres; }
	 */
	public int getNo_Of_tyres() {
		return no_Of_tyres;
	}
	public void setNo_Of_tyres(int no_Of_tyres) {
		this.no_Of_tyres = no_Of_tyres;
	}
	
	public int getTruck_id() {
		return truck_id;
	}
	public void setTruck_id(int truck_id) {
		this.truck_id = truck_id;
	}
	public String getTruck_name() {
		return truck_name;
	}
	public void setTruck_name(String truck_name) {
		this.truck_name = truck_name;
	}
	

}



