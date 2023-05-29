package test.colmedicas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import test.colmedicas.entity.Plan;
import test.colmedicas.entity.TipoIdentificacion;
import test.colmedicas.entity.Usuario;
import test.colmedicas.repository.ITipoIdentificacionRepository;
import test.colmedicas.service.IPlanService;
import test.colmedicas.service.ITipoIdentificacionService;
import test.colmedicas.service.IUsuarioService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class TestColmedicasController {

	@Autowired
	IPlanService _plan;
	
	@Autowired
	ITipoIdentificacionService _tipoIdentificacion;
	
	@Autowired 
	IUsuarioService _user;
	
	@GetMapping(value="/planes", produces= {"application/json"}) 
	public List<Plan> ListarPlanes(){
		return _plan.ListarPlanes();
	}
	
	@GetMapping(value="/tipos", produces= {"application/json"}) 
	public List<TipoIdentificacion> ListarTipos(){
		return _tipoIdentificacion.ListarTiposIdentificacion();
	}
	
	@GetMapping(value="/usuarios", produces= {"application/json"}) 
	public List<Usuario> ListarUsuarios(){
		return _user.ListarUsuarios();
	}
	
	@GetMapping(value="usuarios/{id}", produces = {"application/json"})
	public ResponseEntity<Usuario> getUsuario(@PathVariable("id") int id){
		return new ResponseEntity<Usuario>(_user.BuscarUsuario(id), HttpStatus.OK);
	}
	
	@PostMapping(value = "/usuarios", consumes = {"application/json"}) 
	public ResponseEntity<Void> guardarUsuario(@RequestBody Usuario usuario){
		 TipoIdentificacion tipoIdentificacion = _tipoIdentificacion.BuscarTipo(usuario.getTipoidentificacion().getId()).orElse(null);
	     Plan plan = _plan.BuscarPlan(usuario.getPlan().getId()).orElse(null);
	     
	     if (tipoIdentificacion != null && plan != null) {
	            usuario.setTipoidentificacion(tipoIdentificacion);
	            usuario.setPlan(plan);
	     }
	        
		if(_user.agregarUsuario(usuario)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	
	@PutMapping(value="usuarios", consumes = {"application/json"})
	public ResponseEntity<Void> actualizarUsuario(@RequestBody Usuario usuario){
		TipoIdentificacion tipoIdentificacion = _tipoIdentificacion.BuscarTipo(usuario.getTipoidentificacion().getId()).orElse(null);
	     Plan plan = _plan.BuscarPlan(usuario.getPlan().getId()).orElse(null);
	     
	     if (tipoIdentificacion != null && plan != null) {
	            usuario.setTipoidentificacion(tipoIdentificacion);
	            usuario.setPlan(plan);
	     }
		
		_user.actualizarUsuario(usuario);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	@DeleteMapping(value="usuarios/{id}")
	public ResponseEntity<Void> eliminarPorId(@PathVariable("id") int id){
	    _user.eliminarUsuario(id);
	    return new ResponseEntity<Void>(HttpStatus.OK);
	}

	

	
}
