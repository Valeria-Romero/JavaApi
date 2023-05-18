package com.example.valeria.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.valeria.models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository <UsuarioModel, Long> {
	public abstract List<UsuarioModel> findByPrioridad(Integer prioridad);
}
