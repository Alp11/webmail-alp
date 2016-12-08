package org.shield.mails.service.impl;

import java.util.List;

import org.shield.mails.dao.UserDAO;
import org.shield.mails.dao.MelEnvDAO;
import org.shield.mails.model.User;
import org.shield.mails.model.Mel;
import org.shield.mails.service.MelRecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("melRecService")
public class MelRecServiceImpl implements MelRecService {
	
	@Autowired
	private MelDAO meldao;
	
	@Autowired
	private UserDAO userDAO;

	public MelRec getMelRec(int id) {
		return melRecdao.getById(id);
	}

	public void save(MelRec melRec) {
		User user = userDAO.getById(10);
		//mel.setUser(user);
		melRecdao.save(melRec);
	}

	public void delete(Integer id) {
		melRecdao.delete(id);
	}

	public List<MelRec> findAll() {
		return melRecdao.findAll();
	}

}
