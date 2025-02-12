package com.github.codecrafters.electrifymycarbackend.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;




	@RestController
	public class StaticFileController {

	    @GetMapping("/")
	    public ResponseEntity<Resource> serveFile() {
	        Resource resource = new ClassPathResource("static/index.html");
	        return ResponseEntity.ok()
	                .contentType(MediaType.TEXT_HTML)
	                .body(resource);
	    }
	}


