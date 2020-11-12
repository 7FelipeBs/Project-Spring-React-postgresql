package com.felipebs.financialControl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.felipebs.financialControl.model.entity.Usuario;
import com.felipebs.financialControl.model.repositorys.UsuarioRepository;
import com.felipebs.financialControl.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario autenticar(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		// TODO Auto-generated method stub
		
	}

}
