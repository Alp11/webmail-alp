package org.shield.mails.service.impl;

import java.util.List;

import org.shield.mails.dao.UserDAO;
import org.shield.mails.dao.MelEnvDAO;
import org.shield.mails.model.User;
import org.shield.mails.model.Mel;
import org.shield.mails.service.MelRecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("melService")
public class MelEnvServiceImpl implements MelRecService {
	
	@Autowired
	private MelEnvDAO meldao;
	
	@Autowired
	private UserDAO userDAO;

	public Mel getMel(int id) {
		return meldao.getById(id);
	}

	public void save(Mel mel) {
		User user = userDAO.getById(10);
		//mel.setUser(user);
		meldao.save(mel);
	}

	public void delete(Integer id) {
		meldao.delete(id);
	}

	public List<Mel> findAll() {
		return meldao.findAll();
	}

}
