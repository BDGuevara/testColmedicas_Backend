package test.colmedicas.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import test.colmedicas.entity.Plan;
import test.colmedicas.entity.TipoIdentificacion;
import test.colmedicas.repository.ITipoIdentificacionRepository;

@Service
public class TipoIdentificacionService implements ITipoIdentificacionService {

	@Autowired
	ITipoIdentificacionRepository _tipo;
	
	@Override
	public List<TipoIdentificacion> ListarTiposIdentificacion() {
		List<TipoIdentificacion> tipos = _tipo.findAll();
		return tipos;
	}
	
	public Optional<TipoIdentificacion> BuscarTipo(long id) {
		return _tipo.findById(id);
	}
}
