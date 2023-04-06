package com.spring.assgmnt1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.assgmnt1.database.UserbookDatabase;
import com.spring.assgmnt1.entity.User;
import com.spring.assgmnt1.entity.UserBook;

@Controller
public class UserController {
	@Autowired
	private UserbookDatabase db;
	
	@GetMapping("/Get")
	public void getall() {

	}
	
}
 