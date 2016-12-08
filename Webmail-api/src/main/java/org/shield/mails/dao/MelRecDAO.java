package org.shield.mails.dao;

import java.util.List;

import org.shield.mails.model.Mel;

public interface MelRecDAO {
	
	public MelRec getById(int id);
	
	public void saveRec(MelRec mailRec);
	
	public void deleteRec(Integer melRec);

	public List<MelRec> findAll();

}