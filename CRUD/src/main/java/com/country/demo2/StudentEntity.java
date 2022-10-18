package com.country.demo2;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

 
@Entity
@Table(name="student")

public class StudentEntity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String student_name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getstudent_name() {
		return student_name;
	}
	public void setstudent_name(String student_name) {
		this.student_name = student_name;
	}
	
	
}




