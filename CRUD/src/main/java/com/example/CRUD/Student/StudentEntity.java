package com.example.CRUD.Student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="student")
public class StudentEntity {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
private String student_name;


  


}
