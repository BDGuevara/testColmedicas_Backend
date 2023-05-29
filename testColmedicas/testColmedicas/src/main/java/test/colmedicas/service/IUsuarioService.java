package test.colmedicas.service;

import java.util.List;

import test.colmedicas.entity.Usuario;

public interface IUsuarioService {

	public List<Usuario> ListarUsuarios();
	
	public Usuario BuscarUsuario(long id);
	
	public boolean agregarUsuario(Usuario usuario);
	
	public boolean actualizarUsuario(Usuario usuario);
	
	public void eliminarUsuario(long id);
	
}
