package com.driversliscense.justin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.driversliscense.justin.models.License;
import com.driversliscense.justin.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository lRepo;
	
	public List<License> allLicense(){
		return lRepo.findAll();
	}
	
	public License findLicense(Long id) {
		return lRepo.findById(id).orElse(null);
	}
	
	public License createLicense(License license) {
		return lRepo.save(license);
	}
	
	
}
