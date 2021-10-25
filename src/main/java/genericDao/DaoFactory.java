package genericDao;

import hibernateDAO.UsuarioDAOHibernateJPA;

public class DaoFactory {

	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOHibernateJPA();
	}
}
