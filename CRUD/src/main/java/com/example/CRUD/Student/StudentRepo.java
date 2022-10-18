package com.example.CRUD.Student;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<StudentEntity, Integer>{

}