package intranet.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import intranet.converter.LicenciasConverter;
import intranet.model.Licencias;

//@Service("licenciaService")
public class LicenciasService {

//	private RestTemplate restTemplate;
//	
//	private final String GET_URL_CONSULTAR = "http://172.18.48.121:8080/ConsultarLicencia";
//	private final String GET_URL_CONSULTARBYID = "http://172.18.48.121:8080/ConsultarLicenciaById";
//	private final String POST_URL_INSERTAR = "http://172.18.48.121:8080/InsertarLicencia";
//	private final String PUT_URL_ACTUALIZAR = "http://172.18.48.121:8080/ActualizarLicencia";
//	private final String DELETE_URL_ELIMINAR = "http://172.18.48.121:8080/EliminarLicencia";
//	private final String GET_URL_CONSULTAR_BY_NIT = "http://172.18.48.121:8080/ConsultarLicenciaByNit";
//	
//	@Autowired
//	public void ContratosService(RestTemplate restTemplate) {
//		this.restTemplate = restTemplate;
//	}
//	
//	public List<Licencias> findAllProducts(){
//		return Arrays.stream(restTemplate.getForObject(GET_URL_CONSULTAR, Licencias[].class))
//				.collect(Collectors.toList());
//	}
//	
//	public ArrayList<Licencias> findLicenciasById(int clientes_nit) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("clientes_nit", String.valueOf(clientes_nit));
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<Licencias[]> response = restTemplate.exchange(GET_URL_CONSULTAR_BY_NIT, HttpMethod.GET, entity, Licencias[].class);
//		Licencias[] licencia = response.getBody();
//		ArrayList<Licencias> converterLicencia = new ArrayList<>();
//		for(Licencias licencia2:licencia) {
//			converterLicencia.add(licencia2);
//		}
//		return converterLicencia;
//	}
//	
//	public LicenciasConverter findLicenciasByNit(int clientes_nit, int sku) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("sku", String.valueOf(sku));
//		headers.set("clientes_nit", String.valueOf(clientes_nit));
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<Licencias[]> response = restTemplate.exchange(GET_URL_CONSULTAR_BY_NIT, HttpMethod.GET, entity, Licencias[].class);
//		Licencias[] licencia = response.getBody();
//		LicenciasConverter converter = new LicenciasConverter();
//		for(Licencias licencia2:licencia) {
//			converter.setSku(licencia2.getSku());
//			converter.setDescripcion(licencia2.getDescripcion());
//			converter.setTipo_soporte(licencia2.getTipo_soporte());
//			converter.setF_inicial_licencia(licencia2.getF_inicial_licencia());
//			converter.setF_final_licencia(licencia2.getF_final_licencia());
//			converter.setCantidad(licencia2.getCantidad());
//			converter.setClientes_nit(licencia2.getClientes_nit());
//		}
//		
//		return converter;
//	}
//	
//	public Licencias addLicencias(Licencias licencia) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("sku", String.valueOf(licencia.getSku()));
//		headers.set("descripcion", licencia.getDescripcion());
//		headers.set("tipo_soporte", licencia.getTipo_soporte());
//		headers.set("f_inicial_licencia", String.valueOf(licencia.getF_inicial_licencia()));
//		headers.set("f_final_licencia", String.valueOf(licencia.getF_final_licencia()));
//		headers.set("cantidad", String.valueOf(licencia.getCantidad()));
//		headers.set("clientes_nit", String.valueOf(licencia.getClientes_nit()));
//		
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<String> response = restTemplate.exchange(POST_URL_INSERTAR, HttpMethod.POST, entity, String.class);
//		
//		return licencia;
//	}
//	
//	public Licencias updateLicencias(Licencias licencia) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("sku", String.valueOf(licencia.getSku()));
//		headers.set("descripcion", licencia.getDescripcion());
//		headers.set("tipo_soporte", licencia.getTipo_soporte());
//		headers.set("f_inicial_licencia", String.valueOf(licencia.getF_inicial_licencia()));
//		headers.set("f_final_licencia", String.valueOf(licencia.getF_final_licencia()));
//		headers.set("cantidad", String.valueOf(licencia.getCantidad()));
//		headers.set("clientes_nit", String.valueOf(licencia.getClientes_nit()));
//		
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<String> response = restTemplate.exchange(PUT_URL_ACTUALIZAR, HttpMethod.PUT, entity, String.class);
//		
//		return licencia;
//	}
//	
//	public void removeLicencias(int clientes_nit, int sku) {
//		if(0 != clientes_nit && 0 != sku) {
//			HttpHeaders headers = new HttpHeaders();
//			headers.set("clientes_nit", String.valueOf(clientes_nit));
//			headers.set("sku", String.valueOf(sku));
//			HttpEntity entity = new HttpEntity(headers);
//			ResponseEntity<String> response = restTemplate.exchange(DELETE_URL_ELIMINAR, HttpMethod.DELETE, entity,
//					String.class);
//		}
//	}
	
}
