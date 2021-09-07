package com.acme.dr.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.acme.dr.entidades.Aplicacion;

public interface AplicacionRepo extends JpaRepository<Aplicacion, Integer> {

	@Query("Select NVL(MAX(codAplicacion),0) from Aplicacion")
	public Integer obtieneMaxCodAplicacion();

}
