package intranet.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Clientes {

	private int nit;
	private String razon_social;
	private String direccion;
	private String ciudad;
	private String telefono;
	private String encargado_general;
	private String correo_enc_general;
	private String telefono_enc_general;
	private String encargado_uno;
	private String correo_enc_uno;
	private String telefono_enc_uno;
	private String encargado_dos;
	private String correo_enc_dos;
	private String telefono_enc_dos;
	private String encargado_tres;
	private String correo_enc_tres;
	private String telefono_enc_tres;
	private String estado;
	
	public Clientes() {
		
	}

	public Clientes(int nit, String razon_social, String direccion, String ciudad, String telefono,
			String encargado_general, String correo_enc_general, String telefono_enc_general, String encargado_uno,
			String correo_enc_uno, String telefono_enc_uno, String encargado_dos, String correo_enc_dos,
			String telefono_enc_dos, String encargado_tres, String correo_enc_tres, String telefono_enc_tres,
			String estado) {
		super();
		this.nit = nit;
		this.razon_social = razon_social;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.telefono = telefono;
		this.encargado_general = encargado_general;
		this.correo_enc_general = correo_enc_general;
		this.telefono_enc_general = telefono_enc_general;
		this.encargado_uno = encargado_uno;
		this.correo_enc_uno = correo_enc_uno;
		this.telefono_enc_uno = telefono_enc_uno;
		this.encargado_dos = encargado_dos;
		this.correo_enc_dos = correo_enc_dos;
		this.telefono_enc_dos = telefono_enc_dos;
		this.encargado_tres = encargado_tres;
		this.correo_enc_tres = correo_enc_tres;
		this.telefono_enc_tres = telefono_enc_tres;
		this.estado = estado;
	}

	public int getNit() {
		return nit;
	}

	public void setNit(int nit) {
		this.nit = nit;
	}

	public String getRazon_social() {
		return razon_social;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEncargado_general() {
		return encargado_general;
	}

	public void setEncargado_general(String encargado_general) {
		this.encargado_general = encargado_general;
	}

	public String getCorreo_enc_general() {
		return correo_enc_general;
	}

	public void setCorreo_enc_general(String correo_enc_general) {
		this.correo_enc_general = correo_enc_general;
	}

	public String getTelefono_enc_general() {
		return telefono_enc_general;
	}

	public void setTelefono_enc_general(String telefono_enc_general) {
		this.telefono_enc_general = telefono_enc_general;
	}

	public String getEncargado_uno() {
		return encargado_uno;
	}

	public void setEncargado_uno(String encargado_uno) {
		this.encargado_uno = encargado_uno;
	}

	public String getCorreo_enc_uno() {
		return correo_enc_uno;
	}

	public void setCorreo_enc_uno(String correo_enc_uno) {
		this.correo_enc_uno = correo_enc_uno;
	}

	public String getTelefono_enc_uno() {
		return telefono_enc_uno;
	}

	public void setTelefono_enc_uno(String telefono_enc_uno) {
		this.telefono_enc_uno = telefono_enc_uno;
	}

	public String getEncargado_dos() {
		return encargado_dos;
	}

	public void setEncargado_dos(String encargado_dos) {
		this.encargado_dos = encargado_dos;
	}

	public String getCorreo_enc_dos() {
		return correo_enc_dos;
	}

	public void setCorreo_enc_dos(String correo_enc_dos) {
		this.correo_enc_dos = correo_enc_dos;
	}

	public String getTelefono_enc_dos() {
		return telefono_enc_dos;
	}

	public void setTelefono_enc_dos(String telefono_enc_dos) {
		this.telefono_enc_dos = telefono_enc_dos;
	}

	public String getEncargado_tres() {
		return encargado_tres;
	}

	public void setEncargado_tres(String encargado_tres) {
		this.encargado_tres = encargado_tres;
	}

	public String getCorreo_enc_tres() {
		return correo_enc_tres;
	}

	public void setCorreo_enc_tres(String correo_enc_tres) {
		this.correo_enc_tres = correo_enc_tres;
	}

	public String getTelefono_enc_tres() {
		return telefono_enc_tres;
	}

	public void setTelefono_enc_tres(String telefono_enc_tres) {
		this.telefono_enc_tres = telefono_enc_tres;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Clientes [nit=" + nit + ", razon_social=" + razon_social + ", direccion=" + direccion + ", ciudad="
				+ ciudad + ", telefono=" + telefono + ", encargado_general=" + encargado_general
				+ ", correo_enc_general=" + correo_enc_general + ", telefono_enc_general=" + telefono_enc_general
				+ ", encargado_uno=" + encargado_uno + ", correo_enc_uno=" + correo_enc_uno + ", telefono_enc_uno="
				+ telefono_enc_uno + ", encargado_dos=" + encargado_dos + ", correo_enc_dos=" + correo_enc_dos
				+ ", telefono_enc_dos=" + telefono_enc_dos + ", encargado_tres=" + encargado_tres + ", correo_enc_tres="
				+ correo_enc_tres + ", telefono_enc_tres=" + telefono_enc_tres + ", estado=" + estado + "]";
	}

	
	
}