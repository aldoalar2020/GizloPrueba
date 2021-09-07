package com.acme.dr.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.acme.dr.entidades.RolAplicacion;

@Repository
public interface RolAplicaRepo extends JpaRepository<RolAplicacion, Integer>{
	
	@Query("Select NVL(MAX(codRolAplica),0) from RolAplicacion")
	public Integer obtenerMaxCodRolAplica();

	@Query("Select x from RolAplicacion x where x.rol.codRol = ?1")
	public List<RolAplicacion> obtenerAplicacionesRol(Integer codRol);

}
