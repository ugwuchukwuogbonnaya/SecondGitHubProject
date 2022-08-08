package com.casmir.org.admincontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/home")
	public String home() {
		
		return "Welcome to ADMIN HOME PAGE";
	}

	
}
