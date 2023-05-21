package com.example.etechPa.domain.entities;

import com.example.etechPa.domain.entities.Usuario;
import com.example.etechPa.domain.entities.producto.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Compra {
  private String idCompra;
  private Usuario usuario;
  private Producto producto;
  private String fecha;
  private float total;
  private String calificacion;
  private String fromaPago;
  private String comentario;

}
