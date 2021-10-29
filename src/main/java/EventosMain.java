import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.time.LocalDateTime;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import eventos.Evento;
import eventos.EventoDetail;
import eventos.FormaDePago;
import eventos.Servicio;
import eventos.TipoEvento;
import eventos.TipoServicio;
import genericDao.DaoFactory;
import genericDao.EMF;
import genericDao.EventoDAO;
import genericDao.FormaDePagoDAO;
import genericDao.ServicioDAO;
import genericDao.TipoServicioDAO;
import genericDao.UsuarioDAO;
import hibernateDAO.ServicioDAOHibernateJPA;
import eventos.Usuario;
public class EventosMain {

	public static void main(String[] args) {
		
		dbLoader.dbInitialize();

		long id =  2;
		//user1Dao.borrar(id);
		//user1Dao.borrar(id);
		long id2 = 7;
		long id3 = 3;
		long id4 = 2;
		
		UsuarioDAO userOnly = DaoFactory.getUsuarioDAO();
		//System.out.println(userOnly.recuperar(id2).toString());
		System.out.println(userOnly.existe(id2));
		System.out.println(userOnly.existe(id3));
		
		List<Usuario> usuariosOrdenados = userOnly.recuperarTodosOrdenados("apellido");
		
		//userOnly.borrarTodos();		
		//List<Usuario> usuarios = userOnly.listar();
		for(int i = 0; i<usuariosOrdenados.size(); i++) {
			Usuario usuario = usuariosOrdenados.get(i);
			
			System.out.println(usuario.toString());
			
		};
		
		ServicioDAO serviceDao = DaoFactory.getServicioDAO();
		EventoDAO event = DaoFactory.getEventoDAO();
		List<Servicio> serviciosChetos = serviceDao.getServiciosForUser(id3);
		System.out.println(serviciosChetos);
		System.out.println(event.getEventosForUser(4).toString());

	
	
	
			

	}
}