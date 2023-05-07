package com.example.etechPa.infrastructure.api.controller;

import com.example.etechPa.application.usuarioApplication.UsuarioDelete;
import com.example.etechPa.application.usuarioApplication.UsuarioGet;
import com.example.etechPa.application.usuarioApplication.UsuarioSave;

import com.example.etechPa.application.usuarioApplication.UsuarioUpdate;
import com.example.etechPa.domain.entities.Usuario;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
  private final  UsuarioSave usuarioSave;
  private final UsuarioGet usuarioGet;
  private final UsuarioUpdate usuarioUpdate;

  private final UsuarioDelete usuarioDelete;
  @PostMapping("/usuarios")
  public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario){
    return new ResponseEntity<>(usuarioSave.saveUsuario(usuario), HttpStatus.CREATED);
  }
  @GetMapping("/usuarios")
  public ResponseEntity<List<Usuario>> getAllUsuario(){
    return ResponseEntity.ok(usuarioGet.getListUsuario());
  }

  @GetMapping("/usuarios/{idUsuario}")
  public ResponseEntity<Usuario> getUsuario(@PathVariable String idUsuario , Usuario usuario){
    return ResponseEntity.ok(usuarioGet.getUsuario(idUsuario , usuario));
  }
  @PutMapping("/usuarios/{idUsuario}")
  public void updateUsuario(@PathVariable String idUsuario , @RequestBody Usuario usuario){
    usuarioUpdate.updateUsuario(usuario , idUsuario);
  }
  @DeleteMapping("/usuarios/{idUsuario}")
  public void deleteUsuario(@PathVariable String idUsuario,  Usuario usuario){
    usuarioDelete.deleteUsuario(idUsuario, usuario);
  }
}
