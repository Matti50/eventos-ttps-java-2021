package hibernateDAO;

import eventos.TipoEvento;
import genericDao.TipoEventoDAO;

public class TipoEventoDAOHibernateJPA extends GenericDAOHibernateJPA<TipoEvento> implements TipoEventoDAO  {
	public TipoEventoDAOHibernateJPA() {
		super(TipoEvento.class);
	}
	
}