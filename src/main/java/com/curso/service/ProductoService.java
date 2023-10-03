package com.curso.service;

import java.util.List;

import com.curso.model.Producto;

public interface ProductoService {
    
    //Exponer la lista de productos existente
    List<Producto> listarProductos();

    // Actualizar el stock de un producto partiendo de su id
    void actualizarStock(int stock, int id);

    //Obtener el precio de un producto
    List<Producto> obtenerPrecio(int id);
}
