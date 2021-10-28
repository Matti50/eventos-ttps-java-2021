package hibernateDAO;

import eventos.FormaDePago;
import genericDao.FormaDePagoDAO;


public class FormaDePagoDAOHibernateJPA extends GenericDAOHibernateJPA<FormaDePago> implements FormaDePagoDAO  {
	public FormaDePagoDAOHibernateJPA() {
		super(FormaDePago.class);
	}


	
}