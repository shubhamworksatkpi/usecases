package com.country.demo2;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface CarRepo extends CrudRepository<CarEntity,Integer>{
	
	@Query(value="SELECT * from car c JOIN truck t ON c.car_nooftyres=t.truck_nooftyres;",nativeQuery=true)
	public List<CarEntity> getjoin();

}
