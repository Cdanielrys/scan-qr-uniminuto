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

import intranet.converter.ContratosConverter;
import intranet.model.Contratos;

//@Service("contratosService")
public class ContratosService {
//
//	private RestTemplate restTemplate;
//	
//	private final String GET_URL_CONSULTAR = "http://172.18.48.121:8080/ConsultarContratos";
//	private final String GET_URL_CONSULTARBYID = "http://172.18.48.121:8080/ConsultarContratoById";
//	private final String GET_URL_CONSULTAR_BY_NIT = "http://172.18.48.121:8080/ConsultarContratoByNit";
//	private final String POST_URL_INSERTAR = "http://172.18.48.121:8080/InsertarContrato";
//	private final String PUT_URL_ACTUALIZAR = "http://172.18.48.121:8080/ActualizarContrato";
//	private final String DELETE_URL_ELIMINAR = "http://172.18.48.121:8080/EliminarContrato";
//	
//	@Autowired
//	public void ContratosService(RestTemplate restTemplate) {
//		this.restTemplate = restTemplate;
//	}
//	
//	public List<Contratos> findAllProducts(){
//		return Arrays.stream(restTemplate.getForObject(GET_URL_CONSULTAR, Contratos[].class))
//				.collect(Collectors.toList());
//	}
//	
//	public ArrayList<Contratos> findContratosById(int clientes_nit) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("clientes_nit", String.valueOf(clientes_nit));
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<Contratos[]> response = restTemplate.exchange(GET_URL_CONSULTAR_BY_NIT, HttpMethod.GET, entity,
//				Contratos[].class);
//		Contratos[] contrato = response.getBody();
//
//		ArrayList<Contratos> converterContrato = new ArrayList<>();
//		for (Contratos contrato2 : contrato) {
//			converterContrato.add(contrato2);
//		}
//
//		return converterContrato;
//	}
//	
//	public ContratosConverter findContratosByNit(int clientes_nit, int id_contrato) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("id_contrato", String.valueOf(id_contrato));
//		headers.set("clientes_nit", String.valueOf(clientes_nit));
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<Contratos[]> response = restTemplate.exchange(GET_URL_CONSULTAR_BY_NIT, HttpMethod.GET, entity, Contratos[].class);
//		Contratos[] contrato = response.getBody();
//		ContratosConverter converter = new ContratosConverter();
//		for(Contratos contrato2:contrato) {
//			converter.setId_contrato(contrato2.getId_contrato());
//			converter.setEjecutivo(contrato2.getEjecutivo());
//			converter.setTipo_contrato(contrato2.getTipo_contrato());
//			converter.setHorario(contrato2.getHorario());
//			converter.setF_inicio(contrato2.getF_inicio());
//			converter.setF_final(contrato2.getF_final());
//			converter.setNum_visitas(contrato2.getNum_visitas());
//			converter.setInforme(contrato2.getInforme());
//			converter.setDescripcion(contrato2.getDescripcion());
//			converter.setNombre_maquina(contrato2.getNombre_maquina());
//			converter.setSistema_op(contrato2.getSistema_op());
//			converter.setServicio(contrato2.getServicio());
//			converter.setObservaciones(contrato2.getObservaciones());
//			converter.setAlcance_servicio(contrato2.getAlcance_servicio());
//			converter.setClientes_nit(contrato2.getClientes_nit());
//		}
//		return converter;
//	}
//	
//	public Contratos addContratos(Contratos contrato) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("id_contrato", String.valueOf(contrato.getId_contrato()));
//		headers.set("ejecutivo", contrato.getEjecutivo());
//		headers.set("tipo_contrato", contrato.getTipo_contrato());
//		headers.set("horario", contrato.getHorario());
//		headers.set("f_inicio", String.valueOf(contrato.getF_inicio()));
//		headers.set("f_final", String.valueOf(contrato.getF_final()));
//		headers.set("num_visitas", String.valueOf(contrato.getNum_visitas()));
//		headers.set("informe", contrato.getInforme());
//		headers.set("descripcion", contrato.getDescripcion());
//		headers.set("nombre_maquina", contrato.getNombre_maquina());
//		headers.set("sistema_op", contrato.getSistema_op());
//		headers.set("servicio", contrato.getServicio());
//		headers.set("observaciones", contrato.getObservaciones());
//		headers.set("alcance_servicio", contrato.getAlcance_servicio());
//		headers.set("clientes_nit", String.valueOf(contrato.getClientes_nit()));
//		
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<String> response = restTemplate.exchange(POST_URL_INSERTAR, HttpMethod.POST, entity, String.class);
//		
//		return contrato;
//	}
//	
//	public Contratos updateContratos(Contratos contrato) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("id_contrato", String.valueOf(contrato.getId_contrato()));
//		headers.set("ejecutivo", contrato.getEjecutivo());
//		headers.set("tipo_contrato", contrato.getTipo_contrato());
//		headers.set("horario", contrato.getHorario());
//		headers.set("f_inicio", String.valueOf(contrato.getF_inicio()));
//		headers.set("f_final", String.valueOf(contrato.getF_final()));
//		headers.set("num_visitas", String.valueOf(contrato.getNum_visitas()));
//		headers.set("informe", contrato.getInforme());
//		headers.set("descripcion", contrato.getDescripcion());
//		headers.set("nombre_maquina", contrato.getNombre_maquina());
//		headers.set("sistema_op", contrato.getSistema_op());
//		headers.set("servicio", contrato.getServicio());
//		headers.set("observaciones", contrato.getObservaciones());
//		headers.set("alcance_servicio", contrato.getAlcance_servicio());
//		headers.set("clientes_nit", String.valueOf(contrato.getClientes_nit()));
//		
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<String> response = restTemplate.exchange(PUT_URL_ACTUALIZAR, HttpMethod.PUT, entity, String.class);
//		
//		return contrato;
//	}
//	
//	public void removeContratos(int clientes_nit, int id_contrato) {
//		
//		if(0 != clientes_nit && 0 != id_contrato) {
//			HttpHeaders headers = new HttpHeaders();
//			headers.set("clientes_nit", String.valueOf(clientes_nit));
//			headers.set("id_contrato", String.valueOf(id_contrato));
//			HttpEntity entity = new HttpEntity(headers);
//			ResponseEntity<String> response = restTemplate.exchange(DELETE_URL_ELIMINAR, HttpMethod.DELETE, entity,
//					String.class);
//		}
//		
//	}
	
}
