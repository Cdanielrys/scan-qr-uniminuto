package intranet.controller;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import groovyjarjarpicocli.CommandLine.Model;
import intranet.model.CasaUniminuto;
import intranet.service.CasaUniminutoService;

@Controller
@RequestMapping("/casa-uniminuto")
public class CasaUniminutoController {
	
	@Autowired
	private CasaUniminutoService service;
	
	@PostMapping("/addEncuestaCU")
	public String addPorcentajeCasaUniminuto(@ModelAttribute(name="casa") CasaUniminuto casa) {
		if (casa != null) {
			String casauni="1";
			casa.setNombre(casauni);
			System.out.println("Parameters ( "+ casa.getNombre() +" - " + casa.getPorcentaje() + " )");
			service.addClientes(casa);
			System.out.println("Despues service ( "+ casa.getNombre() +" - " + casa.getPorcentaje() + " )");
			service.addClientes(casa);			
		}else {
			
		}
		return "redirect:/casa-uniminuto/option";
	}
	
	@GetMapping("/option") 
	public String verQuejas(Model model) {
//			model.addAttribute("userSkillnet", new UserCredential());
//			model.addAttribute("error", error);
//			model.addAttribute("logout", logout);
		return "SCANQR/opciones";
	}
	
}
