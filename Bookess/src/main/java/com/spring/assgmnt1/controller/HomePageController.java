package com.spring.assgmnt1.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.spring.assgmnt1.entity.Book;
import com.spring.assgmnt1.service.BookService;

@Controller
public class HomePageController {
	
	@Autowired
	private BookService bookservice;
	
	@GetMapping("/homepage")
	public String homepageBooks(Map<String, List<Book>> map) {
		List<Book> books = bookservice.getAllBooks();
		map.put("books", books);
		return "showbooks";
	}
	
}
