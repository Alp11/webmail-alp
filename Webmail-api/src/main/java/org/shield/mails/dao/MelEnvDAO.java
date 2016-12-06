package org.shield.mails.dao;

import java.util.List;

import org.shield.mails.model.Mel;

public interface MelEnvDAO {
	
	public Mel getById(int id);
	
	public void save(Mel mail);
	
	public void delete(Integer mel);

	public List<Mel> findAll();

}
