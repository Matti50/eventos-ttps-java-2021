package hibernateDAO;

import eventos.EventoDetail;
import genericDao.EventoDetailDAO;

public class EventoDetailDAOHibernateJPA extends GenericDAOHibernateJPA<EventoDetail> implements EventoDetailDAO  {
	public EventoDetailDAOHibernateJPA() {
		super(EventoDetail.class);
	}
	
}