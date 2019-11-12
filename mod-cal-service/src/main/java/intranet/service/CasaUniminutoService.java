package intranet.service;

import javax.sound.midi.Soundbank;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import intranet.model.CasaUniminuto;

@Service("clienteService")
public class CasaUniminutoService {
	
	private RestTemplate resttemplate;
	
	public void CasaUniminutoService(RestTemplate restTemplate) {
		this.resttemplate = restTemplate;
	}
	
	
	public CasaUniminuto addClientes(CasaUniminuto casa) {
	HttpHeaders headers = new HttpHeaders();
	headers.set("nombre", casa.getNombre());
	headers.set("porcentaje", casa.getPorcentaje());
	
	System.out.println("el num essss: " + casa.getPorcentaje());
	HttpEntity entity = new HttpEntity(headers);
//	ResponseEntity<String> response = resttemplate.exchange(POST_URL_INSERTAR, HttpMethod.POST, entity, String.class);
//	
	return casa;
}	
	
//	@Autowired
//	public void ClientesService(RestTemplate restTemplate) {
//		this.restTemplate = restTemplate;
//	}	
	
}
