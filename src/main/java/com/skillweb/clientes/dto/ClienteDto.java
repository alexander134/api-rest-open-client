package com.skillweb.clientes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
	//@No
    private String nombre;
    //@NotEmpty(message = "Lastname is required!")
    private String apellido;
    //@NotEmpty(message = "Lastname is required!")
    private String telefono;

}
