package intranet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import groovyjarjarpicocli.CommandLine.Model;

@Controller
public class loginPQR {
	
	@GetMapping("/login") 
	public String verLogin(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "login";
	}
	
	@GetMapping("/opciones") 
	public String verQuejas(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "PQR/opciones";
	}
	
	
	
	
	
	
	
	@GetMapping("/reclamos") 
	public String verReclamos(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "PQR/inicioPqr";
	}
	


	
	
	
	@GetMapping("/formuQuejas") 
	public String verInicio(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "PQR/formQuejas";
	}
	
	@GetMapping("/formuQue") 
	public String verInico(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "PQR/formQuejas";
	}
	
	
	
	
}
