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
@Table(name = "mantenciones")
public class Mantencion implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "id_tipo_mantencion")
	private Long idTipoMantencion;
	
	@Column(name = "id_proveedor")
	private Long idProveedor;

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

	@Column(name = "nivel_cumple")
	private int nivelCumplimiento;
	
	@Column(name = "id_revisor")
	private Long idRevisor;	

	@Column(name = "fec_rev")
	@Temporal(TemporalType.DATE)
	private Date fechaRevision;		

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "mantencion_foto", 
		joinColumns = @JoinColumn(name = "id_tarea"),
		inverseJoinColumns = @JoinColumn(name = "id_foto"),
		uniqueConstraints = {@UniqueConstraint(columnNames = {"id_tarea", "id_foto"})}
	)	
	private List<Archivo> foto;

	@Column(name = "id_presupuesto")
	private Long idPresupuesto;
	
	@Column(name = "create_at")
	@Temporal(TemporalType.DATE)
	private Date createAt;

	@Transient
	private Integer port;

	private static final long serialVersionUID = 1L;

}
