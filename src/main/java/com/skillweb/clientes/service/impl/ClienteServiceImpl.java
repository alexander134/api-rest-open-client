package com.skillweb.clientes.service.impl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillweb.clientes.model.Cliente;
import com.skillweb.clientes.repository.ClienteRepository;
import com.skillweb.clientes.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteRepository clienteRepositore;

	@Override
	public Cliente getClienteById(Long ident) {
		// TODO Auto-generated method stub
		return clienteRepositore.findById(ident).orElse(null);
	}

	@Override
	public List<Cliente> getallCliente() {
		//List<Cliente> cliente = clienteRepositore.findAll();
		return clienteRepositore.findAll();
	}

	@Override
	public void crearCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		clienteRepositore.save(cliente);
	}

	@Override
	public void actCliente(Long ident, Cliente cliente) {
		// TODO Auto-generated method stub
		/*Cliente cliente1 = clienteRepositore.findById(id).orElse(cliente);
		if(cliente1==null){
			//new Exception("no found cliente");
		}*/
		Cliente cliente2 = clienteRepositore.findById(ident).orElseThrow(
				()->new NoSuchElementException("no")
				);
		cliente2.setNombre(cliente.getNombre());
		cliente2.setApellido(cliente.getApellido());
		cliente2.setTelefono(cliente.getTelefono());
		clienteRepositore.save(cliente2);
	}

	@Override
	public void eliCliente(Long ident) {
		// TODO Auto-generated method stub
		clienteRepositore.deleteById(ident);
	}
	

}
