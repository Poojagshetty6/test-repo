package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloworldController {

	@GetMapping
	public ResponseEntity<String> hello() {
		return new ResponseEntity<>("Hello World", HttpStatus.OK);
	}
}
