package com.example.authenticationspring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpControllers {
    @GetMapping("/public")
		String publicRoute() {
			return "<h1> Public route<h1>";
		}
		@GetMapping("/private")
		String privateRoute() {
			return "<h1> Private route<h1>";
		}
}
