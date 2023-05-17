package com.example.etechPa.infrastructure.repository;

import com.example.etechPa.infrastructure.dto.productoDto.ProductoDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<ProductoDto , String> {
  @Query(nativeQuery = true , value = "update productos set nombre = :nombre , descripcion = :descripcion , precio = :precio , disponibilidad = :disponibilidad , cantidad = :cantidad where id_producto = :id_producto")
  @Modifying
  void updateProducto(@Param("id_producto") String id_producto,
                       @Param("nombre") String nombre,
                        @Param("descripcion") String descripcion,
                         @Param("precio") float precio,
                         @Param("disponibilidad")boolean disponibilidad,
                          @Param("cantidad") int cantidad);
}
