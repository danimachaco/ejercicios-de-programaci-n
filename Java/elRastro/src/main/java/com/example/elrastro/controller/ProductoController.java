package com.example.elrastro.controller;

import com.example.elrastro.repository.ProductoDAO;
import com.example.elrastro.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final ProductoDAO productoDAO;

    public ProductoController(ProductoDAO productoDAO) {
        this.productoDAO = productoDAO;
    }

    @GetMapping
    public List<Producto> listarProductos() {
        return productoDAO.listarProductos();
    }

    @PostMapping
    public Producto insertarProducto(@RequestBody Producto producto) {
        return productoDAO.insertarProducto(producto);
    }

    @DeleteMapping("/{numRef}")
    public void eliminarProducto(@PathVariable int numRef) {
        productoDAO.eliminarProducto(numRef);
    }
}
