package com.country.demo2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeNameController {

		@Autowired
		private EmployeeRepo er;//up to date
		

		@GetMapping("/employeename") 
	    public List<String> getSample1(){
	        ArrayList<String> empname = new ArrayList<>();
	        for(EmployeeEntity emt : er.findAll()) {
	            empname.add(emt.getEmployee_name());
	        }
	        return empname;
	    }


}