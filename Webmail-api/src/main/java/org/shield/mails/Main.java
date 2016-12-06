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
			
		Mel mel = new Mel();
		mel.setLastName("STARK");
		
		MelRecService melService = (MelRecService) appContext.getBean("melService");
		
		UserService userService = (UserService) appContext.getBean("userService");
		
		
		//melService.save(mel);
		User userFury = userService.getUser(10);
		
		System.out.println("Nom : "+userFury.getLastName());
		
		System.out.println("Liste des mels : ");
		
		for(Mel mel1 : userFury.getMels()) {
			System.out.println("----- " + mel1.getAlias());
		}
		
		Mel melToDelete = melService.getMel(70);
		
		melService.delete(melToDelete.getId());
		
		
		
		
	}

}
