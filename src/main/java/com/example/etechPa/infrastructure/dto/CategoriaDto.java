package com.example.etechPa.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "categorias")
public class CategoriaDto {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int idCategoria;
  private String descripcion;
}
