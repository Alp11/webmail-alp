package org.shield.mails.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.shield.mails.model.Mel;
import org.shield.mails.service.MelRecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/mails")
public class MailEnvRestController {

	@Autowired
	private MelEnvService melEnvService;
		
	@RequestMapping(method=RequestMethod.GET)
	public List<MelEnv> listMelEnv(){
		return melEnvService.findAll();
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Mel getMelEnv(@PathVariable("id") Integer id){
		return melEnvService.getMelEnv(id);
	}
	
	//@RequestMapping(value="power/{sup}", method=RequestMethod.GET)
	//public  List<Mel> getMelsWithPOWER(@PathVariable("sup") Integer sup){
	//	return melService.findAll().stream().filter(a -> a.getPower() >= sup).collect(Collectors.toList());
	//}
		
	@RequestMapping(method=RequestMethod.POST)
	public void add(@RequestBody MelEnv melEnv){
		melEnvService.save(melEnv);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.PUT)
	public void updateMelEnv(@PathVariable("id") Integer id, @RequestBody MelEnv melEnv){
		melEnv.setId(id);
		 melEnvService.save(melEnv);
	}
		
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public void deleteMelEnv(@PathVariable("id") Integer id){
		melEnvService.delete(id);
	}
		
}
