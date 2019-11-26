package com.brauner.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brauner.cursomc.domain.Cliente;
import com.brauner.cursomc.repositories.ClienteRepository;
import com.brauner.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto Cliente não encontrado! ID:" + id + ", Tipo: " 
					+ Cliente.class.getName());
		}
		return obj;
	}
	
}
