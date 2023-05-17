package com.example.etechPa.infrastructure.adapter.productoAdapter;

import com.example.etechPa.domain.entities.producto.Producto;
import com.example.etechPa.domain.service.productoService.ProductoSaveService;
import com.example.etechPa.infrastructure.mapper.ProductoMapper;
import com.example.etechPa.infrastructure.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoSaveAdapter implements ProductoSaveService {
  private final ProductoRepository productoRepository;
  private final ProductoMapper productoMapper;

  @Override
  public Producto save(Producto producto) {
    return productoMapper.toProductoEntity(productoRepository.save(productoMapper.toProductoDto(producto)));
  }
}
