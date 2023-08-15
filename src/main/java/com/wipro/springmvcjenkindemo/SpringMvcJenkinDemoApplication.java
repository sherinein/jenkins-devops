package com.wipro.springmvcjenkindemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/api")
@SpringBootApplication
public class SpringMvcJenkinDemoApplication {

	public static void main(String[] args) {
		System.out.println("boot started ......");
		SpringApplication.run(SpringMvcJenkinDemoApplication.class, args);
	}
	@GetMapping
	public String welcomeMessage() {
		return "welcome";
	}

}
