package com.br.robertosantin.rest.data;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClientResource {
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = "application/json")
	public ClientRepresentation buscar(@PathVariable("id") Integer id) {
		System.out.println("Retornando cliente..." + id);
		
		ClientRepresentation cl = new ClientRepresentation("João da Silva");
		
		// Imaginando que o objeto não foi encontrado no BD
		if ( cl == null )
		{
			System.out.println("Cliente não encontrado...");
			throw new ResourceNotFoundException();
		}
		
		return cl;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
	public void excluir(@PathVariable("id") Integer id) {
		System.out.println("Excluindo o cliente..." + id);
	}
	
	
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public class ResourceNotFoundException extends RuntimeException {
	}
}
