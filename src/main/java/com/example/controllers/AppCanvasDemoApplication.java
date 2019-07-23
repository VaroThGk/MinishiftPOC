package com.example.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Client;

@SpringBootApplication
@RestController
public class AppCanvasDemoApplication {

	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to The AppCanvas Demo";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		System.out.println("Hi " + input);
		return "Hi " + input + " your application deployed sucessfully!";
	}
	
	@GetMapping("/greet")	
	public Client greet(@RequestParam(value = "name",
	defaultValue = "Robot") String name) {
		Client response = new Client();
		response.setId(1);
		response.setName(name);
		response.setMessage("Hi "+ name + ". This is sample response using Experian AppCanvas");
		return response;

	}
	
	public static void main(String[] args) {
		SpringApplication.run(AppCanvasDemoApplication.class, args);
	}

}
