package org.shield.mails.service;

import java.util.List;

import org.shield.mails.model.Mel;

public interface MelEnvService {
	
	public MelEnv getMelEnv(int id);
	
	public void saveEnv(MelEnv melEnv);
	
	public void deleteEnv(Integer id);

	public List<MelEnv> findAll();

}

