package hibernateDAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import eventos.Evento;
import eventos.Servicio;
import eventos.Usuario;
import genericDao.EMF;
import genericDao.UsuarioDAO;

public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO  {
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}
		
	
}