package com.brauner.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brauner.cursomc.domain.Produto;

@RestController
@RequestMapping(value="/produtos")
public class ProdutoResources {
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Produto> listar(){
		
		Produto pro1 = new Produto(1, "Mesa para computador", 99.00);
		Produto pro2 = new Produto(2, "Mouse Pad", 5.00);
		Produto pro3 = new Produto(3, "Cadeira Reclinavel", 75.00);
		
		List<Produto> lista = new ArrayList<>();
		lista.add(pro1);
		lista.add(pro2);
		lista.add(pro3);
		
		return lista;
	}

}
