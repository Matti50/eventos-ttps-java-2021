package hibernateDAO;

import eventos.Servicio;
import genericDao.ServicioDAO;

public class ServicioDAOHibernateJPA extends GenericDAOHibernateJPA<Servicio> implements ServicioDAO  {
	public ServicioDAOHibernateJPA() {
		super(Servicio.class);
	}


	
}