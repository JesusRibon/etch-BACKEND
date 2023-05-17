package com.example.etechPa.infrastructure.mapper;

import com.example.etechPa.domain.entities.producto.Producto;
import com.example.etechPa.infrastructure.dto.productoDto.ProductoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
  ProductoDto toProductoDto(Producto producto);

  @Mapping(target = "idProducto" , source = "idProducto")
  @Mapping(target = "nombre" , source = "nombre")
  @Mapping(target = "descripcion" , source = "descripcion")
  @Mapping(target = "precio" , source = "precio")
  @Mapping(target = "disponibilidad" , source = "disponibilidad")
  @Mapping(target = "cantidad" , source = "cantidad")


  Producto toProductoEntity(ProductoDto productoDto);

}
