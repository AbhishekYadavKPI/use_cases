package com.example.Class_Assignment.Repositories;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Class_Assignment.Entities.BikeEntity;



@Repository
public interface BikeRepository extends JpaRepository<BikeEntity,Long>{
	@Query(value = "SELECT * From Bike s join Truck d on s.NoOfTyres =d.no_of_tyres",nativeQuery = true) // and inner join
	List<BikeEntity> join();
	

}
