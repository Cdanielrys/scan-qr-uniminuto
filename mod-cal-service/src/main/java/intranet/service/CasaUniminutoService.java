package intranet.service;

import javax.sound.midi.Soundbank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import intranet.model.CasaUniminuto;

@Service("clienteService")
public class CasaUniminutoService {
	
	@Autowired
	private RestTemplate resttemplate;
	
	private final String POST_URL_INSERTAR = "http://localhost:8082/cxf/uniminuto/insertarCalificacion";
	
	
	public void CasaUniminutoService(RestTemplate restTemplate) {
		this.resttemplate = restTemplate;
	}
	
	public void addClientes(CasaUniminuto casa) {
	HttpHeaders headers = new HttpHeaders();
	System.out.println(" ADD CLIENTES " +casa.getNombre()+" - "+casa.getPorcentaje());
	headers.set("area", casa.getNombre());
	headers.set("calificacion", casa.getPorcentaje());
	headers.set("Content-Type", "application/json");
	System.out.println(" Cantida de headers  " + headers.size());
	HttpEntity entity = new HttpEntity(headers);
	System.out.println(" ENTITYY " +casa.getNombre()+ " - "+casa.getPorcentaje());
	System.out.println(" Body " + entity.getBody() + "    " + entity.getHeaders());
	Object result = resttemplate.postForEntity(POST_URL_INSERTAR, entity, Object.class);
	System.out.println(" Body despues de : " + entity.getBody() + "    " + entity.getHeaders());
	
//	RequestEntity<Object> request = resttemplate.
//	ResponseEntity<Object> response = resttemplate.exchange(POST_URL_INSERTAR, HttpMethod.POST, entity);
}	
	
//	@Autowired
//	public void ClientesService(RestTemplate restTemplate) {
//		this.restTemplate = restTemplate;
//	}	
	
}
