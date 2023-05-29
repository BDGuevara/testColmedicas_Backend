package test.colmedicas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.colmedicas.entity.Plan;
import test.colmedicas.entity.TipoIdentificacion;
import test.colmedicas.repository.IPlanRepository;

@Service
public class PlanService implements IPlanService {
	
	@Autowired
	IPlanRepository _plan;
	
	@Override
	public List<Plan> ListarPlanes() {
		List<Plan> planes = _plan.findAll();
		return planes;
	}

	
	public Optional<Plan> BuscarPlan(long id) {
		return _plan.findById(id);
	}
}
