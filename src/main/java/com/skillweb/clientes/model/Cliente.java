package com.skillweb.clientes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.data.annotation.PersistenceCreator;

//import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
//@NoArgsConstructor
@Table(name="cliente")
public class Cliente {
	
	//@PersistenceCreator
	//@JsonCreator
	/*public Cliente(Long identificador, String nombre, String apellido, String telefono) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
	}*/
	
	public Cliente(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long identificador;
	private String nombre;
	private String apellido;
	
	private String telefono;
	public Long getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Long identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
