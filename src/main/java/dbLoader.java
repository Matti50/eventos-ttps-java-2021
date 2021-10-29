import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import eventos.Evento;
import eventos.EventoDetail;
import eventos.FormaDePago;
import eventos.Servicio;
import eventos.TipoEvento;
import eventos.TipoServicio;
import eventos.Usuario;
import eventos.Valoracion;
import genericDao.DaoFactory;
import genericDao.EMF;
import genericDao.EventoDAO;
import genericDao.EventoDetailDAO;
import genericDao.FormaDePagoDAO;
import genericDao.ServicioDAO;
import genericDao.TipoEventoDAO;
import genericDao.TipoServicioDAO;
import genericDao.UsuarioDAO;
import genericDao.ValoracionDAO;
import hibernateDAO.EventoDetailDAOHibernateJPA;

public class dbLoader {

	
	static void dbInitialize() {
		EMF.getEMF();
		// Carga usuarios
		Usuario user1 = new Usuario( "Nicolas", "Prieto", "malak32@gmail.com", "123456", null,null);
		Usuario user2 = new Usuario( "Matias", "Cicchitti", "matiascicchittimg@gmail.com", "123456", null,null);
		UsuarioDAO user1Dao= DaoFactory.getUsuarioDAO();
		UsuarioDAO user2Dao= DaoFactory.getUsuarioDAO();
		UsuarioDAO userOnly = DaoFactory.getUsuarioDAO();
		user1Dao.persistir(user1);
		user2Dao.persistir(user2);
		Usuario user3 = new Usuario("Matias333", "Aguirre", "masmam@gmail.com", "123455", new ArrayList<Evento>(), null);
		userOnly.persistir(user3);
		
		// Carga formas de pago 
		FormaDePago formaDePago1 = new FormaDePago("Pagan los asistentes");
		FormaDePago formaDePago2 = new FormaDePago("Paga el organizador");
		FormaDePagoDAO fdp = DaoFactory.getFormaDePagoDAO();
		fdp.persistir(formaDePago1);
		fdp.persistir(formaDePago2);
		
		// Carga tipos de servicio en la base
		TipoServicio tipoServicio1= new TipoServicio("Catering");
		TipoServicio tipoServicio2= new TipoServicio("FoodTruck");
		TipoServicioDAO tsd = DaoFactory.getTipoServicioDAO();
		tsd.persistir(tipoServicio1);
		tsd.persistir(tipoServicio2);
		
		
		// Carga tipos de evento
		TipoEvento tipoEvento1 = new TipoEvento("Aire Libre");
		TipoEvento tipoEvento2 = new TipoEvento("Casamiento");
		TipoEventoDAO ted = DaoFactory.getTipoEventoDAO();
		ted.persistir(tipoEvento2);
		ted.persistir(tipoEvento1);
		
		// Carga servicios para user3
		
		Servicio servicio1 = new Servicio ("Catering","catering full",null,null,null,null,tipoServicio1,user3);
		Servicio servicio2 = new Servicio ("Esto es un servicio de foodTruck","catering medio",null,null,null,null,tipoServicio2,user3);
		// Carga imagen en servicio1
		HashSet<String> imagenes = new HashSet<String>();
		imagenes.add("/img1.png");
		servicio1.setImagenes(imagenes);
		
		ServicioDAO servicio = DaoFactory.getServicioDAO();
		servicio.persistir(servicio1);
		servicio.persistir(servicio2);
		
		//Agrega imagen cuando el servicio ya esta creado
		servicio.addImageToService(servicio1, "/img2.jpg");
		
			
		// Carga evento para user3
		List<Evento> eventos = new ArrayList<>();
		Evento evento1 =(new Evento("evento publico","7 y 50","1900","Buenos Aires","00.50","60.40",LocalDateTime.now(),LocalDateTime.now(),"mail@mail.com","123456789",user3,formaDePago1,tipoEvento1,null));
		Evento evento2 =(new Evento("evento privado","7 y 50","1900","Buenos Aires","00.50","60.40",LocalDateTime.now(),LocalDateTime.now(),"mail@mail.com","123456789",user3,formaDePago2,tipoEvento2, null));
		EventoDAO event = DaoFactory.getEventoDAO();
		event.persistir(evento1);
		event.persistir(evento2);
		
		
		// Agrega eventoDetail al evento1 ya creado.
		EventoDetail detalle1 = new EventoDetail("Confirmado",evento1,servicio1,null);
		EventoDetail detalle2 = new EventoDetail("Confirmado",evento1,servicio2,null);
		EventoDetailDAO eventd = DaoFactory.getEventoDetailDAO();
		eventd.persistir(detalle1);
		eventd.persistir(detalle2);
		//ArrayList<EventoDetail> serviciosEvento =  new ArrayList<EventoDetail>();
		//serviciosEvento.add(detalle1);
		//serviciosEvento.add(detalle2);
		//evento1.setServicios_evento(serviciosEvento);
		//event.actualizar(evento1);
		
		
	
		
		
	}
}
	

