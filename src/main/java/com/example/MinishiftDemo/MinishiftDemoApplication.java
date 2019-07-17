package com.example.MinishiftDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MinishiftDemoApplication {

	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to Minishift Demo";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		System.out.println("Hi " + input);
		return "Hi test " + input + " your application deployed sucessfully!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MinishiftDemoApplication.class, args);
	}

}
