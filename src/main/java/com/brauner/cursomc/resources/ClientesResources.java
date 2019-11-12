package com.brauner.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/clientes")
public class ClientesResources {
	
	@RequestMapping(method=RequestMethod.GET)
	 public String listar() {
		 return "Rest está funcionando! E respondendo a requisição da classe Clientes.";
	 }

}
