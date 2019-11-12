package intranet.controller;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import intranet.converter.ClientesConverter;
import intranet.model.Clientes;
import intranet.model.Contratos;
import intranet.service.ClientesService;
import intranet.service.ContratosService;

//@Controller
//@RequestMapping("/clientes")
public class ClientesController {
	
//	@Autowired
//	@Qualifier("clienteService")
//	private ClientesService clientesService;
//	
//	@Autowired
//	@Qualifier("contratosService")
//	private ContratosService contratosService;
//	
//	@GetMapping("/verclientes")
//	public String getAll(Model model, @RequestParam(name="error", required=false) String error) {
//		model.addAttribute("error", error);
//		model.addAttribute("clientes", clientesService.findAllProducts());
//		return "clientes/ListaClientes";
//	}
//	
//	@GetMapping("/verclienteUsers")
//	public String getAllUSer(Model model) {
////		model.addAttribute("clientes", clientesService.findAllProducts());
//		return "clientesUsers";
//	}
//	
//	@GetMapping("/clientesform")
//	public String RedirectClienteForm(Model model) {
//		Clientes cliente = new Clientes();
//		model.addAttribute("cliente", cliente);
//		return "clientes/FormularioIngresoCliente";
//	}
//	
//	@GetMapping("/clientesEdit")
//	public String RedirectEditForm(@RequestParam(name="nit", required = false) int nit, Model model) {
//		ClientesConverter cliente = new ClientesConverter();
//		if (nit != 0) {
//			cliente = clientesService.findClientesById(nit);
//		}
//		model.addAttribute("cliente", cliente);
//		return "clientes/FormularioIngresoCliente";
//	}
//	
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
//
//		return "redirect:/clientes/verclientes";
//	}
//	
//	@GetMapping("/removecliente")
//	public String removeCliente(@RequestParam(name="nit",required=false )int nit) {
//		
//		ArrayList<Contratos> contrato = new ArrayList<Contratos>();
//		contrato = contratosService.findContratosById(nit);
//		if(contrato.size()==0) {
//			clientesService.removeClientes(nit);
//		}else {
//			return "redirect:/clientes/verclientes?error";
//		}
//
//		return "redirect:/clientes/verclientes";
//	}
//	
//	@GetMapping("/buscar")
//	public String getPorNombre(@RequestParam("razon_social") String razon_social, Model model ) {
//		if(razon_social!="") {
//			model.addAttribute("clientes", clientesService.findClienteByNombre(razon_social));
//			return "clientes/ListaClientes";
//		}else {
//			return "redirect:/clientes/vercliente";
//		}
//	}
	
}