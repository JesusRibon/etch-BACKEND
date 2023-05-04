package com.example.etechPa.application.usuarioApplication;


import com.example.etechPa.domain.entities.Usuario;
import com.example.etechPa.domain.service.usuarioService.UsuarioSaveService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor

public class UsuarioSave {


  private final UsuarioSaveService usuarioSaveService;

  public Usuario saveUsuario(Usuario usuario){
    return usuarioSaveService.save( usuario);
  }

}
