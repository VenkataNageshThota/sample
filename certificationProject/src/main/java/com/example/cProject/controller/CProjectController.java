package com.example.cProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cproject")
public class CProjectController {

	@GetMapping("/")
	public String getMapping() {
		System.out.println("hello");
		String sts="sample project";
		return sts;
	}
}
