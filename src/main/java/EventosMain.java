import java.util.List;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import eventos.Evento;
import eventos.Servicio;
import genericDao.DaoFactory;
import genericDao.EMF;
import genericDao.UsuarioDAO;
import eventos.Usuario;
public class EventosMain {

	public static void main(String[] args) {
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos");
		EMF.getEMF();
	
	DaoFactory daoFactory = new DaoFactory();
	Usuario user1 = new Usuario( "Nicolas", "Prieto", "malak32@gmail.com", "123456", null,null);
	Usuario user2 = new Usuario( "Nicolas2", "Prieto2", "malak32@gmail.com", "123456", null,null);
	UsuarioDAO user1Dao= daoFactory.getUsuarioDAO();
	UsuarioDAO user2Dao= daoFactory.getUsuarioDAO();
	long id =  2;
	user1Dao.persistir(user1);
	user2Dao.persistir(user2);
	user1Dao.borrar(id);
		

	}
}
