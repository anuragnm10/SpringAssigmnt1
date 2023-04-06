package com.spring.assgmnt1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.assgmnt1.database.UserbookDatabase;
import com.spring.assgmnt1.entity.User;
import com.spring.assgmnt1.entity.UserBook;

@Service
public class UserBookService {
	
	@Autowired
	private UserbookDatabase userbookdb;
	
	public void insertUserBook(UserBook userbook) throws Exception{
		try{
			userbookdb.insertUserbook(userbook);
		} catch( Exception e) {
			throw new Exception("Failed to add to read later");
		}
	}
	
	
	public List<UserBook> getUserBookbyReadLater(User user, boolean readlater){
		List<UserBook> userbooks = userbookdb.getUserBookbyReadLater(user, readlater);
		return userbooks;
	}
	
	public List<UserBook> getUserBookbyliked(User user, boolean like){
		List<UserBook> userbooks = userbookdb.getUserBookbyliked(user, like);
		return userbooks;
	}
	
	public UserBook getUserbookById(int id) {
		UserBook userbook = userbookdb.getUserBookById(id);
		return userbook;
	}
	
	public void deleteUserbook(int id) {
		UserBook userbook = getUserbookById(id);
		userbookdb.deleteUserBook(userbook);
	}
	
	
}
