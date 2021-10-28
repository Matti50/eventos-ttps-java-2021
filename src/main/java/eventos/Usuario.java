package eventos;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	
	@Id
	@Column(name = "usuario_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usuario_id;
	
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	
	@OneToMany(mappedBy="usuario",cascade={CascadeType.REMOVE})
	private List<Evento> eventos;
	
	@OneToMany(mappedBy="usuario",cascade={CascadeType.REMOVE})
	private List<Servicio> servicios;
			
	public long getId() {
		return usuario_id;
	}
	
	public Usuario(){
		
	}

	public Usuario(String nombre, String apellido, String email, String password, List<Evento> eventos,
			List<Servicio> servicios) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.eventos = eventos;
		this.servicios = servicios;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}

	public List <Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(List<Servicio> servicios) {
		this.servicios = servicios;
	}
	
	@Override
	public String toString() {
		return "nombre: "+nombre+", apellido: " + apellido +", email: "+ email;
	}
	
	
	public Evento agregarEvento(Evento evento) {
		this.eventos.add(evento);
		return evento;
	}
	
}
