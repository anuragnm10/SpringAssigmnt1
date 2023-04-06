package com.spring.assgmnt1.database;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.assgmnt1.entity.Book;

@Repository
public class BookDatabase {
	@Autowired
	private SessionFactory factory;
	
	public List<Book> getAllBooks(){
		Session session = factory.openSession();
		List<Book> books = session.createQuery("from Book", Book.class).getResultList();
		session.close();
		return books;
	}
	
	
	public Book getBookById(int id) {
		Session session = factory.openSession();
		Book book = session.get(Book.class, id);
		session.close();
		return book;
	}
	
	
	
}
