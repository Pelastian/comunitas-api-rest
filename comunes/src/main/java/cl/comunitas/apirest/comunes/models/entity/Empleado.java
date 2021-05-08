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
@Table(name = "empleados")
public class Empleado implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	@Column(length = 50)
	private String nombre;
	
	@Column(length = 50)
	private String apellido;
	
	@Column(unique = true)	
	private Long rut;
	private String dv;
	
	@Column(length = 100)
	private String direccion;
	private Long fono;
	private String email;
	private String nacionalidad;

	@Column(name = "fec_nac")
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	@Column(name = "estado_civil")
	private String estadoCivil;
	
	@Column(name = "fec_inc")
	@Temporal(TemporalType.DATE)
	private Date fechaIncorporacion;

	@Column(name = "id_cargo")
	private Long idCargo;

	@Column(name = "afp_inp")	
	private String afpInp;
	
	@Column(name = "inst_salud")		
	private String institucionSalud;

	@Column(name = "pensionado")
	private Boolean esPensionado;

	@Column(name = "cargas_familiares")
	private int cargasFamiliares;

	@Column(name = "sueldo_base")	
	private int sueldoBase;
	
	@Column(name = "bono_colacion")	
	private int bonoColacion;
	
	@Column(name = "bono_movilizacion")	
	private int bonoMovilizacion;
	
	@Column(name = "tipo_contrato")		
	private String tipoContrato;
	
	@Column(name = "duracion_contrato")		
	private int duracionContrato;

	@Column(name = "cuenta_bancaria")		
	private String cuentaBancaria;

	@Column(name = "tipo_cuenta_bancaria")		
	private String tipoCuentaBancaria;
	
	@Column(name = "banco_cuenta_bancaria")		
	private String bancoCuentaBancaria;
	
	@Column(name = "contacto_emergencia", length = 100)
	private String contactoEmergencia;

	@Column(name = "tipo_contacto")
	private int tipoContacto;

	@Column(name = "fono_contacto")
	private Long fonoContacto;

	@Column(length = 500)
	private String observacion;

	@Column(name = "id_foto")
	private Long idFoto;

	@Column(name = "id_usuario")
	private Long idUsuario;	

	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@Transient
	private Integer port;
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Date getFechaIncorporacion() {
		return fechaIncorporacion;
	}
	public void setFechaIncorporacion(Date fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}
	public Long getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(Long idCargo) {
		this.idCargo = idCargo;
	}
	public Boolean getEsPensionado() {
		return esPensionado;
	}
	public void setEsPensionado(Boolean esPensionado) {
		this.esPensionado = esPensionado;
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
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
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
	public String getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public String getAfpInp() {
		return afpInp;
	}
	public void setAfpInp(String afpInp) {
		this.afpInp = afpInp;
	}
	public String getInstitucionSalud() {
		return institucionSalud;
	}
	public void setInstitucionSalud(String institucionSalud) {
		this.institucionSalud = institucionSalud;
	}
	public int getCargasFamiliares() {
		return cargasFamiliares;
	}
	public void setCargasFamiliares(int cargasFamiliares) {
		this.cargasFamiliares = cargasFamiliares;
	}
	public int getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(int sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public int getBonoColacion() {
		return bonoColacion;
	}
	public void setBonoColacion(int bonoColacion) {
		this.bonoColacion = bonoColacion;
	}
	public int getBonoMovilizacion() {
		return bonoMovilizacion;
	}
	public void setBonoMovilizacion(int bonoMovilizacion) {
		this.bonoMovilizacion = bonoMovilizacion;
	}
	public String getTipoContrato() {
		return tipoContrato;
	}
	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}
	public int getDuracionContrato() {
		return duracionContrato;
	}
	public void setDuracionContrato(int duracionContrato) {
		this.duracionContrato = duracionContrato;
	}
	public String getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	public String getTipoCuentaBancaria() {
		return tipoCuentaBancaria;
	}
	public void setTipoCuentaBancaria(String tipoCuentaBancaria) {
		this.tipoCuentaBancaria = tipoCuentaBancaria;
	}
	public String getBancoCuentaBancaria() {
		return bancoCuentaBancaria;
	}
	public void setBancoCuentaBancaria(String bancoCuentaBancaria) {
		this.bancoCuentaBancaria = bancoCuentaBancaria;
	}

}
