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
	
	@GetMapping("/{id}")
	private ResponseEntity<?> getClienteById(@PathVariable Long id){
		response.clear();
		response.put("cliente", clienteService.getClienteById(id));
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@PostMapping("/nuevo")
	private ResponseEntity<?> crearCliente(@RequestBody Cliente cliente){
		response.clear();
		clienteService.crearCliente(cliente);
		response.put("message", "save cliente successfully");
		return new ResponseEntity<>(response,HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{id}")
	private  ResponseEntity<?> updCliente(@PathVariable Long id,@RequestBody Cliente cliente){
		response.clear();
		clienteService.actCliente(id,cliente);
		response.put("message", "upd cliente successfully");
		return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<?> deleteClienteById(@PathVariable Long id){
		response.clear();
		clienteService.eliCliente(id);
		response.put("message", "delete cliente successfully");
		return new ResponseEntity<>(response,HttpStatus.ACCEPTED);
	}
}
