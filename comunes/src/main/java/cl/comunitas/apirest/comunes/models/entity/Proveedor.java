package cl.comunitas.apirest.comunes.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provvedores")
public class Proveedor implements Serializable {
	
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
	
	@Column(nullable = false,length = 20)	
	private String grupo;
	
	@Column(name = "nivel_cumple")
	private int nivelCumplimiento;
	
	@Column(name = "contacto", length = 100)
	private String contactoEmergencia;

	@Column(name = "cargo_contacto")
	private String cargoContacto;

	@Column(name = "fono_contacto")
	private Long fonoContacto;
	
	private static final long serialVersionUID = 1L;

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getNivelCumplimiento() {
		return nivelCumplimiento;
	}

	public void setNivelCumplimiento(int nivelCumplimiento) {
		this.nivelCumplimiento = nivelCumplimiento;
	}

	public String getContactoEmergencia() {
		return contactoEmergencia;
	}

	public void setContactoEmergencia(String contactoEmergencia) {
		this.contactoEmergencia = contactoEmergencia;
	}

	public String getCargoContacto() {
		return cargoContacto;
	}

	public void setCargoContacto(String cargoContacto) {
		this.cargoContacto = cargoContacto;
	}

	public Long getFonoContacto() {
		return fonoContacto;
	}

	public void setFonoContacto(Long fonoContacto) {
		this.fonoContacto = fonoContacto;
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

}
