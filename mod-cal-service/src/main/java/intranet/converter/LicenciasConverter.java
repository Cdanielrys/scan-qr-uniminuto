package intranet.converter;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LicenciasConverter {

	private int sku;
	private String descripcion;
	private String tipo_soporte;
	private Date f_inicial_licencia;
	private Date f_final_licencia;
	private int cantidad;
	private int clientes_nit;
	
	public LicenciasConverter() {
		
	}

	public LicenciasConverter(int sku, String descripcion, String tipo_soporte, Date f_inicial_licencia,
			Date f_final_licencia, int cantidad, int clientes_nit) {
		super();
		this.sku = sku;
		this.descripcion = descripcion;
		this.tipo_soporte = tipo_soporte;
		this.f_inicial_licencia = f_inicial_licencia;
		this.f_final_licencia = f_final_licencia;
		this.cantidad = cantidad;
		this.clientes_nit = clientes_nit;
	}

	public int getSku() {
		return sku;
	}

	public void setSku(int sku) {
		this.sku = sku;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTipo_soporte() {
		return tipo_soporte;
	}

	public void setTipo_soporte(String tipo_soporte) {
		this.tipo_soporte = tipo_soporte;
	}

	public Date getF_inicial_licencia() {
		return f_inicial_licencia;
	}

	public void setF_inicial_licencia(Date f_inicial_licencia) {
		this.f_inicial_licencia = f_inicial_licencia;
	}

	public Date getF_final_licencia() {
		return f_final_licencia;
	}

	public void setF_final_licencia(Date f_final_licencia) {
		this.f_final_licencia = f_final_licencia;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public int getClientes_nit() {
		return clientes_nit;
	}

	public void setClientes_nit(int clientes_nit) {
		this.clientes_nit = clientes_nit;
	}

	@Override
	public String toString() {
		return "LicenciasConverter [sku=" + sku + ", descripcion=" + descripcion + ", tipo_soporte=" + tipo_soporte
				+ ", f_inicial_licencia=" + f_inicial_licencia + ", f_final_licencia=" + f_final_licencia
				+ ", cantidad=" + cantidad + ", clientes_nit=" + clientes_nit + "]";
	}
	
}
