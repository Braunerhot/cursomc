package com.brauner.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "REST está funcionando! E respondendo a requisição da classe Categorias.";
	}
	
	//@RequestMapping(method=RequestMethod.DELETE)
	public String deletar() {
		return "REST está deletando os dados!";
	}
	
	//@RequestMapping(method=RequestMethod.POST)
	public String incluir() {
		return "REST está incluindo os dados!";
	}
	

}
