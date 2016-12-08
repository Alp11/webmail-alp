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
public class MelDAOImpl implements MelEnvDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public MelEnv getById(int id) {
		MelEnv mailEnv = entityManager.find(MelEnv.class, id);
		return mailEnv;
	}

	public void saveEnv(MelEnv mailEnv) {
		entityManager.merge(mailEnv);
	}

	public void deleteEnv(Integer id) {
		MelEnv attached = entityManager.find(MelEnv.class, id);
		entityManager.remove(attached);
		
	}

	public List<MelEnv> findAll() {
		String query = "SELECT melEnv FROM MelEnvoye melEnv";
		String sql = "select * from MelEnvoye";
		List<MelEnv> list  = (List<MelEnv>) entityManager.createQuery(query).getResultList();
		
		return list;
	}
	

}


@Component("melRecDAO")
@Transactional
public class MelRecDAOImpl implements MelDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public Mel getById(int id) {
		MelRec mailRec = entityManager.find(MelRec.class, id);
		return mailRec;
	}

	public void save(MelRec mailRec) {
		entityManager.merge(mailRec);
	}

	public void delete(Integer id) {
		MelRec attached = entityManager.find(MelRec.class, id);
		entityManager.remove(attached);
		
	}

	public List<Mel> findAll() {
		String query = "SELECT melRec FROM MelRec melRec";
		String sql = "select * from melRec";
		List<Mel> list  = (List<Mel>) entityManager.createQuery(query).getResultList();
		
		return list;
	}

}
