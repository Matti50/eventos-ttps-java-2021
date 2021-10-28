package hibernateDAO;

import eventos.Usuario;
import genericDao.UsuarioDAO;

public class UsuarioDAOHibernateJPA extends GenericDAOHibernateJPA<Usuario> implements UsuarioDAO  {
	public UsuarioDAOHibernateJPA() {
		super(Usuario.class);
	}

	@Override
	public boolean existeUsuario(String numeroAlu) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Usuario recuperarUsuario(String usuario) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}