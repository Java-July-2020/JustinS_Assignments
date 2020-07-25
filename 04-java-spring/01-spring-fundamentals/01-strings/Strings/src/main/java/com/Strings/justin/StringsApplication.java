package com.Strings.justin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsApplication.class, args);
		
	}
	@RequestMapping("/")
	public String hello() {
		return "Hello Stranger :)";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "What are you doing here? What am I doing here?";
	}
}
