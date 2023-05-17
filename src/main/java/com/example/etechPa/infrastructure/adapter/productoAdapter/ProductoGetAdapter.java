package com.example.etechPa.infrastructure.adapter.productoAdapter;

import com.example.etechPa.domain.entities.producto.Producto;
import com.example.etechPa.domain.service.productoService.ProductoGetService;
import com.example.etechPa.infrastructure.dto.productoDto.ProductoDto;
import com.example.etechPa.infrastructure.mapper.ProductoMapper;
import com.example.etechPa.infrastructure.repository.ProductoRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoGetAdapter implements ProductoGetService {
  private final ProductoRepository productoRepository;
  private final ProductoMapper productoMapper;

  @Override
  public Producto getProducto(String idProducto) {
    Optional<ProductoDto> productoDto = productoRepository.findById(idProducto);
    return productoDto.map(this::buildProducto).orElse(null);
  }

  @Override
  public List<Producto> getListProducto() {
    List<ProductoDto> productosDto= productoRepository.findAll();
    return productosDto.stream().map(productoMapper::toProductoEntity).toList();
  }


  private Producto buildProducto(ProductoDto producto) {
      return new Producto(producto.getIdProducto() , producto.getNombre(), producto.getDescripcion() , producto.getPrecio() , producto.isDisponibilidad() , producto.getCantidad());
  }
}
