package com.example.etechPa.infrastructure.dto.productoDto;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "productos")
public class ProductoDto {
  @Id
  private String idProducto;
  @Column(name = "nombre" ,length = 30 ,nullable = false)
  private String nombre;
  @Column(name = "descripcion" ,length = 200 , nullable = false)
  private String descripcion;
  @Column(name = "precio" ,nullable = false )
  private float precio;
  @Column(name = "disponibilidad" ,nullable = false)
  private  boolean disponibilidad;
  @Column(name = "cantidad" , nullable = false)
  private int cantidad;


}
