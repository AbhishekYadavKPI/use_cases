package com.example.Class_Assignment.Repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Class_Assignment.Entities.TruckEntity;


@Repository
public interface TruckRepository extends JpaRepository<TruckEntity,Long>{
	@Query(value = "SELECT * From Car s join Truck d on s.NoOfTyres =d.no_of_tyres") // and inner join
	public List<TruckEntity> join();
	

}

