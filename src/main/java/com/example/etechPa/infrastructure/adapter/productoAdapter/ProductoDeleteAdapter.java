package com.example.etechPa.infrastructure.adapter.productoAdapter;

import com.example.etechPa.domain.service.productoService.ProductoDeleteService;
import com.example.etechPa.infrastructure.repository.ProductoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoDeleteAdapter implements ProductoDeleteService {
  private final ProductoRepository productoRepository;
  @Override
  public void deleteProducto(String idProducto) {
    productoRepository.deleteById(idProducto);
  }
}
