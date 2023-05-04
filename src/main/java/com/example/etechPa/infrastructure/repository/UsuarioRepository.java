package com.example.etechPa.infrastructure.repository;

import com.example.etechPa.infrastructure.dto.usuarioDto.UsuarioDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioDto , String> {


}
