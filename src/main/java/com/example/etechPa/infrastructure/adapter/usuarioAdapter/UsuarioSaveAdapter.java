package com.example.etechPa.infrastructure.adapter.usuarioAdapter;


import com.example.etechPa.domain.entities.Usuario;
import com.example.etechPa.domain.service.usuarioService.UsuarioSaveService;
import com.example.etechPa.infrastructure.mapper.UsuarioMapper;
import com.example.etechPa.infrastructure.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioSaveAdapter implements UsuarioSaveService {
  private final UsuarioRepository usuarioRepository;
  private final UsuarioMapper usuarioMapper;
  @Override
  public Usuario save(Usuario usuario) {
    return usuarioMapper.toUsuarioEntity(usuarioRepository.save(usuarioMapper.toUsuarioDto(usuario)));
  }
}
