package com.spring.assgmnt1.database;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.assgmnt1.entity.User;
import com.spring.assgmnt1.entity.UserBook;

@Repository
public class UserbookDatabase {
	
	@Autowired
	private SessionFactory factory;
	
	public List<UserBook> getUserBookbyReadLater(User user, boolean readlater){
		Session session = factory.openSession();
		String hqlQuery = "FROM UserBook WHERE userId = :userid AND readLater = :readlater";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("userid", user);
		query.setParameter("readlater", readlater);
		List<UserBook> resultList = query.list();
		session.close();
		return resultList;
	}
	
	public List<UserBook> getUserBookbyliked(User user, boolean like){
		Session session = factory.openSession();
		String hqlQuery = "FROM UserBook WHERE userId = :userid AND liked = :like";
		Query query = session.createQuery(hqlQuery);
		query.setParameter("userid", user);
		query.setParameter("like", like);
		List<UserBook> resultList = query.list();
		session.close();
		return resultList;
	}
	
	public void insertUserbook(UserBook userbook) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(userbook);
		tx.commit();
		session.close();
	}
	
	public UserBook getUserBookById(int id) {
		Session session = factory.openSession();
		UserBook userbook = session.get(UserBook.class, id);
		session.close();
		return userbook;
	}
	
	public void deleteUserBook(UserBook userbook) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.remove(userbook);
		tx.commit();
		session.close();
	}
	
}
