package com.example.etechPa.infrastructure.api.requestDto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;



public class UsuarioRequestDto {

  private String idUsuario;

  private String nombre;

  private String apellido;

  private String direccion;

  private int telefono;

  private String email;

  private String password;

}
