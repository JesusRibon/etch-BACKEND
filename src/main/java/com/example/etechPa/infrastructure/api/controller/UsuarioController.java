package com.example.etechPa.infrastructure.api.controller;

import com.example.etechPa.application.usuarioApplication.UsuarioSave;

import com.example.etechPa.domain.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/usuario")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {
  private final  UsuarioSave usuarioSave;
  @PostMapping("/usuarios")
  public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario){
    return new ResponseEntity<>(usuarioSave.saveUsuario(usuario), HttpStatus.CREATED);
  }
}
