package com.example.Class_Assignment;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Class_Assignment.Entities.BikeEntity;
import com.example.Class_Assignment.Entities.CarEntity;
import com.example.Class_Assignment.Entities.TruckEntity;
import com.example.Class_Assignment.Repositories.BikeRepository;
import com.example.Class_Assignment.Repositories.CarRepository;
import com.example.Class_Assignment.Repositories.TruckRepository;


@RestController
public class VehicleContoller {
	

	@Autowired
	private CarRepository car;
	@Autowired
	private TruckRepository truck;
	@Autowired
	private BikeRepository bike;

	@GetMapping("/car")
	public List<CarEntity> getSample() {
		return car.join();
	}

	@GetMapping("/truck")
	public List<TruckEntity> getsampl() {
		return truck.join();
	}

	@GetMapping("/Bike")
	public List<BikeEntity> getsamp2() {
		return bike.join();
	}

}

