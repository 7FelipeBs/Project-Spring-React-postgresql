package com.felipebs.financialControl.model.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipebs.financialControl.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
