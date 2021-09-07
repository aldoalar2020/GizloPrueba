package com.acme.dr.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.acme.dr.entidades.Usuario;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Integer> {

	@Query("Select NVL(MAX(codUsuario),0) from Usuario")
	public Integer obtenerMaxCodUsuario();

	@Query("Select u from Usuario u where u.usuario = ?1")
	public Usuario obtieneUsuario(String usuario);

}
