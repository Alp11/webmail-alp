package org.shield.mails;

import org.shield.mails.model.User;
import org.shield.mails.model.Mel;
import org.shield.mails.service.UserService;
import org.shield.mails.service.MelRecService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {	
		
		ApplicationContext appContext = 
	    		new ClassPathXmlApplicationContext("spring/config/application-context.xml");
			
		MelRec melRec = new MelRec();
		melRec.setLastName("STARK");
		
		MelRecService melRecService = (MelRecService) appContext.getBean("melRecService");
		
		UserService userService = (UserService) appContext.getBean("userService");
		
		
		//melService.save(mel);
		User userFury = userService.getUser(10);
		
		System.out.println("Nom : "+userFury.getLastName());
		
		System.out.println("Liste des mels : ");
		
		for(MelRec mel1 : userFury.getMelRec()) {
			System.out.println("----- " + mel1.getAlias());
		}
		
		MelRec melRecToDelete = melRecService.getMelRec(70);
		
		melRecService.delete(melRecToDelete.getId());
		
	}

}
