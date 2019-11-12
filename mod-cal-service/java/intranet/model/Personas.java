package intranet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Personas {

	private int numero_documento;
	private String tipo_documento;
	private String nombres;
	private String apellidos;
	private String telefono_uno;
	private String telefono_dos;
	private String direccion;
	private String correo_personal;
	
	public Personas() {
		
	}

	public Personas(int numero_documento, String tipo_documento, String nombres, String apellidos, String telefono_uno,
			String telefono_dos, String direccion, String correo_personal) {
		super();
		this.numero_documento = numero_documento;
		this.tipo_documento = tipo_documento;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono_uno = telefono_uno;
		this.telefono_dos = telefono_dos;
		this.direccion = direccion;
		this.correo_personal = correo_personal;
	}

	public int getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(int numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono_uno() {
		return telefono_uno;
	}

	public void setTelefono_uno(String telefono_uno) {
		this.telefono_uno = telefono_uno;
	}

	public String getTelefono_dos() {
		return telefono_dos;
	}

	public void setTelefono_dos(String telefono_dos) {
		this.telefono_dos = telefono_dos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo_personal() {
		return correo_personal;
	}

	public void setCorreo_personal(String correo_personal) {
		this.correo_personal = correo_personal;
	}

	@Override
	public String toString() {
		return "Personas [numero_documento=" + numero_documento + ", tipo_documento=" + tipo_documento + ", nombres="
				+ nombres + ", apellidos=" + apellidos + ", telefono_uno=" + telefono_uno + ", telefono_dos="
				+ telefono_dos + ", direccion=" + direccion + ", correo_personal=" + correo_personal + "]";
	}
		
}
