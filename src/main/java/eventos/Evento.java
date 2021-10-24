package eventos;

import java.sql.Time;
import java.util.Date;

public class Evento {
	
	public Evento(String nombre, String direccion, String codigo_postal, String provincia, String geo_x, String geo_y,
			TipoEvento tipo_vento, Date fecha, Time hora, String email, String telefono,
			EventoDetail[] servicios_evento, FormaDePago formaDePago) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigo_postal = codigo_postal;
		this.provincia = provincia;
		this.geo_x = geo_x;
		this.geo_y = geo_y;
		this.tipo_vento = tipo_vento;
		this.fecha = fecha;
		this.hora = hora;
		this.email = email;
		this.telefono = telefono;
		this.servicios_evento = servicios_evento;
		this.formaDePago = formaDePago;
	}

	private String nombre;
	private String direccion;
	private String codigo_postal;
	private String provincia;
	private String geo_x;
	private String geo_y;
	private TipoEvento tipo_vento;
	private Date fecha;
	private Time hora;
	private String email;
	private String telefono;
	private EventoDetail[] servicios_evento;
	private FormaDePago formaDePago;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCodigo_postal() {
		return codigo_postal;
	}
	public void setCodigo_postal(String codigo_postal) {
		this.codigo_postal = codigo_postal;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getGeo_x() {
		return geo_x;
	}
	public void setGeo_x(String geo_x) {
		this.geo_x = geo_x;
	}
	public String getGeo_y() {
		return geo_y;
	}
	public void setGeo_y(String geo_y) {
		this.geo_y = geo_y;
	}
	public TipoEvento getTipo_vento() {
		return tipo_vento;
	}
	public void setTipo_vento(TipoEvento tipo_vento) {
		this.tipo_vento = tipo_vento;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Time getHora() {
		return hora;
	}
	public void setHora(Time hora) {
		this.hora = hora;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public EventoDetail[] getServicios_evento() {
		return servicios_evento;
	}
	public void setServicios_evento(EventoDetail[] servicios_evento) {
		this.servicios_evento = servicios_evento;
	}
	public FormaDePago getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}

}
