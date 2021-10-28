package genericDao;

import hibernateDAO.EventoDAOHibernateJPA;
import hibernateDAO.UsuarioDAOHibernateJPA;

public class DaoFactory {

	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOHibernateJPA();
	}

	public static EventoDAO getEventoDAO() {
		// TODO Auto-generated method stub
		return new EventoDAOHibernateJPA();
	}
}
