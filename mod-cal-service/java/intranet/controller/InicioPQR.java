package intranet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import groovyjarjarpicocli.CommandLine.Model;

@Controller
@RequestMapping("inicio")
public class InicioPQR {
	

	@GetMapping("/opciones") 
	public String verQuejas(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "PQR/inicioEstudiantes";
	}
}
