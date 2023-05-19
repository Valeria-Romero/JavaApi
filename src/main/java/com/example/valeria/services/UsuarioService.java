package com.example.valeria.services;

import java.util.List;
import java.util.Optional;

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
	
	public Optional<UsuarioModel> obtenerPorId(Long id){
		return usuarioRepository.findById(id);
	}
	
	public List<UsuarioModel> obtenerPorPrioridad(Integer prioridad){
		return usuarioRepository.findByPrioridad(prioridad);
	}
	
	public boolean eliminarUsuario(Long id) {
		try {
			usuarioRepository.deleteById(id);
			return true;
		} catch(Exception err) {
			return false;
		}
	}
}
