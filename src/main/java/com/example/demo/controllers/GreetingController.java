package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.handlers.Greeting;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private int counter = 0;

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		counter++;
		return new Greeting(counter, String.format(template, name));
	}
}
