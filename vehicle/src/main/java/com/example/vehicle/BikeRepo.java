package com.example.vehicle;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BikeRepo extends CrudRepository<BikeEntity,Integer>{
	
	@Query(value="SELECT * from car c JOIN bike b ON c.car_nooftyres=b.bike_nooftyres group by car_name;",nativeQuery=true)
	public List<BikeEntity> getjoin1();
}
