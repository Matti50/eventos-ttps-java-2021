package hibernateDAO;

import eventos.TipoServicio;
import genericDao.TipoServicioDAO;

public class TipoServicioDAOHibernateJPA extends GenericDAOHibernateJPA<TipoServicio> implements TipoServicioDAO  {
	public TipoServicioDAOHibernateJPA() {
		super(TipoServicio.class);
	}


	
}