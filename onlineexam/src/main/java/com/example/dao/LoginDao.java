package com.example.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Users;

@Repository
public class LoginDao {

	@Autowired
	SessionFactory factory;

	public Users getUser(String username) {
		Session session = factory.openSession();

		Users users = null;

		users = session.get(Users.class, username);

		return users;

	}
}
