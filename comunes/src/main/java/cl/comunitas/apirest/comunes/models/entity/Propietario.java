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
@Table(name = "propietarios")
public class Propietario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tipo_persona")
	private String tipoPersona;
	
	@Column(length = 50)
	private String nombre;
	
	@Column(length = 50)
	private String apellido;
	
	@Column(name = "razon_social", length = 150)
	private String razonSocial;
	
	@Column(unique = true)	
	private Long rut;
	private String dv;
	
	@Column(length = 100)
	private String direccion;
	private Long fono;
	private String email;
	
	@Column(name = "fec_adq", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaAdquisicion;

	@Column(name = "activo")
	private Boolean esActivo;
	
	@Column(name = "fec_ces")
	@Temporal(TemporalType.DATE)
	private Date fechaCesion;

	@Column(name = "id_arch_escritura")	
	private Long idEscritura;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "propietario_unidad", 
		joinColumns = @JoinColumn(name = "propietario_id"),
		inverseJoinColumns = @JoinColumn(name = "unidad_id"),
		uniqueConstraints = {@UniqueConstraint(columnNames = {"propietario_id", "unidad_id"})}
	)
	private List<Unidad> unidad;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@Transient
	private Integer port;
	
	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

	public Boolean getEsActivo() {
		return esActivo;
	}

	public void setEsActivo(Boolean esActivo) {
		this.esActivo = esActivo;
	}

	public Date getFechaCesion() {
		return fechaCesion;
	}

	public void setFechaCesion(Date fechaCesion) {
		this.fechaCesion = fechaCesion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdEscritura() {
		return idEscritura;
	}

	public void setIdEscritura(Long idEscritura) {
		this.idEscritura = idEscritura;
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

	public String getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public Long getRut() {
		return rut;
	}

	public void setRut(Long rut) {
		this.rut = rut;
	}

	public String getDv() {
		return dv;
	}

	public void setDv(String dv) {
		this.dv = dv;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Long getFono() {
		return fono;
	}

	public void setFono(Long fono) {
		this.fono = fono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Unidad> getUnidad() {
		return unidad;
	}

	public void setUnidad(List<Unidad> unidad) {
		this.unidad = unidad;
	}

}
