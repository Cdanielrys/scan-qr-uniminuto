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

import intranet.converter.ClientesConverter;
import intranet.model.Clientes;

//@Service("clienteService")
public class ClientesService {

//	private RestTemplate restTemplate;
//	
//	private final String GET_URL_CONSULTAR = "http://172.18.48.121:8080/Clientes";
//	private final String GET_URL_CONSULTARID = "http://172.18.48.121:8080/ClientesById";
//	private final String GET_URL_CONSULTAR_NOMBRE = "http://172.18.48.121:8080/ConsultarClienteByNombre";
//	private final String POST_URL_INSERTAR = "http://172.18.48.121:8080/InsertarCliente";
//	private final String PUT_URL_ACTUALIZAR = "http://172.18.48.121:8080/ActualizarCliente";
//	private final String DELETE_URL_ELIMINAR = "http://172.18.48.121:8080/EliminarCliente";
//	
//	@Autowired
//	public void ClientesService(RestTemplate restTemplate) {
//		this.restTemplate = restTemplate;
//	}
//	
//	public List<Clientes> findAllProducts(){
//		return Arrays.stream(restTemplate.getForObject(GET_URL_CONSULTAR, Clientes[].class))
//				.collect(Collectors.toList());
//	}
//	
//	/**
//	 * Recibe parametro nit para consumir el servicio de consulta por nit. El json
//	 * lo convierte en un objeto java tipo array y luego se tramsforma a un objeto
//	 * normal
//	 * 
//	 * @param nit
//	 * @return
//	 */
//	
//	public ClientesConverter findClientesById(int nit) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("nit", String.valueOf(nit));
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<Clientes[]> response = restTemplate.exchange(GET_URL_CONSULTARID, HttpMethod.GET, entity, Clientes[].class);
//		Clientes[] cliente = response.getBody();
//		ClientesConverter converter = new ClientesConverter();
//		for(Clientes cliente2:cliente) {
//			converter.setNit(cliente2.getNit());
//			converter.setRazon_social(cliente2.getRazon_social());
//			converter.setCiudad(cliente2.getCiudad());
//			converter.setDireccion(cliente2.getDireccion());
//			converter.setTelefono(cliente2.getTelefono());
//			converter.setEncargado_general(cliente2.getEncargado_general());
//			converter.setCorreo_enc_general(cliente2.getCorreo_enc_general());
//			converter.setTelefono_enc_general(cliente2.getTelefono_enc_general());
//			converter.setEncargado_uno(cliente2.getEncargado_uno());
//			converter.setCorreo_enc_uno(cliente2.getCorreo_enc_uno());
//			converter.setTelefono_enc_uno(cliente2.getTelefono_enc_uno());
//			converter.setEncargado_dos(cliente2.getEncargado_dos());
//			converter.setCorreo_enc_dos(cliente2.getCorreo_enc_dos());
//			converter.setTelefono_enc_dos(cliente2.getTelefono_enc_dos());
//			converter.setEncargado_tres(cliente2.getEncargado_tres());
//			converter.setCorreo_enc_tres(cliente2.getCorreo_enc_tres());
//			converter.setTelefono_enc_tres(cliente2.getTelefono_enc_tres());
//			converter.setEstado(cliente2.getEstado());
//		}
//		return converter;
//	}
//	
//	public Clientes addClientes(Clientes cliente) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("nit", String.valueOf(cliente.getNit()));
//		headers.set("razon_social", cliente.getRazon_social());
//		headers.set("ciudad", cliente.getCiudad());
//		headers.set("direccion", cliente.getDireccion());
//		headers.set("telefono", cliente.getTelefono());
//		headers.set("encargado_general", cliente.getEncargado_general());
//		headers.set("correo_enc_general", cliente.getCorreo_enc_general());
//		headers.set("telefono_enc_general", cliente.getTelefono_enc_general());
//		headers.set("encargado_uno", cliente.getEncargado_uno());
//		headers.set("correo_enc_uno", cliente.getCorreo_enc_uno());
//		headers.set("telefono_enc_uno", cliente.getTelefono_enc_uno());
//		headers.set("encargado_dos", cliente.getEncargado_dos());
//		headers.set("correo_enc_dos", cliente.getCorreo_enc_dos());
//		headers.set("telefono_enc_dos", cliente.getTelefono_enc_dos());
//		headers.set("encargado_tres", cliente.getEncargado_tres());
//		headers.set("correo_enc_tres", cliente.getCorreo_enc_tres());
//		headers.set("telefono_enc_tres", cliente.getTelefono_enc_tres());
//		headers.set("estado", cliente.getEstado());
//		
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<String> response = restTemplate.exchange(POST_URL_INSERTAR, HttpMethod.POST, entity, String.class);
//		
//		return cliente;
//	}
//	
//	public Clientes updateClientes(Clientes cliente) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("nit", String.valueOf(cliente.getNit()));
//		headers.set("razon_social", cliente.getRazon_social());
//		headers.set("ciudad", cliente.getCiudad());
//		headers.set("direccion", cliente.getDireccion());
//		headers.set("telefono", cliente.getTelefono());
//		headers.set("encargado_general", cliente.getEncargado_general());
//		headers.set("correo_enc_general", cliente.getCorreo_enc_general());
//		headers.set("telefono_enc_general", cliente.getTelefono_enc_general());
//		headers.set("encargado_uno", cliente.getEncargado_uno());
//		headers.set("correo_enc_uno", cliente.getCorreo_enc_uno());
//		headers.set("telefono_enc_uno", cliente.getTelefono_enc_uno());
//		headers.set("encargado_dos", cliente.getEncargado_dos());
//		headers.set("correo_enc_dos", cliente.getCorreo_enc_dos());
//		headers.set("telefono_enc_dos", cliente.getTelefono_enc_dos());
//		headers.set("encargado_tres", cliente.getEncargado_tres());
//		headers.set("correo_enc_tres", cliente.getCorreo_enc_tres());
//		headers.set("telefono_enc_tres", cliente.getTelefono_enc_tres());
//		headers.set("estado", cliente.getEstado());
//		
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<String> response = restTemplate.exchange(PUT_URL_ACTUALIZAR, HttpMethod.PUT, entity, String.class);
//		
//		return cliente;
//	}
//	
//	public void removeClientes(int nit) {
//		
//		if(0 != nit) {
//			HttpHeaders headers = new HttpHeaders();
//			headers.set("nit", String.valueOf(nit));
//			HttpEntity entity = new HttpEntity(headers);
//			ResponseEntity<String> response = restTemplate.exchange(DELETE_URL_ELIMINAR, HttpMethod.DELETE, entity,
//					String.class);
//		}
//		
//	}
//	
//	public ClientesConverter findClienteByNombre(String razon_social) {
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("razon_social", razon_social);
//		HttpEntity entity = new HttpEntity(headers);
//		ResponseEntity<Clientes[]> response = restTemplate.exchange(GET_URL_CONSULTAR_NOMBRE, HttpMethod.GET, entity,
//				Clientes[].class);
//		Clientes[] cliente = response.getBody();
//		ClientesConverter converter = new ClientesConverter();
//		for(Clientes cliente2:cliente) {
//			converter.setNit(cliente2.getNit());
//			converter.setRazon_social(cliente2.getRazon_social());
//			converter.setDireccion(cliente2.getDireccion());
//			converter.setCiudad(cliente2.getCiudad());
//			converter.setTelefono(cliente2.getTelefono());
//			converter.setEncargado_general(cliente2.getEncargado_general());
//			converter.setCorreo_enc_general(cliente2.getCorreo_enc_general());
//			converter.setTelefono_enc_general(cliente2.getTelefono_enc_general());
//			converter.setEncargado_uno(cliente2.getEncargado_uno());
//			converter.setCorreo_enc_uno(cliente2.getCorreo_enc_uno());
//			converter.setTelefono_enc_uno(cliente2.getTelefono_enc_uno());
//			converter.setEncargado_dos(cliente2.getEncargado_dos());
//			converter.setCorreo_enc_dos(cliente2.getCorreo_enc_dos());
//			converter.setTelefono_enc_dos(cliente2.getTelefono_enc_dos());
//			converter.setEncargado_tres(cliente2.getEncargado_tres());
//			converter.setCorreo_enc_tres(cliente2.getCorreo_enc_tres());
//			converter.setTelefono_enc_tres(cliente2.getTelefono_enc_tres());
//			converter.setEstado(cliente2.getEstado());
//		}
//		return converter;
//	}
	
}
