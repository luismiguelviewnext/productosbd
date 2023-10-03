package com.curso.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.dao.ProductosDao;
import com.curso.model.Producto;

/**
 * Implementación del servicio que gestiona las operaciones relacionadas con los productos.
 * Esta clase proporciona la lógica de negocio para operaciones como listar productos, actualizar el stock y obtener el precio.
 * 
 * @author Luis Miguel Albarracín Castillo
 * @see ProductoService
 */
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductosDao productosDao;

    /**
     * Listar todos los productos disponibles.
     * 
     * @return Lista de productos.
     */
    @Override
    public List<Producto> listarProductos() {
        return productosDao.findAll();
    }

    /**
     * Actualiza el stock del producto dado su identificador.
     * 
     * @param stock Nuevo valor de stock.
     * @param id    Identificador del producto.
     */
    @Override
    public void actualizarStock(int stock, int id) {
        Producto producto = productosDao.findById(id).orElse(null);
        if (producto != null) {
            producto.setStock(stock);
            productosDao.save(producto);
        }
    }

    /**
     * Obtiene el precio de un producto específico dado su identificador.
     * 
     * @param id Identificador del producto.
     * @return Lista conteniendo el producto si es encontrado, lista vacía en caso contrario.
     */
    @Override
    public List<Producto> obtenerPrecio(int id) {
        Optional<Producto> productoOptional = productosDao.findById(id);
        if (productoOptional.isPresent()) {
            Producto producto = productoOptional.get();
            return Collections.singletonList(producto);
        } else {
            return Collections.emptyList();
        }
    }
}
