package com.gettingFamiliar.justin;

import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/coding")
public class CodingController {
	@RequestMapping("/")
	public String homePage() {
		return "This is the home page";
	}
	
	@RequestMapping("/")
	public String dojoPage() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/python")
	public String pythonPage() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/java")
	public String javaPage() {
		return "Java/Spring is better!";
	}
}
