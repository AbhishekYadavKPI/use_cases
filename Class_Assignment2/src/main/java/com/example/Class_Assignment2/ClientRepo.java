package com.example.Class_Assignment2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface ClientRepo extends JpaRepository<ClientEntity, Integer>{
	@Query(value = "SELECT * From client_details where id =?1",nativeQuery = true) // and inner join
	List<ClientEntity> getinfo(Integer id);
	

}