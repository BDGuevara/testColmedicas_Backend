package test.colmedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.colmedicas.entity.Plan;

public interface IPlanRepository extends JpaRepository<Plan, Long> {

}
