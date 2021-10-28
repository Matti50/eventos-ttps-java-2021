package genericDao;

import java.util.List;

import eventos.Evento;
import eventos.Servicio;
import eventos.Usuario;


public interface UsuarioDAO extends GenericDAO<Usuario> {

	public List<Servicio> getServicios();

	public List<Evento> getEventos();
}
