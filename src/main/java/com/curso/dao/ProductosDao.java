package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.curso.model.Producto;

/**
 * Repositorio DAO para operaciones CRUD relacionadas con la entidad {@link Producto}.
 * Utiliza Spring Data JPA para proporcionar implementaciones estándar de métodos CRUD.
 * 
 * @author Luis Miguel Albarracín Castillo
 */
public interface ProductosDao extends JpaRepository<Producto, Integer> {

}
