package com.example.etechPa.application.productoApplication;

import com.example.etechPa.domain.entities.producto.Producto;
import com.example.etechPa.domain.service.productoService.ProductoGetService;
import com.example.etechPa.domain.service.productoService.ProductoUpdateService;
import com.example.etechPa.expeciones.ClienteExeption;
import com.example.etechPa.infrastructure.repository.ProductoRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ProductoUpdate implements ProductoUpdateService {
  private  final ProductoRepository productoRepository;
  private final ProductoGetService productoGetService;
  @Transactional
  public void updateProducto(Producto producto, String idProducto) {
    Producto producto1 = productoGetService.getProducto(producto.getIdProducto());
    if(producto1!= null) {
      productoRepository.updateProducto(producto.getIdProducto(),
          producto.getNombre(),
          producto.getDescripcion(),
          producto.getPrecio(),
          producto.isDisponibilidad(),
          producto.getCantidad(),
          producto.getUrlImg());
    }else{
      throw new ClienteExeption("El producto que desea actualizar no existe");
    }
  }
}
