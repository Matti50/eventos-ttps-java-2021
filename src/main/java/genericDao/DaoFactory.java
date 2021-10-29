package genericDao;

import hibernateDAO.EventoDAOHibernateJPA;
import hibernateDAO.EventoDetailDAOHibernateJPA;
import hibernateDAO.FormaDePagoDAOHibernateJPA;
import hibernateDAO.ServicioDAOHibernateJPA;
import hibernateDAO.TipoEventoDAOHibernateJPA;
import hibernateDAO.TipoServicioDAOHibernateJPA;
import hibernateDAO.UsuarioDAOHibernateJPA;
import hibernateDAO.ValoracionDAOHibernateJPA;

public class DaoFactory {

	public static UsuarioDAO getUsuarioDAO() {
		return new UsuarioDAOHibernateJPA();
	}

	public static EventoDAO getEventoDAO() {
		// TODO Auto-generated method stub
		return new EventoDAOHibernateJPA();
	}
	
	public static ServicioDAO getServicioDAO() {
		// TODO Auto-generated method stub
		return new ServicioDAOHibernateJPA();
	}
	
	public static TipoServicioDAO getTipoServicioDAO() {
		// TODO Auto-generated method stub
		return new TipoServicioDAOHibernateJPA();
	}
	
	public static FormaDePagoDAO getFormaDePagoDAO() {
		// TODO Auto-generated method stub
		return new FormaDePagoDAOHibernateJPA();
	}

	public static TipoEventoDAO getTipoEventoDAO() {
		
		return new TipoEventoDAOHibernateJPA();
	}
	
	public static ValoracionDAO getValoracionDAO() {
		
		return new ValoracionDAOHibernateJPA();
	}
	
	public static EventoDetailDAO getEventoDetailDAO() {
		
		return new EventoDetailDAOHibernateJPA();
	}

	
	
}
