package com.example.etechPa.application.usuarioApplication;

import com.example.etechPa.domain.entities.Usuario;
import com.example.etechPa.domain.service.usuarioService.UsuarioDeleteService;
import com.example.etechPa.domain.service.usuarioService.UsuarioGetService;
import com.example.etechPa.expeciones.ClienteExeption;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UsuarioDelete {
  private  final UsuarioDeleteService usuarioDeleteService;
  private final UsuarioGetService usuarioGetService;

  public void deleteUsuario(String idUsuario , Usuario usuario) {
    Usuario usuario1 = usuarioGetService.getUsuario(usuario.getIdUsuario());
    if(usuario1 != null){
      usuarioDeleteService.deleteUsuario(idUsuario);
    }else{
      throw  new ClienteExeption("el usuario que deseea elimianr con el id  "+ idUsuario + "  no existe " );
    }
  }

}
