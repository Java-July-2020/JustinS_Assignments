package com.gettingFamiliar.justin;

import org.springframework.web.bind.annotation.RequestMapping;

public class DojoController {
	@RequestMapping(path="/dojo")
	public String dojo() {
		return "The dojo is awesome";
	}
	
	@RequestMapping(path="/dojo/burbank")
	public String burbank() {
		return "Burbank Dojo is located in Southern California";
	}
	
	@RequestMapping(path="/dojo/san-jose")
	public String sanjose() {
		return "San Jose is the headquarters";
	}
	

}
