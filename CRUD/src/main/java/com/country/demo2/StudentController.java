package com.country.demo2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {


		@Autowired
		private StudentRepo er;//up to date
		
		
		@GetMapping("/student") 
		public List<StudentEntity> getSample(){
			ArrayList<StudentEntity> transformedvalues=new ArrayList<StudentEntity>();
	    	for(StudentEntity emt:er.findAll()) {
	    		StudentEntity temp=new StudentEntity();
	    		temp.setId(emt.getId());
	    		if(emt.getId()% 2 != 0) {
	    			temp.setstudent_name(emt.getstudent_name());
	    		}
	    		transformedvalues.add(temp);
	    	}
	    	return transformedvalues;
		}


		}
	
	


