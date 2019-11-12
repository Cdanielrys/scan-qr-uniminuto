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
	
	
	@GetMapping("/Inicio") 
	public String verInicio(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "Inicio";
	}
	
	
	@GetMapping("/reclamos") 
	public String verReclamos(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "PQR/inicioPqr";
	}
	
	
	@GetMapping("/opciones") 
	public String verQuejas(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "SCANQR/opciones";
	}
	
	@GetMapping("/form_calificadores") 
	public String verQue(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "SCANQR/calificadores";
	}
	@GetMapping("/forQuejas") 
	public String verQ(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "PQR/formQuejas";
	}
	
	@GetMapping("/formreclamos") 
	public String verR(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "PQR/formReclamos";
	}
	

	
	
}
