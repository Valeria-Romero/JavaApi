package com.example.valeria.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.valeria.models.UsuarioModel;
import com.example.valeria.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	public List<UsuarioModel> obtenerUsuarios(){
		return (List<UsuarioModel>) usuarioRepository.findAll();
	}
	
	public UsuarioModel guadarUsuario(UsuarioModel usuario) {
		return usuarioRepository.save(usuario);
	}
}
