package intranet.converter;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContratosConverter {

	private int id_contrato;
	private String ejecutivo;
	private String tipo_contrato;
	private String horario;
	private Date f_inicio;
	private Date f_final;
	private int num_visitas;
	private String informe;
	private String descripcion;
	private String nombre_maquina;
	private String sistema_op;
	private String servicio;
	private String observaciones;
	private String alcance_servicio;
	private int clientes_nit;
	
	public ContratosConverter() {
		
	}

	public ContratosConverter(int id_contrato, String ejecutivo, String tipo_contrato, String horario, Date f_inicio,
			Date f_final, int num_visitas, String informe, String descripcion, String nombre_maquina, String sistema_op,
			String servicio, String observaciones, String alcance_servicio, int clientes_nit) {
		super();
		this.id_contrato = id_contrato;
		this.ejecutivo = ejecutivo;
		this.tipo_contrato = tipo_contrato;
		this.horario = horario;
		this.f_inicio = f_inicio;
		this.f_final = f_final;
		this.num_visitas = num_visitas;
		this.informe = informe;
		this.descripcion = descripcion;
		this.nombre_maquina = nombre_maquina;
		this.sistema_op = sistema_op;
		this.servicio = servicio;
		this.observaciones = observaciones;
		this.alcance_servicio = alcance_servicio;
		this.clientes_nit = clientes_nit;
	}

	public int getId_contrato() {
		return id_contrato;
	}

	public void setId_contrato(int id_contrato) {
		this.id_contrato = id_contrato;
	}

	public String getEjecutivo() {
		return ejecutivo;
	}

	public void setEjecutivo(String ejecutivo) {
		this.ejecutivo = ejecutivo;
	}

	public String getTipo_contrato() {
		return tipo_contrato;
	}

	public void setTipo_contrato(String tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Date getF_inicio() {
		return f_inicio;
	}

	public void setF_inicio(Date f_inicio) {
		this.f_inicio = f_inicio;
	}

	public Date getF_final() {
		return f_final;
	}

	public void setF_final(Date f_final) {
		this.f_final = f_final;
	}

	public int getNum_visitas() {
		return num_visitas;
	}

	public void setNum_visitas(int num_visitas) {
		this.num_visitas = num_visitas;
	}

	public String getInforme() {
		return informe;
	}

	public void setInforme(String informe) {
		this.informe = informe;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre_maquina() {
		return nombre_maquina;
	}

	public void setNombre_maquina(String nombre_maquina) {
		this.nombre_maquina = nombre_maquina;
	}

	public String getSistema_op() {
		return sistema_op;
	}

	public void setSistema_op(String sistema_op) {
		this.sistema_op = sistema_op;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public String getAlcance_servicio() {
		return alcance_servicio;
	}

	public void setAlcance_servicio(String alcance_servicio) {
		this.alcance_servicio = alcance_servicio;
	}

	public int getClientes_nit() {
		return clientes_nit;
	}

	public void setClientes_nit(int clientes_nit) {
		this.clientes_nit = clientes_nit;
	}

	@Override
	public String toString() {
		return "ContratosConverter [id_contrato=" + id_contrato + ", ejecutivo=" + ejecutivo + ", tipo_contrato="
				+ tipo_contrato + ", horario=" + horario + ", f_inicio=" + f_inicio + ", f_final=" + f_final
				+ ", num_visitas=" + num_visitas + ", informe=" + informe + ", descripcion=" + descripcion
				+ ", nombre_maquina=" + nombre_maquina + ", sistema_op=" + sistema_op + ", servicio=" + servicio
				+ ", observaciones=" + observaciones + ", alcance_servicio=" + alcance_servicio + ", clientes_nit="
				+ clientes_nit + "]";
	}
	
}
