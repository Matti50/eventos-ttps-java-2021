package eventos;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "evento")
public class Evento {


	public Evento( String nombre, String direccion, String codigo_postal, String provincia, String geo_x,
			String geo_y, LocalDateTime fecha, LocalDateTime hora, String email, String telefono, Usuario usuario,
			FormaDePago formaDePago, TipoEvento tipo_evento, List<EventoDetail> servicios_evento) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.codigo_postal = codigo_postal;
		this.provincia = provincia;
		this.geo_x = geo_x;
		this.geo_y = geo_y;
		this.fecha = fecha;
		this.hora = hora;
		this.email = email;
		this.telefono = telefono;
		this.usuario = usuario;
		this.formaDePago = formaDePago;
		this.tipo_evento = tipo_evento;
		this.servicios_evento = servicios_evento;
	}
	@Id
	@Column(name = "evento_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(nullable=false)
	private String nombre;
	@Column(nullable=false)
	private String direccion;
	@Column(nullable=false)
	private String codigo_postal;
	@Column(nullable=false)
	private String provincia;
	@Column(nullable=false)
	private String geo_x;
	@Column(nullable=false)
	private String geo_y;
	@Column(nullable=false)
	private LocalDateTime fecha;
	@Column(nullable=false)
	private LocalDateTime hora;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	private String telefono;




	//navigation properties
	@ManyToOne
	@JoinColumn(name="usuario_id", nullable=false)
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name="forma_pago_id")
	private FormaDePago formaDePago;

	@ManyToOne
	@JoinColumn(name="tipo_evento_id")
	private TipoEvento tipo_evento;

	@OneToMany(mappedBy="evento")
	private List<EventoDetail> servicios_evento;





	public Evento() {}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

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
		return tipo_evento;
	}
	public void setTipo_vento(TipoEvento tipo_vento) {
		this.tipo_evento = tipo_vento;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	public LocalDateTime getHora() {
		return hora;
	}
	public void setHora(LocalDateTime hora) {
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
	public List<EventoDetail> getServicios_evento() {
		return servicios_evento;
	}
	public void setServicios_evento(List<EventoDetail> servicios_evento) {
		this.servicios_evento = servicios_evento;
	}
	public FormaDePago getFormaDePago() {
		return formaDePago;
	}
	public void setFormaDePago(FormaDePago formaDePago) {
		this.formaDePago = formaDePago;
	}

}
