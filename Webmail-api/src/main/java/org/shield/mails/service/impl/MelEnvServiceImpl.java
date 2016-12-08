package org.shield.mails.service.impl;

import java.util.List;

import org.shield.mails.dao.UserDAO;
import org.shield.mails.dao.MelEnvDAO;
import org.shield.mails.model.User;
import org.shield.mails.model.Mel;
import org.shield.mails.service.MelRecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("melEnvService")
public class MelEnvServiceImpl implements MelEnvService {
	
	@Autowired
	private MelEnvDAO melEnvdao;
	
	@Autowired
	private UserDAO userDAO;

	public Mel getMelEnv(int id) {
		return melEnvdao.getById(id);
	}

	public void saveEnv(MelEnv melEnv) {
		User user = userDAO.getById(10);
		//mel.setUser(user);
		melEnvdao.save(melEnv);
	}

	public void deleteEnv(Integer id) {
		melEnvdao.delete(id);
	}

	public List<MelEnv> findAll() {
		return melEnvdao.findAll();
	}

}
