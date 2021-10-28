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
	Usuario user2 = new Usuario( "Matias", "Cicchitti", "matiascicchittimg@gmail.com", "123456", null,null);
	UsuarioDAO user1Dao= daoFactory.getUsuarioDAO();
	UsuarioDAO user2Dao= daoFactory.getUsuarioDAO();
	UsuarioDAO userOnly = daoFactory.getUsuarioDAO();
	long id =  2;
	user1Dao.persistir(user1);
	user2Dao.persistir(user2);
	//user1Dao.borrar(id);

	long id2 = 7;
	long id3 = 34;
	//System.out.println(userOnly.recuperar(id2).toString());
	System.out.println(userOnly.existe(id2));
	System.out.println(userOnly.existe(id3));
	
	List<Usuario> usuariosOrdenados = userOnly.recuperarTodosOrdenados("apellido");
	
	//userOnly.borrarTodos();
	
	
	//List<Usuario> usuarios = userOnly.listar();
	for(int i = 0; i<usuariosOrdenados.size(); i++) {
		Usuario usuario = usuariosOrdenados.get(i);
		
		System.out.println(usuario.toString());
		
	}
	
		

	}
}
