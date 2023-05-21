package com.example.etechPa.infrastructure.dto.usuarioDto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "usuarios")
public class UsuarioDto {
  @Id
  @Column(name = "id_usuario" ,length = 30 )
  private String idUsuario;
  @Column(name = "nombre" ,length = 30 )
  private String nombre;
  @Column(name = "apellido" , length = 30)
  private String apellido;
  @Column(name = "direccion" , length = 60 )
  private String direccion;
  @Column(name = "telefono" )
  private String telefono;
  @Column(name = "email" , length = 50 , unique = true)
  private String email;
  @Column(name = "password" , length = 50)
  private String password;

}
