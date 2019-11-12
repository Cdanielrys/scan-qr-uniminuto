package intranet.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import intranet.converter.ClientesConverter;
import intranet.converter.LicenciasConverter;
import intranet.model.Licencias;
import intranet.service.ClientesService;
import intranet.service.LicenciasService;
//
//@Controller
//@RequestMapping("/licencias")
public class LicenciasController {
//
//	@Autowired
//	@Qualifier("clienteService")
//	private ClientesService clientesService;
//	
//	@Autowired
//	@Qualifier("licenciaService")
//	private LicenciasService licenciaService;
//	
//	@GetMapping("/cancel")
//	public String cancel(@RequestParam(name = "clientes_nit", required = false) int clientes_nit) {
//		return "redirect:/licencias/verLicenciaId?clientes_nit=" + clientes_nit;
//	}
//	
//	@GetMapping("/Vlicencias")
//	public String licencias(Model model) {
//		model.addAttribute("licencias", licenciaService.findAllProducts());
//		return "licencias/ListaLicencias";
//	}
//	
//	@GetMapping("/verLicenciaId")
//	public String RedirectLicenciaForm(@RequestParam(name = "clientes_nit", required = false) int clientes_nit, Model model) {
//		ArrayList<Licencias> licencia = new ArrayList<Licencias>();
//		if (clientes_nit != 0) {
//			licencia = licenciaService.findLicenciasById(clientes_nit);
//		}
//		model.addAttribute("licencias", licencia);
//		return "licencias/ListaLicencias";
//	}
//	
//	@GetMapping("/licenciasform")
//	public String RedirectClienteForm(@RequestParam(name="clientes_nit", required = false) int clientes_nit, Model model) {
//		Licencias licencia = new Licencias();
//		ClientesConverter cliente = new ClientesConverter();
//		if (clientes_nit != 0) {
//			cliente = clientesService.findClientesById(clientes_nit);
//			licencia.setClientes_nit(cliente.getNit());
//		}
//		model.addAttribute("licencias", licencia);
//		return "licencias/FormularioIngresoLicencia";
//	}
//	
//	@GetMapping("/addLicencia")
//	public String addLicencia(@ModelAttribute(name = "licencias") Licencias licencia, Model model) {
//		
//		if (licenciaService.findLicenciasByNit(licencia.getClientes_nit(),licencia.getSku()).getSku() != licencia.getSku() || licencia.getSku()==0) {		
//			if (null != licenciaService.addLicencias(licencia)) {
//				model.addAttribute("resul", 1);
//			} else {
//				model.addAttribute("resul", 0);
//			}
//		} else {
//
//			if (null != licenciaService.updateLicencias(licencia)) {
//
//				model.addAttribute("resul", 1);
//			} else {
//				model.addAttribute("resul", 0);
//			}
//		}
//		return "redirect:/licencias/verLicenciaId?clientes_nit=" + licencia.getClientes_nit();
//	}
//	
//	@GetMapping("/buscar")
//	public String getPorNit(@RequestParam("clientes_nit") int clientes_nit, Model model ) {
//		if(clientes_nit!=0) {
//			model.addAttribute("licencias", licenciaService.findLicenciasById(clientes_nit));
//			return "licencias/ListaLicencias";
//		}else {
//			return "redirect:/licencias/Vlicencias";
//		}
//		
//	}
//	
//	@GetMapping("/removelicencia")
//	public String removeLicencia(@RequestParam(name = "clientes_nit", required = false) int clientes_nit,
//			@RequestParam(name = "sku", required = false) int sku) {
//		licenciaService.removeLicencias(clientes_nit, sku);
//		return "redirect:/licencias/verLicenciaId?clientes_nit=" + clientes_nit;
//	}
//	
//	@GetMapping("/licenciasEdit")
//	public String RedirectEditFormnit(@RequestParam(name = "clientes_nit", required = false) int clientes_nit,
//			@RequestParam(name = "sku", required = false) int sku, Model model) {
//		LicenciasConverter licencia = new LicenciasConverter();
//		if (clientes_nit != 0) {
//			licencia = licenciaService.findLicenciasByNit(clientes_nit, sku);
//		}
//		model.addAttribute("licencias", licencia);
//		return "licencias/FormularioIngresoLicencia";
//	}
	
}
