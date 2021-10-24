package eventos;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@Column(name = "usuario_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
	    return usuario_id;
	}


	
	public Usuario(String nombre, String apellido, String email, String password, Evento[] eventos,
			Servicio[] servicios) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.eventos = eventos;
		this.servicios = servicios;
	}
private Long usuario_id;
private String nombre;
private String apellido;
private String email;
private String password;
private Evento[] eventos;
private Servicio[] servicios;


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
public Evento[] getEventos() {
	return eventos;
}
public void setEventos(Evento[] eventos) {
	this.eventos = eventos;
}
public Servicio[] getServicios() {
	return servicios;
}
public void setServicios(Servicio[] servicios) {
	this.servicios = servicios;
}
	
	

}


