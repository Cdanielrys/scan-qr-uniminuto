package intranet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CasaUniminuto {
	
	private String nombre;
	private String porcentaje;
	

	public CasaUniminuto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CasaUniminuto(String nombre, String porcentaje) {
		super();
		this.nombre = nombre;
		this.porcentaje = porcentaje;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPorcentaje() {
		return porcentaje;
	}


	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}


	@Override
	public String toString() {
		return "CasaUniminuto [nombre=" + nombre + ", porcentaje=" + porcentaje + "]";
	}


	
	
	
}
