package eventos;

import javax.persistence.*;

@Entity
@Table(name = "valoracion")
public class Valoracion {
	
	@Id
	@Column(name = "valoracion_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	
	private	Integer puntuacionLimpieza;
	private	Integer puntuacionSimpatia;
	private	Integer puntuacionCalidadPrecio;
	private	Integer puntuacionDiseņo;
	private	Integer puntuacionSabor;
	
	
	//navigation properties
	@OneToOne
	private	Servicio servicio;
	
	public Valoracion() {}
	
	public Valoracion(Servicio servicio, Integer puntuacionLimpieza, Integer puntuacionSimpatia,
			Integer puntuacionCalidadPrecio, Integer puntuacionDiseņo, Integer puntuacionSabor) {
		super();
		this.servicio = servicio;
		this.puntuacionLimpieza = puntuacionLimpieza;
		this.puntuacionSimpatia = puntuacionSimpatia;
		this.puntuacionCalidadPrecio = puntuacionCalidadPrecio;
		this.puntuacionDiseņo = puntuacionDiseņo;
		this.puntuacionSabor = puntuacionSabor;
	}
	
	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Servicio getServicio() {
		return servicio;
	}
	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
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
	public Integer getPuntuacionDiseņo() {
		return puntuacionDiseņo;
	}
	public void setPuntuacionDiseņo(Integer puntuacionDiseņo) {
		this.puntuacionDiseņo = puntuacionDiseņo;
	}
	public Integer getPuntuacionSabor() {
		return puntuacionSabor;
	}
	public void setPuntuacionSabor(Integer puntuacionSabor) {
		this.puntuacionSabor = puntuacionSabor;
	}
	
}
