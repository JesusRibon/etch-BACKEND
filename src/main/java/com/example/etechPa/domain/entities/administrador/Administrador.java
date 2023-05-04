package com.example.etechPa.domain.entities.administrador;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Administrador {
  @Id
  private String idAdmin;
  private String nombre;
  private String apellido;
  private String email;
  private String password;

}
