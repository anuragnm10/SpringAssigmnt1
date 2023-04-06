package com.spring.assgmnt1.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.assgmnt1.entity.User;
import com.spring.assgmnt1.service.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService userservice;
	
	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@PostMapping("/loginpage")
	public String loginPost(@RequestParam String email, @RequestParam String password, HttpSession session) {
		try {
			User user = userservice.getUserbyEmail(email);
			if(userservice.validateUser(user, password)) {
				session.setAttribute("user", user);
				return "redirect:dashboard";
			}else {
				return "login";
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "login";
	}
	
	
	
}
