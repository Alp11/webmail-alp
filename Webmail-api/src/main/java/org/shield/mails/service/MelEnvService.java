package org.shield.mails.service;

import java.util.List;

import org.shield.mails.model.Mel;

public interface MelEnvService {
	
	public Mel getMel(int id);
	
	public void save(Mel mel);
	
	public void delete(Integer id);

	public List<Mel> findAll();

}
