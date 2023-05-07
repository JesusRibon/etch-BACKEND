package com.example.etechPa.infrastructure.adapter.usuarioAdapter;

import com.example.etechPa.domain.service.usuarioService.UsuarioDeleteService;
import com.example.etechPa.infrastructure.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioDeleteAdapter implements UsuarioDeleteService {
  private final UsuarioRepository  usuarioRepository;

  @Override
  public void deleteUsuario(String idUsuario) {
    usuarioRepository.deleteById(idUsuario);
  }
}
