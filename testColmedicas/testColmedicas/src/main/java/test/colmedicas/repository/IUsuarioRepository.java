package test.colmedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.colmedicas.entity.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

	Usuario findByTipoidentificacionIdAndNumerodocumento(Long tipoidentificacionId, String numerodocumento);

}
