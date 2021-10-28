package genericDao;

import hibernateDAO.EventoDAOHibernateJPA;
import hibernateDAO.ServicioDAOHibernateJPA;
import hibernateDAO.UsuarioDAOHibernateJPA;

public class DaoFactory {

	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOHibernateJPA();
	}

	public static EventoDAO getEventoDAO() {
		// TODO Auto-generated method stub
		return new EventoDAOHibernateJPA();
	}
	
	public static ServicioDAO getSerivicioDAO() {
		// TODO Auto-generated method stub
		return new ServicioDAOHibernateJPA();
	}
}
