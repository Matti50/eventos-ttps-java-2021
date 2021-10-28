package genericDao;

import java.io.Serializable;
import java.util.List;

import eventos.Servicio;

public interface ServicioDAO extends GenericDAO<Servicio> {
	
	public List<Servicio> getServiciosForUser(Serializable user_id);
	
	public String addImageToService(Servicio servicio, String imagen);
	
}
