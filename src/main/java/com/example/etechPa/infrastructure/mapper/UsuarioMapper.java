package com.example.etechPa.infrastructure.mapper;


import com.example.etechPa.domain.entities.Usuario;
import com.example.etechPa.infrastructure.dto.usuarioDto.UsuarioDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
  UsuarioDto toUsuarioDto(Usuario usuario);


  Usuario toUsuarioEntity(UsuarioDto usuarioDto);


}
