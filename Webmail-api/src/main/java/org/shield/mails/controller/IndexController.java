package org.shield.mails.controller;

import java.io.IOException;
import java.util.List;

import org.shield.mails.service.MelRecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

	@RequestMapping(method=RequestMethod.GET)
	public String index() {
		return "index3";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String indexPost() {
		return "index2";
	}
}


@RequestMapping("/mailEnv")
public class MailEnvController {

	@Autowired
	private MelEnvService melEnvService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("mailEnv/index");
		//Get List mails
		List<MelEnv> listMelEnv = melEnvService.findAll();
		mv.addObject("size", listMelEnv.size());
		mv.addObject("list", listMelEnv);
		return mv;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addNouveauMail(@RequestParam(value="lastName") String lastName) {
			MelNouv melnouv = new MelNouv();
		
		melEnv.setLastName(lastName);
		melEnvService.save(melEnv);
		
		return "redirect:/app/mail/";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addMailFormulaire() {
		return "mail/addUser-form";
	}
	
	@RequestMapping(value="/{id}/delete", method=RequestMethod.POST)
	public String delete(@PathVariable("id") Integer id) {
		melEnvService.delete(id);
		return "redirect:/app/mail/";
	}
	
	@RequestMapping(value="/{id}/uploadPhoto", method=RequestMethod.GET)
	public ModelAndView uploadPhoto(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView("mail/upload-form-mail");
		mv.addObject("id", id);
		return mv;
	}
	
	@RequestMapping(value="/{id}/uploadPhoto", method=RequestMethod.POST)
	public String uploadPhoto(MultipartFile file, @PathVariable("id") Integer idParam) {
		try {
			byte[] bytes = file.getBytes();
		     MelEnv melEnv = melEnvService.getMelEnv(idParam);
		     melEnv.setPhoto(bytes);
		     melEnvService.save(melEnv);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/app/mail/";
	}

}


@RequestMapping("/mailRec")
public class MailRecController {

	@Autowired
	private MelRecService melRecService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("mail/index");
		//Get List mails
		List<MelRec> listMels = melRecService.findAll();
		mv.addObject("size", listMelRec.size());
		mv.addObject("list", listMelRec);
		return mv;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addMelRec(@RequestParam(value="lastName") String lastName) {
			MelRec melRec = new MelRec();
		
		melRec.setLastName(lastName);
		melRecService.save(melRec);
		
		return "redirect:/app/mail/";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addMailFormulaire() {
		return "mail/addUser-form";
	}
	
	@RequestMapping(value="/{id}/delete", method=RequestMethod.POST)
	public String delete(@PathVariable("id") Integer id) {
		melService.delete(id);
		return "redirect:/app/mail/";
	}
	
	@RequestMapping(value="/{id}/uploadPhoto", method=RequestMethod.GET)
	public ModelAndView uploadPhoto(@PathVariable("id") Integer id) {
		ModelAndView mv = new ModelAndView("mail/upload-form");
		mv.addObject("id", id);
		return mv;
	}
	
	@RequestMapping(value="/{id}/uploadPhoto", method=RequestMethod.POST)
	public String uploadPhoto(MultipartFile file, @PathVariable("id") Integer idParam) {
		try {
			byte[] bytes = file.getBytes();
		     Mel mel = melService.getMel(idParam);
		     mel.setPhoto(bytes);
		     melService.save(mel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/app/mail/";
	}
	
	
	
}