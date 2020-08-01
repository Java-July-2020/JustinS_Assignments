package com.dojosurvey.justin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SurveyController {
		
	@RequestMapping("/")
	public String survey() {
	
		return "index.jsp";
	}
	
	@RequestMapping(path="/results", method=RequestMethod.POST)
	public String results(@RequestParam(value="name") String name, @RequestParam(value="location") String location, @RequestParam(value="language") String language, @RequestParam(value="comments") String comments, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", location);
		model.addAttribute("comments", comments);
		return "results.jsp";
	}
	
}
