package com.example.etechPa.application.productoApplication;

import com.example.etechPa.domain.entities.producto.Producto;
import com.example.etechPa.domain.service.productoService.ProductoSaveService;
import com.example.etechPa.infrastructure.adapter.productoAdapter.ProductoSaveAdapter;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class ProductoSave {
  private final ProductoSaveService productoSaveService;

  public Producto saveProducto(Producto producto) {
      return productoSaveService.save(producto);
  }

}
