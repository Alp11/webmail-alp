package org.shield.mails.controller;

import java.io.IOException;
import java.util.List;

import org.shield.mails.model.Mel;
import org.shield.mails.service.MelRecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mail")
public class MailEnvController {

	@Autowired
	private MelEnvService melEnvService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("mail/index");
		//Get List mails
		List<Mel> listMels = melService.findAll();
		mv.addObject("size", listMels.size());
		mv.addObject("list", listMels);
		return mv;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addAvanger(@RequestParam(value="lastName") String lastName) {
			Mel mel = new Mel();
		
		mel.setLastName(lastName);
		melService.save(mel);
		
		return "redirect:/app/mail/";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String addMailFormulaire() {
		return "mail/add-form";
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
