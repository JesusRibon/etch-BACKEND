package com.example.etechPa.application.productoApplication;

import com.example.etechPa.domain.entities.producto.Producto;
import com.example.etechPa.domain.service.productoService.ProductoGetService;
import com.example.etechPa.expeciones.ClienteExeption;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class ProductoGet {
  private final ProductoGetService productoGetService;


  public Producto getProducto(String idProducto , Producto producto){
    Producto producto1 = productoGetService.getProducto(producto.getIdProducto());
    if(producto1 != null){
      return productoGetService.getProducto(idProducto);
    }else{
      throw  new ClienteExeption("El prodcuto con el id "+ idProducto + "  no existe");
    }
  }


  public List<Producto> getListProducto(){
    return productoGetService.getListProducto();
  }
}
