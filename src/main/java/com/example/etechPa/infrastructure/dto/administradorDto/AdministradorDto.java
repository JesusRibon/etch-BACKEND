package com.example.etechPa.infrastructure.dto.administradorDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "administradores")
public class AdministradorDto {
  @Id
  private String idAdmin;
  @Column(name = "nombre" ,length = 30 ,nullable = false)
  private String nombre;
  @Column(name = "apellido",length = 30 ,nullable = false)
  private String apellido;
  @Column(name = "email" ,length = 50 , nullable = false , unique = true)
  private String email;
  @Column(name = "password", length = 50, nullable = false)
  private String password;

}
