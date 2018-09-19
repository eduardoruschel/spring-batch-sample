package br.com.exemplo.dao;

import br.com.exemplo.model.Cliente;

public interface Dao<T> {
	
	 public void save(Cliente cliente);
	 
	 public Cliente getClienteByCpf(String cpf);

	 
}
