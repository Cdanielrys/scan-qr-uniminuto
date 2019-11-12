package intranet.service;

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

import intranet.converter.EmpleadosConverter;
import intranet.model.Empleados;

//@Service("empleadoService")
public class EmpleadosService {

//	private RestTemplate restTemplate;
//	
//	private final String GET_URL_CONSULTAR = "http://172.18.48.121:8080/ConsultarEmpleado";
//	private final String GET_URL_CONSULTARBYID = "http://172.18.48.121:8080/ConsultarEmpleadoById";
//	private final String POST_URL_INSERTAR = "http://172.18.48.121:8080/InsertarEmpleado";
//	private final String PUT_URL_ACTUALIZAR = "http://172.18.48.121:8080/ActualizarEmpleado";
//	private final String DELETE_URL_ELIMINAR = "http://172.18.48.121:8080/EliminarEmpleado";
//	
//	@Autowired
//	public void ContratosService(RestTemplate restTemplate) {
//		this.restTemplate = restTemplate;
//	}
//	
//	public List<Empleados> findAllProducts(){
//		return Arrays.stream(restTemplate.getForObject(GET_URL_CONSULTAR, Empleados[].class))
//				.collect(Collectors.toList());
//	}
//	
//	public EmpleadosConverter findEmpleadosById(int id_empleado) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("id_empleado", String.valueOf(id_empleado));
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<Empleados[]> response = restTemplate.exchange(GET_URL_CONSULTARBYID, HttpMethod.GET, entity, Empleados[].class);
//		Empleados[] empleado = response.getBody();
//		EmpleadosConverter converter = new EmpleadosConverter();
//		for(Empleados empleado2:empleado) {
//			converter.setId_empleado(empleado2.getId_empleado());
//			converter.setCargo(empleado2.getCargo());
//			converter.setFunciones(empleado2.getFunciones());
//			converter.setCorreo_coorporativo(empleado2.getCorreo_coorporativo());
//			converter.setPersonas_numero_documento(empleado2.getPersonas_numero_documento());
//		}
//		return converter;
//	}
//	
//	public Empleados addempleados(Empleados empleado) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("id_empleado", String.valueOf(empleado.getId_empleado()));
//		headers.set("cargo", empleado.getCargo());
//		headers.set("funciones", empleado.getFunciones());
//		headers.set("correo_coorporativo", empleado.getCorreo_coorporativo());
//		headers.set("personas_numero_documento", String.valueOf(empleado.getPersonas_numero_documento()));
//		
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<String> response = restTemplate.exchange(POST_URL_INSERTAR, HttpMethod.POST, entity, String.class);
//		
//		return empleado;
//	}
//	
//	public Empleados updateEmpleados(Empleados empleado) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("id_empleado", String.valueOf(empleado.getId_empleado()));
//		headers.set("cargo", empleado.getCargo());
//		headers.set("funciones", empleado.getFunciones());
//		headers.set("correo_coorporativo", empleado.getCorreo_coorporativo());
//		headers.set("personas_numero_documento", String.valueOf(empleado.getPersonas_numero_documento()));
//		
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<String> response = restTemplate.exchange(PUT_URL_ACTUALIZAR, HttpMethod.PUT, entity, String.class);
//		
//		return empleado;
//	}
//	
//	public void removeEmpleados(int id_empleado) {
//		if(0 != id_empleado) {
//			HttpHeaders headers = new HttpHeaders();
//			headers.set("id_empleado", String.valueOf(id_empleado));
//			HttpEntity entity = new HttpEntity(headers);
//			ResponseEntity<String> response = restTemplate.exchange(DELETE_URL_ELIMINAR, HttpMethod.DELETE, entity,
//					String.class);
//		}
//	}
	
}
