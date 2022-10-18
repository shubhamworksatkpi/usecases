package com.country.demo2;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<StudentEntity,Integer> {

}
