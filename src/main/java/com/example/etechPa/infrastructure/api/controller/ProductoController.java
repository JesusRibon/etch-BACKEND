package com.example.etechPa.infrastructure.api.controller;

import com.example.etechPa.application.productoApplication.ProductoDelete;
import com.example.etechPa.application.productoApplication.ProductoGet;
import com.example.etechPa.application.productoApplication.ProductoSave;
import com.example.etechPa.application.productoApplication.ProductoUpdate;
import com.example.etechPa.domain.entities.Usuario;
import com.example.etechPa.domain.entities.producto.Producto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping(path = "/producto")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductoController {

  private final ProductoSave productoSave;
  private final ProductoGet productoGet;
  private final ProductoUpdate productoUpdate;
  private final ProductoDelete productoDelete;

  @PostMapping("/productos")
  public ResponseEntity<Producto> saveProducto(@RequestBody Producto producto) {
    return new ResponseEntity<>(productoSave.saveProducto(producto) , HttpStatus.CREATED);
  }
  @GetMapping("/productos")
  public ResponseEntity<List<Producto>> getAllProducto(){
      return ResponseEntity.ok(productoGet.getListProducto());
  }
  @GetMapping("/productos/{idProducto}")
  public ResponseEntity<Producto> getProducto(@PathVariable String idProducto , Producto producto){
    return ResponseEntity.ok(productoGet.getProducto(idProducto, producto));
  }
  @PutMapping("/productos/{idProducto}")
  public void updateProducto(@PathVariable String idProducto , @RequestBody Producto producto){
    productoUpdate.updateProducto(producto , idProducto);
  }

  @DeleteMapping("/productos/{idProducto}")
  public void deleteProdcuto(@PathVariable String idProducto,  Producto producto){
    productoDelete.deleteProducto(idProducto , producto);
  }

}
