package com.example.etechPa.domain.service.usuarioService;

import com.example.etechPa.domain.entities.Usuario;
import java.util.List;

public interface UsuarioGetService {
  Usuario getUsuario(String idUsuario);

  List<Usuario> getListUsuario();

}
