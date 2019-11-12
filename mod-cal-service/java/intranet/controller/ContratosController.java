package intranet.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import intranet.converter.ClientesConverter;
import intranet.converter.ContratosConverter;
import intranet.model.Contratos;
import intranet.service.ClientesService;
import intranet.service.ContratosService;

//@Controller
//@RequestMapping("/contratos")
public class ContratosController {

//	@Autowired
//	@Qualifier("clienteService")
//	private ClientesService clientesService;
//	
//	@Autowired
//	@Qualifier("contratosService")
//	private ContratosService contratosService;
//	
//	@GetMapping("/cancel")
//	public String cancel(@RequestParam(name = "nit", required = false) int nit) {
//		return "redirect:/contratos/verContratoId?nit=" + nit;
//	}
//	
//	@GetMapping("/Vcontratos")
//	public String contratos(Model model) {
//		model.addAttribute("contratos", contratosService.findAllProducts());
//		return "contratos/ListaContratos";
//	}
//	
//	@GetMapping("/verContratoId")
//	public String RedirectContratoForm(@RequestParam(name = "clientes_nit", required = false) int clientes_nit, Model model,
//			@RequestParam(name="validacion", required=false) String validacion) {
//		ArrayList<Contratos> contrato = new ArrayList<Contratos>();
//		if (clientes_nit != 0) {
//			contrato = contratosService.findContratosById(clientes_nit);
//		}
//		model.addAttribute("validacion", validacion);
//		model.addAttribute("contratos", contrato);
//		return "contratos/ListaContratos";
//	}
//	
//	@GetMapping("/contratosform")
//	public String RedirectClienteForm(@RequestParam(name="error", required=false) String error,
//			@RequestParam(name="clientes_nit", required = false) int clientes_nit, Model model) {
//		Contratos contrato = new Contratos();
//		ClientesConverter cliente = new ClientesConverter();
//		if (clientes_nit != 0) {
//			cliente = clientesService.findClientesById(clientes_nit);
//			contrato.setClientes_nit(cliente.getNit());
//		}
//		model.addAttribute("error", error);
//		model.addAttribute("contratos", contrato);
//		return "contratos/FormularioIngresoContrato";
//	}
//	
//	@GetMapping("/addContrato")
//	public String addContrato(@ModelAttribute(name = "contratos") Contratos contrato, Model model) {
//		
//		if(contrato.getF_final().after(contrato.getF_inicio())) {
//			if (contratosService.findContratosByNit(contrato.getClientes_nit(),contrato.getId_contrato()).getId_contrato() != contrato.getId_contrato() || contrato.getId_contrato()==0) {
//				
//				if (null != contratosService.addContratos(contrato)) {
//					model.addAttribute("resul", 1);
//				} else {
//					model.addAttribute("resul", 0);
//				}
//			} else {
//				if (null != contratosService.updateContratos(contrato)) {
//					model.addAttribute("resul", 1);
//				} else {
//					model.addAttribute("resul", 0);
//				}
//			}
//			return "redirect:/contratos/verContratoId?clientes_nit=" + contrato.getClientes_nit() + "&validacion";
//		}else {
//			return "redirect:/contratos/contratosform?clientes_nit="+contrato.getClientes_nit()+"&error";
//		}
//	}
//	
//	@GetMapping("/buscar")
//	public String getPorNit(@RequestParam("clientes_nit") int clientes_nit, Model model ) {
//		if(clientes_nit!=0) {
//			model.addAttribute("contratos", contratosService.findContratosById(clientes_nit));
//			return "contratos/ListaContratos";
//		}else {
//			return "redirect:/contratos/Vcontratos";
//		}
//		
//	}
//	
//	@GetMapping("/removecontrato")
//	public String removeContrato(@RequestParam(name = "clientes_nit", required = false) int clientes_nit,
//			@RequestParam(name = "id_contrato", required = false) int id_contrato) {
//		contratosService.removeContratos(clientes_nit, id_contrato);
//		return "redirect:/contratos/verContratoId?clientes_nit=" + clientes_nit;
//	}
//	
//	@GetMapping("/contratoEdit")
//	public String RedirectEditFormnit(@RequestParam(name = "clientes_nit", required = false) int clientes_nit,
//			@RequestParam(name = "id_contrato", required = false) int id_contrato, Model model) {
//		ContratosConverter contrato = new ContratosConverter();
//		if (clientes_nit != 0) {
//			contrato = contratosService.findContratosByNit(clientes_nit,id_contrato);
//		}
//		model.addAttribute("contratos", contrato);
//		return "contratos/FormularioIngresoContrato";
//	}
	
}
