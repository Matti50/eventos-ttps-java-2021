package hibernateDAO;

import java.util.List;

import eventos.Evento;
import eventos.Servicio;
import eventos.Usuario;
import genericDao.UsuarioDAO;

public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO  {
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}
	


	@Override
	public List<Servicio> getServicios() {
		return null;
	}
	

	@Override
	public List<Evento> getEventos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}