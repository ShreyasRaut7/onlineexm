package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.LoginDao;
import com.example.entity.Users;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDAO;

	public boolean validate(String username, String password) {
		Users users = loginDAO.getUser(username);

		if (users == null) {
			return false;
		}

		else if (username.equals(users.getUsername()) && password.equals(users.getPassword())) {

			return true;

		}

		else {
			return false;
		}
	}

}
