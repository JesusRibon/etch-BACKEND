package com.example.etechPa.infrastructure.adapter.productoAdapter;

import com.example.etechPa.domain.entities.producto.Producto;
import com.example.etechPa.domain.service.productoService.ProductoUpdateService;
import com.example.etechPa.infrastructure.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoUpdateAdapter implements ProductoUpdateService {
  private final ProductoRepository productoRepository;

  @Transactional
  public void updateProducto(Producto producto, String idProducto) {

  }
}
