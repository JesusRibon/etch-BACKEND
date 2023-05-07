package com.example.etechPa.infrastructure.mapper;


import com.example.etechPa.domain.entities.Usuario;
import com.example.etechPa.infrastructure.dto.usuarioDto.UsuarioDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
  UsuarioDto toUsuarioDto(Usuario usuario);

  @Mapping(target = "idUsuario" , source = "idUsuario")
  @Mapping(target = "nombre" , source = "nombre")
  @Mapping(target = "apellido" , source = "apellido")
  @Mapping(target = "direccion" , source = "direccion")
  @Mapping(target = "telefono" , source = "telefono")
  @Mapping(target = "email" , source = "email")
  @Mapping(target = " password" , source = " password")


  Usuario toUsuarioEntity(UsuarioDto usuarioDto);


}
