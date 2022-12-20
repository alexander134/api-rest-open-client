package com.skillweb.clientes.service;

import java.util.List;

import com.skillweb.clientes.dto.ClienteDto;
import com.skillweb.clientes.model.Cliente;

public interface ClienteService {
	Cliente getClienteById(Long ident);
	//ClienteDto getPersonById(Long id);
	List<Cliente> getallCliente();
	void crearCliente(Cliente cliente);
	void actCliente(Long ident,Cliente cliente);
	void eliCliente(Long ident);
}
