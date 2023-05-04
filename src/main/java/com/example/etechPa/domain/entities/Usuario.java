package com.example.etechPa.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario {

  private String idUsuario;

  private String nombre;

  private String apellido;

  private String direccion;

  private String telefono;

  private String email;

  private String password;


}
