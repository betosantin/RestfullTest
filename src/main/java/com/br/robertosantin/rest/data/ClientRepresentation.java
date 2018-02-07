package com.br.robertosantin.rest.data;

public class ClientRepresentation {
	
	String nome;
	
	public ClientRepresentation( String nome ) {
		this.nome = nome;
	}

	
	@Override
	public String toString() {
		return nome;
	}
}
