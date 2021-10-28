import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
import genericDao.ServicioDAO;
import genericDao.TipoServicioDAO;
import genericDao.UsuarioDAO;
import hibernateDAO.ServicioDAOHibernateJPA;
import eventos.Usuario;
public class EventosMain {

	public static void main(String[] args) {
		//EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventos");
		EMF.getEMF();
	
	DaoFactory daoFactory = new DaoFactory();
	Usuario user1 = new Usuario( "Nicolas", "Prieto", "malak32@gmail.com", "123456", null,null);
	Usuario user2 = new Usuario( "Matias", "Cicchitti", "matiascicchittimg@gmail.com", "123456", null,null);
	UsuarioDAO user1Dao= DaoFactory.getUsuarioDAO();
	UsuarioDAO user2Dao= DaoFactory.getUsuarioDAO();
	UsuarioDAO userOnly = DaoFactory.getUsuarioDAO();
	long id =  2;
	//user1Dao.persistir(user1);
	//user2Dao.persistir(user2);
	//user1Dao.borrar(id);
	
	
	Usuario user3 = new Usuario("Matias2", "Aguirre", "masmam@gmail.com", "123455", null, null);
	userOnly.persistir(user3);
	List<Evento> eventos = new ArrayList<>();
	Evento evento =(new Evento("evento de rutas",null,null,null,null,null,null,null,null,null,user3,null,null, null));
	//(Long id, String nombre, String direccion, String codigo_postal, String provincia, String geo_x,
	EventoDAO event = DaoFactory.getEventoDAO();
	event.persistir(evento);
	long id2 = 7;
	long id3 = 34;
	long id4 = 2;
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
	
	// Genera tipos de servicio en la base
	TipoServicio tipoServicio1= new TipoServicio("Catering");
	TipoServicio tipoServicio2= new TipoServicio("FoodTruck");
	
	TipoServicioDAO tsd = DaoFactory.getTipoServicioDAO();
	tsd.persistir(tipoServicio1);
	tsd.persistir(tipoServicio2);
	
	
	Servicio servicio1 = new Servicio ("Catering","catering full",null,null,null,null,tipoServicio1,user3);
	Servicio servicio2 = new Servicio ("Esto es un servicio de foodTruck","catering medio",null,null,null,null,tipoServicio2,user3);
	
	ServicioDAO serviceDao = DaoFactory.getServicioDAO();
	
	List<Servicio> serviciosChetos = serviceDao.getServiciosForUser(id4);
	System.out.println(serviciosChetos);
	System.out.println(event.getEventosForUser(4).toString());
	ServicioDAO servicio = DaoFactory.getServicioDAO();
	servicio.persistir(servicio1);
	servicio.persistir(servicio2);
	
			

	}
}