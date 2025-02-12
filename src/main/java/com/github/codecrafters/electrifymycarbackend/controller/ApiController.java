package com.github.codecrafters.electrifymycarbackend.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/")
public class ApiController {
	
	
	
	//quick setup test
	@GetMapping("hello/{name}")
	public ResponseEntity<Map<String, String>> hello(@PathVariable String name, @RequestParam(required = false, defaultValue="Hi there!") String message) {
		
		return ResponseEntity.ok(Map.of(
				"name", name, "message", message));
		
	}

}
