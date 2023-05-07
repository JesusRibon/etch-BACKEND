package com.example.etechPa.application.usuarioApplication;

import com.example.etechPa.domain.entities.Usuario;
import com.example.etechPa.domain.service.usuarioService.UsuarioGetService;
import com.example.etechPa.domain.service.usuarioService.UsuarioUpdateService;
import com.example.etechPa.expeciones.ClienteExeption;
import com.example.etechPa.infrastructure.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioUpdate implements UsuarioUpdateService {
  private final UsuarioRepository usuarioRepository;
  private final UsuarioGetService usuarioGetService;

  @Transactional
  public void updateUsuario(Usuario usuario, String idUsuario) {
    Usuario usuario1 = usuarioGetService.getUsuario(usuario.getIdUsuario());
    if(usuario1 !=null) {
      usuarioRepository.updateUsuario(usuario.getIdUsuario(),
            usuario.getNombre(),
            usuario.getApellido(),
            usuario.getDireccion(),
            usuario.getTelefono(),
            usuario.getEmail(),
            usuario.getPassword());
    }else{
      throw new ClienteExeption("El Usuario con id " + idUsuario + "no existe ");
    }
  }
}
