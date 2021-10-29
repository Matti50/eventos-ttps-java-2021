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
import genericDao.EventoDetailDAO;
import genericDao.FormaDePagoDAO;
import genericDao.ServicioDAO;
import genericDao.TipoServicioDAO;
import genericDao.UsuarioDAO;
import genericDao.ValoracionDAO;
import hibernateDAO.ServicioDAOHibernateJPA;
import eventos.Usuario;
import eventos.Valoracion;
public class EventosMain {

	public static void main(String[] args) {
		
		dbLoader.dbInitialize();

		long id =  2;
		long id2 = 7;
		long id3 = 3;
		long id4 = 2;
		
		UsuarioDAO userOnly = DaoFactory.getUsuarioDAO();
		// Lista los usuario por columna seleccionada.
		List<Usuario> usuariosOrdenados = userOnly.recuperarTodosOrdenados("apellido");
		for(int i = 0; i<usuariosOrdenados.size(); i++) {
			Usuario usuario = usuariosOrdenados.get(i);
			System.out.println(usuario.toString());
			
		};
		
		// Busca servicios de un usuario particular.
		ServicioDAO serviceDao = DaoFactory.getServicioDAO();
		EventoDAO event = DaoFactory.getEventoDAO();
		List<Servicio> serviciosDeUsuario = serviceDao.getServiciosForUser(id3);
		System.out.println(serviciosDeUsuario);
		System.out.println(event.getEventosForUser(4).toString());


		// UPDATE
		// Agrega valoracion a  servicio 1 y servicio 2 al evento 1 con update
		long id1 = 1;
		Valoracion valoracion1 = new Valoracion(null, 5, 4, 3, 2, 1);
		ValoracionDAO vd = DaoFactory.getValoracionDAO();
		vd.persistir(valoracion1);
		EventoDetailDAO eventd = DaoFactory.getEventoDetailDAO();
		EventoDetail detalle1 = eventd.recuperar(id1);
		detalle1.setValoracion(valoracion1);
		eventd.actualizar(detalle1);
		
		Valoracion valoracion2 = new Valoracion(null, 1, 1, 2, 2, 2);
		vd.persistir(valoracion2);
		EventoDetail detalle2 = eventd.recuperar(id);
		detalle2.setValoracion(valoracion2);
		eventd.actualizar(detalle2);
		
		
		// DELETE
		// Elimina un usuario 
		System.out.println("El usuario 1 existe: "+ userOnly.existe(id1));
		
		
		Usuario usuarioDelete = userOnly.recuperar(id1);
		userOnly.borrar(usuarioDelete);
		System.out.println("El usuario 3 fue eliminado.");
		System.out.println("El usuario 1 existe: "+ userOnly.existe(id1));
	


	}
}