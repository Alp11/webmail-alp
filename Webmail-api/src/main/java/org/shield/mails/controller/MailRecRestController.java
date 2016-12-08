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
@RequestMapping("/rest/mailRec")
public class MailRecRestController {

	@Autowired
	private MelRecService melRecService;
		
	@RequestMapping(method=RequestMethod.GET)
	public List<MelRec> listMelRec(){
		return melRecService.findAll();
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.GET)
	public MelRec getMelRec(@PathVariable("id") Integer id){
		return melRecService.getMelRec(id);
	}
	
	//@RequestMapping(value="power/{sup}", method=RequestMethod.GET)
	//public  List<Mel> getMelsWithPOWER(@PathVariable("sup") Integer sup){
	//	return melService.findAll().stream().filter(a -> a.getPower() >= sup).collect(Collectors.toList());
	//}
		
	@RequestMapping(method=RequestMethod.POST)
	public void addRec(@RequestBody MelRec melRec){
		melRecService.save(melRec);
	}
	
	@RequestMapping(value="{id}", method=RequestMethod.PUT)
	public void updateMelRec(@PathVariable("id") Integer id, @RequestBody MelRec melRec){
		melRec.setId(id);
		 melRecService.save(melRec);
	}
		
	@RequestMapping(value="{id}", method=RequestMethod.DELETE)
	public void deleteMelRec(@PathVariable("id") Integer id){
		melRecService.delete(id);
	}
		
}
