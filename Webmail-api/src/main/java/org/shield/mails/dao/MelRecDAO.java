package org.shield.mails.dao;

import java.util.List;

import org.shield.mails.model.Mel;

public interface MelRecDAO {
	
	public Mel getById(int id);
	
	public void save(Mel mail);
	
	public void delete(Integer mel);

	public List<Mel> findAll();

}
