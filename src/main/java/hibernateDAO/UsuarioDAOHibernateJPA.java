package hibernateDAO;

import java.io.Serializable;
import java.util.List;

import eventos.Evento;
import eventos.Servicio;
import eventos.Usuario;
import genericDao.UsuarioDAO;

public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO  {
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}
		
	
	
	
}