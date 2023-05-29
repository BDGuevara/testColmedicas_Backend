package test.colmedicas.service;

import java.util.List;
import java.util.Optional;

import test.colmedicas.entity.Plan;

public interface IPlanService {
	
	public List<Plan> ListarPlanes();
	
	public Optional<Plan> BuscarPlan(long id);

}
