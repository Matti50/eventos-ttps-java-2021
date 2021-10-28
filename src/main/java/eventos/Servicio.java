package eventos;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "servicio")
public class Servicio {
	
	@Id
	@Column(name = "servicio_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String nombre;
	private String descripcion;
	private String url;
	private String whatsapp;
	private String instagram;
	private String twitter;
	
	
	//navigation properties
	
	@ManyToOne
	@JoinColumn(name="usuario_id", nullable=false)
	private Usuario usuario;
	
	
	@OneToMany(mappedBy="servicio")
	private List<EventoDetail> evento_details;
	
	@ManyToOne
	@JoinColumn(name="tipo_servicio_id")
	private TipoServicio tipoServicio;
	
	@ElementCollection
	@CollectionTable(name="imagenes", joinColumns=@JoinColumn(name="servicio_id"))
	@Column(name="imagen_path", nullable=false)
	
	private Set<String> imagenes;
	
	public Set<String> getImagenes() {
		return imagenes;
	}

	public void setImagenes(Set<String> imagenes) {
		this.imagenes = imagenes;
	}

	public Servicio(String nombre, String descripcion, String url, String whatsapp, String instagram, String twitter, TipoServicio tipoServicio, Usuario usuario) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.url = url;
		this.whatsapp = whatsapp;
		this.instagram = instagram;
		this.twitter = twitter;
		this.tipoServicio = tipoServicio;
		this.usuario = usuario;
	}
	
	public Servicio() {
		
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public TipoServicio getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(TipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String agregarImagen(String imagen) {
		this.imagenes.add(imagen);
		return imagen;
	}
	
	
	
}
