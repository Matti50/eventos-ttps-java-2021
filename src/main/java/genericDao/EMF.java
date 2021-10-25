package genericDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
	private static final EntityManagerFactory em = Persistence.createEntityManagerFactory("eventos");
	
	public static EntityManager getEMF() {
		return em.createEntityManager();
	}
}
