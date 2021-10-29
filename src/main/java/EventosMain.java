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
	
	
	// Genera formas de pago 
	
	FormaDePago formaDePago1 = new FormaDePago("Pagan los asistentes");
	FormaDePago formaDePago2 = new FormaDePago("Paga el organizador");
	FormaDePagoDAO fdp = DaoFactory.getFormaDePagoDAO();
	fdp.persistir(formaDePago1);
	fdp.persistir(formaDePago2);
	
	// Genera tipos de servicio en la base
	TipoServicio tipoServicio1= new TipoServicio("Catering");
	TipoServicio tipoServicio2= new TipoServicio("FoodTruck");
	
	TipoServicioDAO tsd = DaoFactory.getTipoServicioDAO();
	tsd.persistir(tipoServicio1);
	tsd.persistir(tipoServicio2);
	
	
	
	
	
	Usuario user3 = new Usuario("Matias333", "Aguirre", "masmam@gmail.com", "123455", new ArrayList<Evento>(), null);
	userOnly.persistir(user3);
	List<Evento> eventos = new ArrayList<>();
	Evento evento =(new Evento("evento tarrito","7 y 50","1900","Buenos Aires","00.50","60.40",LocalDateTime.now(),null,null,null,user3,formaDePago1,null, null));
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
	
	
	
	//userOnly.agregarEvento(user3, evento);
	
	
	

	
	Servicio servicio1 = new Servicio ("Catering","catering full",null,null,null,null,tipoServicio1,user3);
	Servicio servicio2 = new Servicio ("Esto es un servicio de foodTruck","catering medio",null,null,null,null,tipoServicio2,user3);
	
	
	
	
	//agregamos las imagenes seteando el array.
	HashSet<String> imagenes = new HashSet<String>();
	imagenes.add("/img1.png");
	servicio1.setImagenes(imagenes);
	
	ServicioDAO serviceDao = DaoFactory.getServicioDAO();
	
	List<Servicio> serviciosChetos = serviceDao.getServiciosForUser(id4);
	System.out.println(serviciosChetos);
	System.out.println(event.getEventosForUser(4).toString());
	ServicioDAO servicio = DaoFactory.getServicioDAO();
	servicio.persistir(servicio1);
	servicio.persistir(servicio2);
	
	servicio.addImageToService(servicio1, "/img2.jpg");
	
	servicio.borrar(servicio1);

	}
}