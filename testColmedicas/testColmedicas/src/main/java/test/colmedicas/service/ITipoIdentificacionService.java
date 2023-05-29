package test.colmedicas.service;

import java.util.List;
import java.util.Optional;

import test.colmedicas.entity.TipoIdentificacion;

public interface ITipoIdentificacionService{
	
	public List<TipoIdentificacion> ListarTiposIdentificacion();
	public Optional<TipoIdentificacion> BuscarTipo(long id);
}
