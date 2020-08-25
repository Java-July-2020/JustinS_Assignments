package com.driversliscense.justin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.driversliscense.justin.models.Person;
import com.driversliscense.justin.repositories.PersonRepository;

@Service
public class PersonService {
	private PersonRepository pRepo;
	
	public List<Person> allPerson(){
		return pRepo.findAll();
	}
	
	public Person findPerson(Long id) {
		return pRepo.findById(id).orElse(null);
	}
	
	public Person createPerson(Person person) {
		return pRepo.save(person);
	}
	
	public List<Person> getUnlicensedPeople() {
		return pRepo.findByLicenseIdIsNull();
	}
	
}
