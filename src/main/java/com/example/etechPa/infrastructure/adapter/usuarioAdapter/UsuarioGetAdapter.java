package com.example.etechPa.infrastructure.adapter.usuarioAdapter;

import com.example.etechPa.domain.entities.Usuario;
import com.example.etechPa.domain.service.usuarioService.UsuarioGetService;
import com.example.etechPa.infrastructure.dto.usuarioDto.UsuarioDto;
import com.example.etechPa.infrastructure.mapper.UsuarioMapper;
import com.example.etechPa.infrastructure.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioGetAdapter implements UsuarioGetService {
  private final UsuarioRepository usuarioRepository;
  private final UsuarioMapper usuarioMapper;

  @Override
  public Usuario getUsuario(String idUsuario) {
    Optional<UsuarioDto> usuarioDto = usuarioRepository.findById(idUsuario);
    return usuarioDto.map(this::buildUsuario).orElse(null);
  }

  @Override
  public List<Usuario> getListUsuario() {
    List<UsuarioDto> usuariosDto = usuarioRepository.findAll();
    return usuariosDto.stream().map(usuarioMapper::toUsuarioEntity).toList();
  }


  private  Usuario buildUsuario(UsuarioDto usuario){
    return new Usuario(usuario.getIdUsuario() , usuario.getNombre(), usuario.getApellido(), usuario.getDireccion() , usuario.getTelefono(), usuario.getEmail(), usuario.getPassword() );
  }
}
