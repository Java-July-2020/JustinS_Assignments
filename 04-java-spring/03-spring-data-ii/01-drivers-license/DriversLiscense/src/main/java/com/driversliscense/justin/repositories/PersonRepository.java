package com.driversliscense.justin.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.driversliscense.justin.models.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {
	List<Person> findAll();
	
}
