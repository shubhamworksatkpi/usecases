package com.example.insurance;
	

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClientRepo extends JpaRepository<ClientEntity,Integer>{
		
	@Query(value="SELECT * from insurance_client i where i.id= ?1",nativeQuery=true)
	public List<ClientEntity> getjoin(Integer id);

}
