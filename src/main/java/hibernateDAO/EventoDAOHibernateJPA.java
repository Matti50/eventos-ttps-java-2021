package hibernateDAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import eventos.Evento;
import genericDao.EMF;
import genericDao.EventoDAO;

public class EventoDAOHibernateJPA extends GenericDAOHibernateJPA<Evento> implements EventoDAO  {
	public EventoDAOHibernateJPA() {
		super(Evento.class);
	}
	
	
	public List<Evento> getEventosForUser(Serializable id) {

		EntityManager em = EMF.getEMF();
		return (List<Evento>) em
				.createQuery("select e from " + getPersistentClass().getSimpleName() + " e where usuario_id=" + id)
				.getResultList();

	}
	
	
	
	
}

