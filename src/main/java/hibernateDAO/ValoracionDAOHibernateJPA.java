package hibernateDAO;

import eventos.Valoracion;
import genericDao.ValoracionDAO;

public class ValoracionDAOHibernateJPA extends GenericDAOHibernateJPA<Valoracion> implements ValoracionDAO  {
	public ValoracionDAOHibernateJPA() {
		super(Valoracion.class);
	}
	
}