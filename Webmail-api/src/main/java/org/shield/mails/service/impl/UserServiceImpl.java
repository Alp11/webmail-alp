package org.shield.mails.service.impl;

import org.shield.mails.dao.UserDAO;
import org.shield.mails.model.User;
import org.shield.mails.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	public User getUser(int id) {
		return userDAO.getById(id);
	}

}
