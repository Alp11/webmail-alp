package org.shield.mails.service;

import java.util.List;

import org.shield.mails.model.Mel;

public interface MelRecService {
	
	public MelRec getMelRec(int id);
	
	public void saveRec(MelRec melRec);
	
	public void deleteRec(Integer id);

	public List<MelRec> findAll();

}

