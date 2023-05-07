package com.example.etechPa.infrastructure.repository;

import com.example.etechPa.infrastructure.dto.usuarioDto.UsuarioDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioDto , String> {
  @Query(nativeQuery = true , value = "update usuarios set nombre = :nombre , apellido = :apellido , direccion = :direccion , telefono = :telefono, email = :email , password = :password where id_usuario = :id_usuario")
  @Modifying
  void updateUsuario(@Param("id_usuario") String id_usuario,
                     @Param("nombre") String nombre,
                     @Param("apellido") String apellido,
                      @Param("direccion") String direccion,
                      @Param("telefono") String telefono,
                      @Param("email") String email,
                      @Param("password") String password);

}
