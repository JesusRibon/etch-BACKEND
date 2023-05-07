package com.example.etechPa.application.usuarioApplication;

import com.example.etechPa.domain.entities.Usuario;
import com.example.etechPa.domain.service.usuarioService.UsuarioGetService;
import com.example.etechPa.expeciones.ClienteExeption;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class UsuarioGet {
  private final UsuarioGetService usuarioGetService;

  public Usuario getUsuario(String idUsuario  , Usuario usuario){
    Usuario usuario1 = usuarioGetService.getUsuario(usuario.getIdUsuario());
    if(usuario1 != null){
      return usuarioGetService.getUsuario(idUsuario);
 }else {
      throw  new ClienteExeption("El usuario con el id :" + idUsuario + "no existe");
    }
  }

  public List<Usuario> getListUsuario() {
    return usuarioGetService.getListUsuario();
  }

}
