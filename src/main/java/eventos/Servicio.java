package eventos;

import java.util.List;
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
	//private List<String> imagenes;
	
	
	//navigation properties
	
	@ManyToMany(mappedBy="servicios")
	private List<Usuario> usuarios;
	
	
	@OneToMany(mappedBy="servicio")
	private List<EventoDetail> evento_details;
	
	@ManyToOne
	@JoinColumn(name="tipo_servicio_id")
	private TipoServicio tipoServicio;
	
	@OneToOne(mappedBy="servicio")
	private Valoracion valoracion;
	
	public Servicio(String nombre, String descripcion, String url, String whatsapp, String instagram, String twitter,
			List<String> imagenes, TipoServicio tipoServicio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.url = url;
		this.whatsapp = whatsapp;
		this.instagram = instagram;
		this.twitter = twitter;
		//this.imagenes = imagenes;
		this.tipoServicio = tipoServicio;
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
	/*public List<String> getImagenes() {
		return imagenes;
	}
	public void setImagenes(List<String> imagenes) {
		this.imagenes = imagenes;
	}*/
	public TipoServicio getTipoServicio() {
		return tipoServicio;
	}
	public void setTipoServicio(TipoServicio tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
}
