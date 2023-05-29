package test.colmedicas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.colmedicas.entity.Usuario;
import test.colmedicas.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	IUsuarioRepository _usuario;
	
	@Override
	public List<Usuario> ListarUsuarios() {
		List<Usuario> usuarios = _usuario.findAll();
		return usuarios;
	}
	
	@Override
	public boolean agregarUsuario(Usuario usuario) {

		 Usuario existingUser = this.findByTipoidentificacionIdAndNumerodocumento(
				    usuario.getTipoidentificacion().getId(), 
				    usuario.getNumerodocumento());

				  if (existingUser != null) {
				    return false;
				  } else {
					  _usuario.save(usuario);
				    return true;
				  }
			  
		
		
	}
	
	@Override
	public boolean actualizarUsuario(Usuario usuario) {
	    Optional<Usuario> usuarioExistente = _usuario.findById(usuario.getId());

	    if (usuarioExistente.isPresent()) {
	        _usuario.save(usuario);
	        return true;
	    }

	    return false;
	}
	
		
	
	@Override
	public void eliminarUsuario(long id) {
		_usuario.deleteById(id);
	}

	@Override
	public Usuario BuscarUsuario(long id) {
		// TODO Auto-generated method stub
		return _usuario.findById(id).orElse(null);
	}
	
	
	public Usuario findByTipoidentificacionIdAndNumerodocumento(Long tipoDocumentoId, String numerodocumento){
		  return _usuario.findByTipoidentificacionIdAndNumerodocumento(tipoDocumentoId, numerodocumento);
		}
	
}
