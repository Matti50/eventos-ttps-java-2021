package eventos;

import javax.persistence.*;

@Entity
@Table(name = "evento_detail")
public class EventoDetail {
	
	@Id
	@Column(name = "evento_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(nullable=false)
	private String estado;
	
	
	//navigation properties
	@ManyToOne
	@JoinColumn(name="evento_id", nullable=false)
	private Evento evento;
	
	@ManyToOne
	@JoinColumn(name="servicio_id", nullable=false)
	private Servicio servicio;
	
	@OneToOne
	private Valoracion valoracion;
	
	public EventoDetail(String estado, Servicio servicio, Valoracion valoracion) {
		super();
		this.estado = estado;
		this.servicio = servicio;
		this.valoracion = valoracion;
	}
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
	
	public EventoDetail() {
		
	}
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}
	public Valoracion getValoracion() {
		return valoracion;
	}
	public void setValoracion(Valoracion valoracion) {
		this.valoracion = valoracion;
	}
}
