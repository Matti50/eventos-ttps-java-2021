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

		// Agrega valoracion a servicio 1 al evento 1 .
		long id1 = 1;

		Valoracion valoracion1 = new Valoracion(null, 5, 4, 3, 2, 1);
		ValoracionDAO vd = DaoFactory.getValoracionDAO();
		vd.persistir(valoracion1);

		EventoDetailDAO eventd = DaoFactory.getEventoDetailDAO();
		EventoDetail detalle1 = eventd.recuperar(id1);
		detalle1.setValoracion(valoracion1);
		eventd.actualizar(detalle1);

		// Agrega valoracion a servicio 2 al evento 1 .
		Valoracion valoracion2 = new Valoracion(null, 1, 1, 2, 2, 2);
		vd.persistir(valoracion2);
		EventoDetail detalle2 = eventd.recuperar(id);
		detalle2.setValoracion(valoracion2);
		eventd.actualizar(detalle2);



	}
}
