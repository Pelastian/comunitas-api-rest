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
@Table(name = "reclamos")
public class Reclamo implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Column(length = 500)
	private String descripcion;
	
	@Column(name = "id_vecino")
	private Long IdVecino;
	
	@Column(name = "primera_vez")
	private Boolean esPrimeraVez;

	@Column(name = "id_foto")
	private Long IdFoto;	
	
	@Column(name = "revisado")
	private Boolean esRevisado;

	@Column(length = 500)
	private String comentario;
	
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Long getIdVecino() {
		return IdVecino;
	}

	public void setIdVecino(Long idVecino) {
		IdVecino = idVecino;
	}

	public Boolean getEsPrimeraVez() {
		return esPrimeraVez;
	}

	public void setEsPrimeraVez(Boolean esPrimeraVez) {
		this.esPrimeraVez = esPrimeraVez;
	}

	public Long getIdFoto() {
		return IdFoto;
	}

	public void setIdFoto(Long idFoto) {
		IdFoto = idFoto;
	}

	public Boolean getEsRevisado() {
		return esRevisado;
	}

	public void setEsRevisado(Boolean esRevisado) {
		this.esRevisado = esRevisado;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
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
