package com.spring.assgmnt1.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.assgmnt1.entity.User;
import com.spring.assgmnt1.entity.UserBook;
import com.spring.assgmnt1.service.UserBookService;


@Controller
public class UserBookController {
	
	@Autowired
	private UserBookService userbookservice;
	
	@GetMapping("readlater")
	public String readlater(Map<String, List<UserBook>> map, HttpSession session) {
		User user = (User) session.getAttribute("user");
		List<UserBook> userbook = userbookservice.getUserBookbyReadLater(user, true);
		map.put("userbook", userbook);
		return "readlater";
	}
	
	@GetMapping("like")
	public String liked(Map<String, List<UserBook>> map, HttpSession session) {
		User user = (User) session.getAttribute("user");
		List<UserBook> userbook = userbookservice.getUserBookbyliked(user, true);
		map.put("userbook", userbook);
		return "liked";
	}
	
	
	
}
