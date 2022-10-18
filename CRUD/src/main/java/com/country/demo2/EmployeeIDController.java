package com.country.demo2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeIDController {
	
	@Autowired
	private EmployeeRepo er;//up to date
	
	/*
	 * @GetMapping("/employeeID") public List<EmployeeEntity> getSample(){
	 * ArrayList<EmployeeEntity> transformedvalues=new ArrayList<EmployeeEntity>();
	 * for(EmployeeEntity emt:er.findAll()) { EmployeeEntity temp=new
	 * EmployeeEntity(); temp.setId(emt.getId());
	 * 
	 * transformedvalues.add(temp); } return transformedvalues; }
	 */
	@GetMapping("/employeeID") 
    public List<Integer> getSample(){
        ArrayList<Integer> empid = new ArrayList<>();
        for(EmployeeEntity emt : er.findAll()) {
            empid.add(emt.getId());
        }
        return empid;
    }

}
