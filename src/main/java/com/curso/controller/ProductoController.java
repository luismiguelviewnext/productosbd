package com.curso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.model.Producto;
import com.curso.service.ProductoService;

/**
 * Controlador REST para gestionar operaciones relacionadas con productos.
 * 
 * @author Luis Miguel Albarracín Castillo
 */
@RestController
public class ProductoController {

    @Autowired
    ProductoService productoService;

    /**
     * Obtiene una lista de todos los productos disponibles.
     *
     * @return una lista de objetos {@link Producto}.
     */
    @GetMapping(value="producto", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }

    /**
     * Actualiza el stock de un producto específico.
     *
     * @param id el ID del producto a actualizar.
     * @param stock la nueva cantidad de stock para el producto.
     */
    @PutMapping(value="producto/{id}/{stock}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarStock(@PathVariable("id") int id, @PathVariable("stock") int stock) {
        productoService.actualizarStock(id, stock);
    }

    /**
     * Obtiene el precio de un producto específico a partir de su ID.
     *
     * @param id el ID del producto del que se quiere obtener el precio.
     * @return una lista con el objeto {@link Producto} correspondiente, o una lista vacía si no se encuentra.
     */
    @GetMapping(value="producto/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Producto> obtenerPrecio(@PathVariable("id") int id) {
        return productoService.obtenerPrecio(id);
    }    
}
