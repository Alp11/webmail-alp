package org.shield.mails.dao;

import java.util.List;

import org.shield.mails.model.Mel;

public interface MelEnvDAO {
	
	public MelEnv getById(int id);
	
	public void saveEnv(MelEnv mailEnv);
	
	public void deleteEnv(Integer melEnv);

	public List<MelEnv> findAll();

}
