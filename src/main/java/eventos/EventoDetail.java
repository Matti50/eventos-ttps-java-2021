package eventos;

public class EventoDetail {
	public EventoDetail(String estado, Servicio servicio, Valoracion[] valoraciones) {
		super();
		this.estado = estado;
		this.servicio = servicio;
		this.valoraciones = valoraciones;
	}
	private String estado;
	private Servicio servicio;
	private Valoracion[] valoraciones;
	
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
