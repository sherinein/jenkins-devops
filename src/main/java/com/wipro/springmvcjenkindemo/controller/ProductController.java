package com.wipro.springmvcjenkindemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/liveness")
	public String getApplicationLiveness() {
		return "Project is running...";
	}
}
