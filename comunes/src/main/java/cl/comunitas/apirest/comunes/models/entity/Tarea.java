package cl.comunitas.apirest.comunes.models.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "tareas")
public class Tarea implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "id_tipo_tarea")
	private Long idTipoTarea;
	
	@Column(name = "id_empleado")
	private Long idEmpleado;

	@Column(name = "fec_asig")
	@Temporal(TemporalType.DATE)
	private Date fechaAsignacion;

	@Column(name = "fec_prog")
	@Temporal(TemporalType.DATE)
	private Date fechaProgramacion;

	@Column(name = "tiempo_estimado")
	@Temporal(TemporalType.TIME)
	private Date tiempoEstimado;
	
	@Column(name = "fec_ini")
	@Temporal(TemporalType.DATE)
	private Date fechaInicio;
	
	@Column(name = "fec_fin")
	@Temporal(TemporalType.DATE)
	private Date fechaFinal;

	@Column(name = "finalizado")
	private Boolean esFinalizado;
	
	private Archivo comentario;

	@Column(name = "nivel_cumple")
	private int nivelCumplimiento;
	
	@Column(name = "id_revisor")
	private Long idRevisor;	

	@Column(name = "fec_rev")
	@Temporal(TemporalType.DATE)
	private Date fechaRevision;		

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "tarea_foto", 
		joinColumns = @JoinColumn(name = "id_tarea"),
		inverseJoinColumns = @JoinColumn(name = "id_foto"),
		uniqueConstraints = {@UniqueConstraint(columnNames = {"id_tarea", "id_foto"})}
	)	
	private List<Archivo> foto;	
	
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

	public Long getIdTipoTarea() {
		return idTipoTarea;
	}

	public void setIdTipoTarea(Long idTipoTarea) {
		this.idTipoTarea = idTipoTarea;
	}

	public Long getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Date getFechaAsignacion() {
		return fechaAsignacion;
	}

	public void setFechaAsignacion(Date fechaAsignacion) {
		this.fechaAsignacion = fechaAsignacion;
	}

	public Date getFechaProgramacion() {
		return fechaProgramacion;
	}

	public void setFechaProgramacion(Date fechaProgramacion) {
		this.fechaProgramacion = fechaProgramacion;
	}

	public Date getTiempoEstimado() {
		return tiempoEstimado;
	}

	public void setTiempoEstimado(Date tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Boolean getEsFinalizado() {
		return esFinalizado;
	}

	public void setEsFinalizado(Boolean esFinalizado) {
		this.esFinalizado = esFinalizado;
	}

	public int getNivelCumplimiento() {
		return nivelCumplimiento;
	}

	public void setNivelCumplimiento(int nivelCumplimiento) {
		this.nivelCumplimiento = nivelCumplimiento;
	}

	public Long getIdRevisor() {
		return idRevisor;
	}

	public void setIdRevisor(Long idRevisor) {
		this.idRevisor = idRevisor;
	}

	public Date getFechaRevision() {
		return fechaRevision;
	}

	public void setFechaRevision(Date fechaRevision) {
		this.fechaRevision = fechaRevision;
	}

	public List<Archivo> getFoto() {
		return foto;
	}

	public void setFoto(List<Archivo> foto) {
		this.foto = foto;
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

	public Archivo getComentario() {
		return comentario;
	}

	public void setComentario(Archivo comentario) {
		this.comentario = comentario;
	}

}
