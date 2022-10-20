package com.example.Class_Assignment.Repositories;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.Class_Assignment.Entities.CarEntity;


@Repository
public interface CarRepository extends JpaRepository<CarEntity,Long>{
	@Query(value = "select * from Truck where no_of_tyres in(select NoOfTyres from Car);",nativeQuery = true ) // and inner join
	public List<CarEntity> join();
	

}
