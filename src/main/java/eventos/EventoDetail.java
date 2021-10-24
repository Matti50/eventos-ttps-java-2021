package eventos;

import javax.persistence.*;

@Entity
@Table(name = "evento_detail")
public class EventoDetail {
	
	@Id
	@Column(name = "evento_detail_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String estado;
	private Servicio servicio;
	private Valoracion[] valoraciones;
	
	public EventoDetail(String estado, Servicio servicio, Valoracion[] valoraciones) {
		super();
		this.estado = estado;
		this.servicio = servicio;
		this.valoraciones = valoraciones;
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
	public Valoracion[] getValoraciones() {
		return valoraciones;
	}
	public void setValoraciones(Valoracion[] valoraciones) {
		this.valoraciones = valoraciones;
	}
}
