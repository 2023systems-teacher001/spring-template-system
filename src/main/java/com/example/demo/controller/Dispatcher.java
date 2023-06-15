package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class Dispatcher {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/admin/login")
	public String showLoginAdmin(Model model) {
		model.addAttribute("role", 0);
		return "auth/index";
	}
	@GetMapping("/login")
	public String showLogin(Model model) {
		model.addAttribute("role", 1);
		return "auth/index";
	}
}
