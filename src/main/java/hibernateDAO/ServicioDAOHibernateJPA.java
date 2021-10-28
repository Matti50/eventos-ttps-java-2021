package hibernateDAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;

import eventos.Servicio;
import genericDao.EMF;
import genericDao.ServicioDAO;

public class ServicioDAOHibernateJPA extends GenericDAOHibernateJPA<Servicio> implements ServicioDAO  {
	public ServicioDAOHibernateJPA() {
		super(Servicio.class);
	}

	
	public List<Servicio> getServiciosForUser(Serializable id){
		EntityManager em = EMF.getEMF();
		return (List<Servicio>)em.createQuery("select s from " + getPersistentClass().getSimpleName() +" s where usuario_id="+id ).getResultList();
	}
	
	
	
}