package intranet.converter;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmpleadosConverter {

	private int id_empleado;
	private String cargo;
	private String funciones;
	private String correo_coorporativo;
	private int personas_numero_documento;
	
	public EmpleadosConverter() {
		
	}

	public EmpleadosConverter(int id_empleado, String cargo, String funciones, String correo_coorporativo,
			int personas_numero_documento) {
		super();
		this.id_empleado = id_empleado;
		this.cargo = cargo;
		this.funciones = funciones;
		this.correo_coorporativo = correo_coorporativo;
		this.personas_numero_documento = personas_numero_documento;
	}

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getFunciones() {
		return funciones;
	}

	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}

	public String getCorreo_coorporativo() {
		return correo_coorporativo;
	}

	public void setCorreo_coorporativo(String correo_coorporativo) {
		this.correo_coorporativo = correo_coorporativo;
	}

	public int getPersonas_numero_documento() {
		return personas_numero_documento;
	}

	public void setPersonas_numero_documento(int personas_numero_documento) {
		this.personas_numero_documento = personas_numero_documento;
	}

	@Override
	public String toString() {
		return "EmpleadosConverter [id_empleado=" + id_empleado + ", cargo=" + cargo + ", funciones=" + funciones
				+ ", correo_coorporativo=" + correo_coorporativo + ", personas_numero_documento="
				+ personas_numero_documento + "]";
	}
	
}
