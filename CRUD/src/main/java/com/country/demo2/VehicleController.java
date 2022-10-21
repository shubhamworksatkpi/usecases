package com.country.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class VehicleController {
		
		
		@Autowired
		private CarRepo car;
		
		@GetMapping("/car")
		public List<CarEntity> joincar(){
			return car.getjoin();
					}
		@Autowired
		private BikeRepo bike;
		@GetMapping("/bike")
		public List<BikeEntity> joinbike(){
			return bike.getjoin1();
		}
		@Autowired
		private TruckRepo truck;
		@GetMapping("/truck")
		public List<TruckEntity> jointruck(){
			return truck.getjoin2();
		
	}


	}
	



