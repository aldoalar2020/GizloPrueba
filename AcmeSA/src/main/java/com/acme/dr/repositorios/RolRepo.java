package com.acme.dr.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.acme.dr.entidades.Rol;

@Repository
public interface RolRepo extends JpaRepository<Rol, Integer>{

	@Query("Select NVL(MAX(codRol),0) from Rol")
	public Integer obtieneMaxCodRol();

}
