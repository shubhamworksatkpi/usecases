package com.country.demo2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeDepartment {

		@Autowired
		private EmployeeRepo er;//up to date
				
				@GetMapping("/department") 
			    public List<String> getSample1(){
			        ArrayList<String> dept = new ArrayList<>();
			        for(EmployeeEntity emt : er.findAll()) {
			            dept.add(emt.getDepartment());
			        }
			        return dept;
			    }
		

}