package com.example.etechPa.infrastructure.adapter.usuarioAdapter;

import com.example.etechPa.domain.entities.Usuario;
import com.example.etechPa.domain.service.usuarioService.UsuarioUpdateService;
import com.example.etechPa.infrastructure.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioUpdateAdapter implements UsuarioUpdateService {
  private final UsuarioRepository usuarioRepository;

  @Transactional
  public void updateUsuario(Usuario usuario, String idUsuario) {

  }
}
