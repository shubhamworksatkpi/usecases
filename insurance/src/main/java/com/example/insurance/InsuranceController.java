package com.example.insurance;
	
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



	@RestController
	

	public class InsuranceController {
		
		@Autowired
	    private ClientRepo cr;
		
		
		@GetMapping("/information")
	    public List<ClientEntity> getSample() {

	        //return (ArrayList<ClientEntity>) cr.getjoin(2);
	        return cr.getjoin(3);
	    }
		
		@GetMapping("/client_discount/{ten}/{premium}")
	    public int discount(@PathVariable String ten, @PathVariable int premium) {
	            
	            final String type1="greaterthan5";
	            final String type2="equalthan5";
	            final String type3="lessthan5";
	            
	            final int percentage=12;
	            final int percentag=10;
	            int a=0;
	        
	                    if (ten.equals(type1))
	                       {
	                            
	                            a=(premium*percentage)/100;
	                            premium=premium-a;
	                            return premium;
	                       }
	                    if (ten.equals(type2))
	                       {
	                            a=(premium*percentag)/100;
	                            premium=premium-a;
	                            return premium;
	                       }
	                    else if (ten.equals(type3)) 
	                        {
	                            return premium;
	                        }
	            return 0;
		}


}
