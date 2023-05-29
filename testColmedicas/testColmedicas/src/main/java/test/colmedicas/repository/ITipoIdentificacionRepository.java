package test.colmedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.colmedicas.entity.TipoIdentificacion;

public interface ITipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Long> {

}
