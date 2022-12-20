package com.skillweb.clientes.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillweb.clientes.model.Cliente;
import com.skillweb.clientes.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	private Map<String,Object> response = new HashMap<>();
	
	@GetMapping("/todosclientes")
	private ResponseEntity<?> findAllCliente(){
		
		response.clear();
		response.put("cliente", clienteService.getallCliente());
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@GetMapping("/{ident}")
	private ResponseEntity<?> getClienteById(@PathVariable Long ident){
		response.clear();
		response.put("cliente", clienteService.getClienteById(ident));
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@PostMapping("/nuevo")
	private ResponseEntity<?> crearCliente(@RequestBody Cliente cliente){
		response.clear();
		clienteService.crearCliente(cliente);
		response.put("message", "save cliente successfully");
		return new ResponseEntity<>(response,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{ident}")
	private  ResponseEntity<?> updCliente(@PathVariable Long ident,@RequestBody Cliente cliente){
		response.clear();
		clienteService.actCliente(ident,cliente);
		response.put("message", "upd cliente successfully");
		return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{ident}")
	private ResponseEntity<?> deleteClienteById(@PathVariable Long ident){
		response.clear();
		clienteService.eliCliente(ident);
		response.put("message", "delete cliente successfully");
		return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
	}
}
