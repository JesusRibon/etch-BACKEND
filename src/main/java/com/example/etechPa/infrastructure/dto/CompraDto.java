package com.example.etechPa.infrastructure.dto;

import com.example.etechPa.infrastructure.dto.productoDto.ProductoDto;
import com.example.etechPa.infrastructure.dto.usuarioDto.UsuarioDto;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "compras")
public class CompraDto {
  @Id
  private String idCompra;
  @ManyToOne
  @JoinColumn(name= "usuario_id")
  private UsuarioDto usuario;
  @ManyToOne
  @JoinColumn(name= "producto_id")
  private ProductoDto producto;
  private String fecha;
  private float total;
  private String calificacion;
  private String fromaPago;
  private String comentario;


}
