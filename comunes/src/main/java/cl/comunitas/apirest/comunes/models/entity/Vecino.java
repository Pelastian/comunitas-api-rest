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
@Table(name = "vecinos")
public class Vecino implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
		
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

	@Column(name = "fec_nac")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Column(name = "pensionado")
	private Boolean esPensionado;
	
	@Column(name = "contacto_emergencia", length = 100)
	private String contactoEmergencia;

	@Column(name = "tipo_contacto")
	private int tipoContacto;

	@Column(name = "fono_contacto")
	private Long fonoContacto;

	@Column(name = "cant_grupo")
	private int cantidadGrupoFamiliar;
	
	@Column(length = 500)
	private String observacion;	
	
	@Column(name = "id_foto")	
	private Long IdFoto;

	@Column(name = "mascota")	
	private Boolean tieneMascota;

	@Column(name = "obs_mascota", length = 500)
	private String observacionMascota;
	
	@Column(name = "rut_propietario")	
	private Long rutPropietario;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@Transient
	private Integer port;	
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getContactoEmergencia() {
		return contactoEmergencia;
	}

	public void setContactoEmergencia(String contactoEmergencia) {
		this.contactoEmergencia = contactoEmergencia;
	}

	public int getTipoContacto() {
		return tipoContacto;
	}

	public void setTipoContacto(int tipoContacto) {
		this.tipoContacto = tipoContacto;
	}

	public Long getFonoContacto() {
		return fonoContacto;
	}

	public void setFonoContacto(Long fonoContacto) {
		this.fonoContacto = fonoContacto;
	}

	public int getCantidadGrupoFamiliar() {
		return cantidadGrupoFamiliar;
	}

	public void setCantidadGrupoFamiliar(int cantidadGrupoFamiliar) {
		this.cantidadGrupoFamiliar = cantidadGrupoFamiliar;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Long getIdFoto() {
		return IdFoto;
	}

	public void setIdFoto(Long idFoto) {
		IdFoto = idFoto;
	}

	public Boolean getTieneMascota() {
		return tieneMascota;
	}

	public void setTieneMascota(Boolean tieneMascota) {
		this.tieneMascota = tieneMascota;
	}

	public String getObservacionMascota() {
		return observacionMascota;
	}

	public void setObservacionMascota(String observacionMascota) {
		this.observacionMascota = observacionMascota;
	}

	public Boolean getEsPensionado() {
		return esPensionado;
	}

	public void setEsPensionado(Boolean esPensionado) {
		this.esPensionado = esPensionado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Long getRutPropietario() {
		return rutPropietario;
	}

	public void setRutPropietario(Long rutPropietario) {
		this.rutPropietario = rutPropietario;
	}

}
