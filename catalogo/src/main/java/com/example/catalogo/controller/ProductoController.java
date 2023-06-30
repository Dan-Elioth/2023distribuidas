package com.example.catalogo.controller;

import com.example.catalogo.entity.Producto;
import com.example.catalogo.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @GetMapping()
    public List<Producto> list() {
        return productoService.listar();
    }

    @PostMapping()
    public Producto save(@RequestBody Producto producto) {
        return productoService.guardar(producto);
    }

    @GetMapping("/{id}")

    public Producto listById(@PathVariable(required = true) Integer id) {
        Producto producto = productoService.listarPorId(id).get();
        producto.setCategoria(producto.getCategoria());
        return producto;
    }
    @PutMapping()
    public Producto update(@RequestBody Producto producto){
        return productoService.actualizar(producto);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable(required = true) Integer id ){
        productoService.eliminarPorId(id);
    }
}
