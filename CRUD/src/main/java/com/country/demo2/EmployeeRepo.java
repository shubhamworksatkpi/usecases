package com.country.demo2;

import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepo extends CrudRepository<EmployeeEntity,Integer>
{

}
