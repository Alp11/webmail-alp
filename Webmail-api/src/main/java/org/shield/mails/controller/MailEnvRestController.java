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
	private MelRecService melService;
		
	@RequestMapping(method=RequestMethod.GET)
	public List<Mel> listMels(){
		return melService.findAll();
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public Mel getMel(@PathVariable("id") Integer id){
		return melService.getMel(id);
	}
	
	//@RequestMapping(value="power/{sup}", method=RequestMethod.GET)
	//public  List<Mel> getMelsWithPOWER(@PathVariable("sup") Integer sup){
	//	return melService.findAll().stream().filter(a -> a.getPower() >= sup).collect(Collectors.toList());
	//}
		
	@RequestMapping(method=RequestMethod.POST)
	public void add(@RequestBody Mel mel){
		melService.save(mel);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.PUT)
	public void updateMel(@PathVariable("id") Integer id, @RequestBody Mel mel){
		mel.setId(id);
		 melService.save(mel);
	}
		
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public void deleteMel(@PathVariable("id") Integer id){
		melService.delete(id);
	}
		
}
