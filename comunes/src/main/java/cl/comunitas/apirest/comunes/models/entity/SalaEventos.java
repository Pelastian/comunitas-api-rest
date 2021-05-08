package cl.comunitas.apirest.comunes.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "parking_visita")
public class SalaEventos implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date fecha;

	@Column(name = "hora_inicio")
	@Temporal(TemporalType.TIME)
	private Date horaInicio;
	
	@Column(name = "hora_final")
	@Temporal(TemporalType.TIME)
	private Date horaFinal;	
	
	@Column(name = "id_vecino")
	private Long idVecino;
	
	@Column(name = "autorizado")
	private Boolean esAutorizado;

	@Column(name = "id_empleado")
	private Long idEmpleado;
	
	@Column(length = 500)
	private String observacion;	
	
	@Column(name = "id_foto")
	private Long idFoto;
		
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@Transient
	private Integer port;	

	private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraFinal() {
		return horaFinal;
	}

	public void setHoraFinal(Date horaFinal) {
		this.horaFinal = horaFinal;
	}

	public Long getIdVecino() {
		return idVecino;
	}

	public void setIdVecino(Long idVecino) {
		this.idVecino = idVecino;
	}

	public Boolean getEsAutorizado() {
		return esAutorizado;
	}

	public void setEsAutorizado(Boolean esAutorizado) {
		this.esAutorizado = esAutorizado;
	}

	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Long getIdFoto() {
		return idFoto;
	}

	public void setIdFoto(Long idFoto) {
		this.idFoto = idFoto;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

}
