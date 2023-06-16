package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.AuthEntity;
import com.example.demo.repository.AuthRepository;

@Controller
@RequestMapping("/app")
public class Dispatcher {
	
	@Autowired 
	AuthEntity authEntity;
	
	@Autowired
	AuthRepository authRepository;
	
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
	
	@PostMapping("/login")
	public String login(
			@RequestParam("email") String email,
			@RequestParam("password") String password,
			Model model) {
		
		// 認証エンティティを設定
		authEntity.setEmail(email);
		authEntity.setPasseord(password);
		
		
		
		return "";
	}
}
