package com.example.etechPa.domain.entities.producto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {
  @Id
  private String idProducto;
  private String nombre;
  private String descripcion;
  private float precio;
  private boolean disponibilidad;
  private int cantidad;
  private String urlImg;


}
