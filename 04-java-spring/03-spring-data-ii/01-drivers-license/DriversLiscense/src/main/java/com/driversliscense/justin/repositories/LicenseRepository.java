package com.driversliscense.justin.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.driversliscense.justin.models.License;

public interface LicenseRepository extends CrudRepository<License, Long> {
	List<License> findAll();
	
}
