package hibernateDAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import genericDao.EMF;
import genericDao.GenericDAO;

public class GenericDAOHibernateJPA<T> implements GenericDAO<T>  {

	
	
	protected Class<T> persistentClass;

	public GenericDAOHibernateJPA(Class <T> clase) {
		persistentClass = clase;
	}
	
	public Class<T> getPersistentClass() {
		return persistentClass;
	}
	
	@Override
	public T actualizar(T entity) {
		
		EntityManager em= EMF.getEMF();
		EntityTransaction etx= em.getTransaction();
		etx.begin();
		entity = em.merge(entity);
		etx.commit();
		em.close();
		return entity;
	}

	@Override
	public void borrar(T entity) {
		EntityManager em = EMF.getEMF();
		EntityTransaction tx = null;
		try {
		tx = em.getTransaction();
		tx.begin();
		//em.remove(entity);
		em.remove(em.contains(entity) ? entity : em.merge(entity));
		tx.commit();
		}
		catch (RuntimeException e) {
		if ( tx != null && tx.isActive() ) tx.rollback();
		throw e; // escribir en un log o mostrar un mensaje
		} finally {
		em.close();
		}
		
	}

	@Override
	public T borrar(Serializable id) {
		EntityManager em = EMF.getEMF();
		T entity=  em.find(this.getPersistentClass(), id) ;
				
		if (entity != null) {
			this.borrar(entity);
		}
		em.close();
		return entity;
		
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T persistir(T entity) {
		EntityManager em = EMF.getEMF();
		EntityTransaction tx = null;
		try {
		tx = em.getTransaction();
		tx.begin();
		em.persist(entity);
		tx.commit();
		}
		catch (RuntimeException e) {
		if ( tx != null && tx.isActive() ) tx.rollback();
		throw e; // escribir en un log o mostrar un mensaje
		}
		finally {
		em.close();
		}
		return entity;
	}

	@Override
	public T recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarTodos() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> recuperarTodos(String columnOrder) {
		Query consulta=
				EMF.getEMF().createQuery("select e from "+ getPersistentClass().getSimpleName()+" e order by e."+columnOrder);
				List<T> resultado = (List<T>)consulta.getResultList();
				return resultado;
				
	}
	

	@Override
	public List<T> recuperarTodosOrdenados(String columnOrder) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T encontrarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
