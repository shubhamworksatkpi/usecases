package com.kpi.microservicecurrencyexchangeexample.microservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController  
public class CurrencyConversionController {
    
      
    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable Double quantity) {
 
    	String currency1 = "DOLLAR";
    	String currency2 = "RUPEE";
    	String currency3 = "DIRHAM";
    	String currency4 = "EURO";
    	String currency5 = "POUND";
    	
    	double per=0;
    	double mul=0;
    	
    	
//DOLLAR
    	
    	if (from.equals(currency1))
		  {
			  if (to.equals(currency1)) 
			  {
				 mul=1;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2)) 
			  {
				 mul=82.33;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=0.99;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=3.67;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.86;
				  per=quantity*mul;
			  }
		  }
    	
    	
//RUPEE
    	
    	if (from.equals(currency2))
		  {
			  if (to.equals(currency1)) 
			  {
				 mul=0.012;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2)) 
			  {
				 mul=1;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=0.045;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=0.012;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.010;
				  per=quantity*mul;
			  }
		  }
    	
    	
  //DIRHAM
    	
    	if (from.equals(currency3))
		  {
			  if (to.equals(currency1)) 
			  {
				 mul=0.27;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2)) 
			  {
				 mul=22.41;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=1;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=0.27;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.23;
				  per=quantity*mul;
			  }
		  }
    	
    	
//EURO
    	
    	if (from.equals(currency4))
		  {
			  if (to.equals(currency1)) 
			  {
				 mul=1.01;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2)) 
			  {
				 mul=82.87;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=3.70;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=1;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.87;
				  per=quantity*mul;
			  }
		  }
  	
//POUND
    	
    	if (from.equals(currency5))
		  {
			  if (to.equals(currency1)) 
			  {
				 mul=1.16;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2)) 
			  {
				 mul=95.45;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=4.26;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=1.15;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=1;
				  per=quantity*mul;
			  }
		  }

    	
    	
        return new CurrencyConversionBean(1L, from,to,mul, quantity,per,0 );  
} 
}
