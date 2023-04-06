package com.spring.assgmnt1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.assgmnt1.database.BookDatabase;
import com.spring.assgmnt1.entity.Book;
@Service
public class BookService {
	@Autowired
	private BookDatabase bookdb;
	
	
	public List<Book> getAllBooks(){
		List<Book> books = bookdb.getAllBooks();
		return books;
	}
	
	public Book getBookById(int id) {
		Book book = bookdb.getBookById(id);
		return book;
	}
}
