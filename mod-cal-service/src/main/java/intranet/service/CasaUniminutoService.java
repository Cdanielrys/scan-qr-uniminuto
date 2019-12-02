package intranet.service;

import javax.sound.midi.Soundbank;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import intranet.model.CasaUniminuto;

@Service("clienteService")
public class CasaUniminutoService {
	
	private RestTemplate resttemplate;
	
	private final String POST_URL_INSERTAR = "http://localhost:8082/cxf/uniminuto/insertarCalificacion";
	
	
	public void CasaUniminutoService(RestTemplate restTemplate) {
		this.resttemplate = restTemplate;
	}
	
	
	public CasaUniminuto addClientes(CasaUniminuto casa) {
	HttpHeaders headers = new HttpHeaders();
	headers.set("area", casa.getNombre());
	headers.set("calificacion", casa.getPorcentaje());
	HttpEntity entity = new HttpEntity(headers);
	ResponseEntity<String> response = resttemplate.exchange(POST_URL_INSERTAR, HttpMethod.POST, entity, String.class);
	return casa;
}	
	
//	@Autowired
//	public void ClientesService(RestTemplate restTemplate) {
//		this.restTemplate = restTemplate;
//	}	
	
}
