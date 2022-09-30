package com.prova.prova.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prova")
public class IndexController {
	
	@GetMapping("index")
	public String homePage() {
		return "index";
	}
}
