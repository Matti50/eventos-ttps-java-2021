package genericDao;

import eventos.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {

	public boolean existeUsuario(String numeroAlu);

	public Usuario recuperarUsuario(String usuario);
}
