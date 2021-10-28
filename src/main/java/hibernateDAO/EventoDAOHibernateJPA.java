package hibernateDAO;

import eventos.Evento;
import genericDao.EventoDAO;

public class EventoDAOHibernateJPA extends GenericDAOHibernateJPA<Evento> implements EventoDAO  {
	public EventoDAOHibernateJPA() {
		super(Evento.class);
	}
}

