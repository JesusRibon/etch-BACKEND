package com.example.etechPa.application.productoApplication;

import com.example.etechPa.domain.entities.producto.Producto;
import com.example.etechPa.domain.service.productoService.ProductoDeleteService;
import com.example.etechPa.domain.service.productoService.ProductoGetService;
import com.example.etechPa.expeciones.ClienteExeption;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoDelete {
  private final ProductoDeleteService productoDeleteService;
  private final ProductoGetService productoGetService;

  public void deleteProducto(String idProducto , Producto producto){
    Producto producto1 = productoGetService.getProducto(producto.getIdProducto());
    if(producto1 != null){
      productoDeleteService.deleteProducto(idProducto);
    }else{
      throw new ClienteExeption("El Producto que desea eliminar no existe");
    }
  }
}
