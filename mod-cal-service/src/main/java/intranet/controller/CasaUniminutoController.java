package intranet.controller;

import javax.sound.midi.Soundbank;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import groovyjarjarpicocli.CommandLine.Model;
import intranet.model.CasaUniminuto;

@Controller
@RequestMapping("/casa-uniminuto")
public class CasaUniminutoController {
	
	@PostMapping("/addEncuestaCU")
	public String addPorcentajeCasaUniminuto(@ModelAttribute(name="casa") CasaUniminuto casa) {
		if (casa != null) {
			String casauni="";
			casa.setNombre(casauni);
			System.out.println("el objeto no es null");
			System.out.println(casa.toString());
			System.out.println("datos=" + casa.getPorcentaje()+"="+"="+casa.getNombre() );
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
	
	
//	@GetMapping("/addCliente")
//	public String addCliente(@ModelAttribute(name="cliente") Clientes cliente, Model model) {
//
//		if (clientesService.findClientesById(cliente.getNit()).getNit()!=cliente.getNit() || 0==cliente.getNit() ) {
//			
//			if (null != clientesService.addClientes(cliente)) {	
//				model.addAttribute("resul", 1);
//			} else {
//				model.addAttribute("resul", 0);
//			}
//		} else {
//			if (null != clientesService.updateClientes(cliente)) {
//				
//				model.addAttribute("resul", 1);
//			} else {
//				model.addAttribute("resul", 0);
//			}
//		}
}
