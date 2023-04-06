package com.spring.assgmnt1.service;

import org.hibernate.sql.ordering.antlr.Factory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.assgmnt1.database.UserDatabase;
import com.spring.assgmnt1.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserDatabase userdb;
	
	public User getUserbyEmail(String email) throws Exception{
		try {
			User user = userdb.getUserByEmail(email);
			return user;
		} catch(Exception e) {
			throw new Exception("Invalid credentials!");
		}
	}
	
	public boolean validateUser(User user, String password) throws Exception {
		try {
			if(user.getPassword().equals(password)) {
				return true;
			}
		}catch(Exception e){
			throw new Exception("Invalid credentials!");
		}
		
		return false;
	}
	
	public void insertUser(User user) throws Exception {
		try {
			userdb.insertUser(user);
		}catch(Exception e) {
			throw new Exception(e.getMessage());
		}
	}
	
}
