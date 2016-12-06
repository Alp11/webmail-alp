package org.shield.mails.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.shield.mails.dao.UserDAO;
import org.shield.mails.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("userDao")
@Transactional
public class UserDAOImpl implements UserDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public User getById(int id) {
		User user = entityManager.find(User.class, id);
		return user;
	}

}
