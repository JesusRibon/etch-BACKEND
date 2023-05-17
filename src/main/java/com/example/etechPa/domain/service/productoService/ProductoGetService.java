package com.example.etechPa.domain.service.productoService;

import com.example.etechPa.domain.entities.producto.Producto;
import java.util.List;

public interface ProductoGetService {
  Producto getProducto(String idProducto);

  List<Producto> getListProducto();


}
