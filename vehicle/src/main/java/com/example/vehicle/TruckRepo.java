package com.example.vehicle;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface TruckRepo extends CrudRepository<TruckEntity,Integer>{
	
	@Query(value="SELECT * from car c JOIN truck t ON c.car_nooftyres=t.truck_nooftyres;",nativeQuery=true)
	public List<TruckEntity> getjoin2();

}
