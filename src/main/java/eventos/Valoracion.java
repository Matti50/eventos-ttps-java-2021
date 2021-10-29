package eventos;

import javax.persistence.*;

@Entity
@Table(name = "valoracion")
public class Valoracion {
	
	@Id
	@Column(name = "valoracion_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(nullable=false)
	private	Integer puntuacionLimpieza;
	@Column(nullable=false)
	private	Integer puntuacionSimpatia;
	@Column(nullable=false)
	private	Integer puntuacionCalidadPrecio;
	@Column(nullable=false)
	private	Integer puntuacionDise�o;
	@Column(nullable=false)
	private	Integer puntuacionSabor;
	
	
	//navigation properties
	
	@OneToOne(optional = true, mappedBy="valoracion")
	private EventoDetail eventoDetail;
	
	
	public Valoracion() {}
	
	public Valoracion(Servicio servicio, Integer puntuacionLimpieza, Integer puntuacionSimpatia,
			Integer puntuacionCalidadPrecio, Integer puntuacionDise�o, Integer puntuacionSabor) {
		super();
		this.puntuacionLimpieza = puntuacionLimpieza;
		this.puntuacionSimpatia = puntuacionSimpatia;
		this.puntuacionCalidadPrecio = puntuacionCalidadPrecio;
		this.puntuacionDise�o = puntuacionDise�o;
		this.puntuacionSabor = puntuacionSabor;
	}
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Integer getPuntuacionLimpieza() {
		return puntuacionLimpieza;
	}
	public void setPuntuacionLimpieza(Integer puntuacionLimpieza) {
		this.puntuacionLimpieza = puntuacionLimpieza;
	}
	public Integer getPuntuacionSimpatia() {
		return puntuacionSimpatia;
	}
	public void setPuntuacionSimpatia(Integer puntuacionSimpatia) {
		this.puntuacionSimpatia = puntuacionSimpatia;
	}
	public Integer getPuntuacionCalidadPrecio() {
		return puntuacionCalidadPrecio;
	}
	public void setPuntuacionCalidadPrecio(Integer puntuacionCalidadPrecio) {
		this.puntuacionCalidadPrecio = puntuacionCalidadPrecio;
	}
	public Integer getPuntuacionDise�o() {
		return puntuacionDise�o;
	}
	public void setPuntuacionDise�o(Integer puntuacionDise�o) {
		this.puntuacionDise�o = puntuacionDise�o;
	}
	public Integer getPuntuacionSabor() {
		return puntuacionSabor;
	}
	public void setPuntuacionSabor(Integer puntuacionSabor) {
		this.puntuacionSabor = puntuacionSabor;
	}
	
}
