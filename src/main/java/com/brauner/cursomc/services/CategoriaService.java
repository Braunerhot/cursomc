package com.brauner.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brauner.cursomc.domain.Categoria;
import com.brauner.cursomc.repositories.CategoriaRepository;
import com.brauner.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! ID:" + id + ", Tipo: " 
					+ Categoria.class.getName());
		}
		return obj;
	}
	
}
