package genericDao;

import java.io.Serializable;
import java.util.List;

import eventos.Evento;

public interface EventoDAO extends GenericDAO<Evento> {
	
	public List<Evento> getEventosForUser(Serializable id);

}