package org.shield.mails.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.shield.mails.dao.MelEnvDAO;
import org.shield.mails.model.Mel;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component("melEnvDAO")
@Transactional
public class MelEnvDAOImpl implements MelEnvDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Mel getById(int id) {
		Mel mail = entityManager.find(Mel.class, id);
		return mail;
	}

	public void save(Mel mail) {
		entityManager.merge(mail);
	}

	public void delete(Integer id) {
		Mel attached = entityManager.find(Mel.class, id);
		entityManager.remove(attached);
		
	}

	public List<Mel> findAll() {
		String query = "SELECT mel FROM Mel mel";
		String sql = "select * from mel";
		List<Mel> list  = (List<Mel>) entityManager.createQuery(query).getResultList();
		
		return list;
	}
	
	

}
