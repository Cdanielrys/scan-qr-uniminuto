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

import intranet.converter.PersonasConverter;
import intranet.model.Personas;

//@Service("personaService")
public class PersonasService {
//	
//	private RestTemplate restTemplate;
//	
//	private final String GET_URL_CONSULTAR = "http://172.18.48.121:8080/ConsultarPersona";
//	private final String GET_URL_CONSULTARBYID = "http://172.18.48.121:8080/ConsultarPersonaById";
//	private final String POST_URL_INSERTAR = "http://172.18.48.121:8080/InsertarPersona";
//	private final String PUT_URL_ACTUALIZAR = "http://172.18.48.121:8080/ActualizarPersona";
//	private final String DELETE_URL_ELIMINAR = "http://172.18.48.121:8080/EliminarPersona";
//	
//	@Autowired
//	public void ContratosService(RestTemplate restTemplate) {
//		this.restTemplate = restTemplate;
//	}
//	
//	public List<Personas> findAllProducts(){
//		return Arrays.stream(restTemplate.getForObject(GET_URL_CONSULTAR, Personas[].class))
//				.collect(Collectors.toList());
//	}
//
//	public PersonasConverter findPersonasById(int numero_documento) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("numero_documento", String.valueOf(numero_documento));
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<Personas[]> response = restTemplate.exchange(GET_URL_CONSULTARBYID, HttpMethod.GET, entity, Personas[].class);
//		Personas[] persona = response.getBody();
//		PersonasConverter converter = new PersonasConverter();
//		for(Personas persona2:persona) {
//			converter.setNumero_documento(persona2.getNumero_documento());
//			converter.setTipo_documento(persona2.getTipo_documento());
//			converter.setNombres(persona2.getNombres());
//			converter.setApellidos(persona2.getApellidos());
//			converter.setTelefono_uno(persona2.getTelefono_uno());
//			converter.setTelefono_dos(persona2.getTelefono_dos());
//			converter.setDireccion(persona2.getDireccion());
//			converter.setCorreo_personal(persona2.getCorreo_personal());
//		}
//		return converter;
//	}
//	
//	public Personas addPersonas(Personas persona) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("numero_documento", String.valueOf(persona.getNumero_documento()));
//		headers.set("tipo_documento", persona.getTipo_documento());
//		headers.set("nombres", persona.getNombres());
//		headers.set("apellidos", persona.getApellidos());
//		headers.set("telefono_uno", persona.getTelefono_uno());
//		headers.set("telefono_dos", persona.getTelefono_dos());
//		headers.set("direccion", persona.getDireccion());
//		headers.set("correo_personal", persona.getCorreo_personal());
//		
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<String> response = restTemplate.exchange(POST_URL_INSERTAR, HttpMethod.POST, entity, String.class);
//		
//		return persona;
//	}
//	
//	public Personas updatePersonas(Personas persona) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("numero_documento", String.valueOf(persona.getNumero_documento()));
//		headers.set("tipo_documento", persona.getTipo_documento());
//		headers.set("nombres", persona.getNombres());
//		headers.set("apellidos", persona.getApellidos());
//		headers.set("telefono_uno", persona.getTelefono_uno());
//		headers.set("telefono_dos", persona.getTelefono_dos());
//		headers.set("direccion", persona.getDireccion());
//		headers.set("correo_personal", persona.getCorreo_personal());
//		
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<String> response = restTemplate.exchange(PUT_URL_ACTUALIZAR, HttpMethod.PUT, entity, String.class);
//		
//		return persona;
//	}
//	
//	public void removePersonas(int numero_documento) {
//		if(0 != numero_documento) {
//			HttpHeaders headers = new HttpHeaders();
//			headers.set("numero_documento", String.valueOf(numero_documento));
//			HttpEntity entity = new HttpEntity(headers);
//			ResponseEntity<String> response = restTemplate.exchange(DELETE_URL_ELIMINAR, HttpMethod.DELETE, entity,
//					String.class);
//		}
//	}
//	
}
