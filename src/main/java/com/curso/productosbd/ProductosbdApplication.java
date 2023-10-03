package com.curso.productosbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Punto de entrada principal para la aplicación Spring Boot relacionada con la gestión de productos.
 * Esta clase configura la localización de las entidades, repositorios, controladores y servicios dentro del proyecto.
 * 
 * @author Luis Miguel Albarracín Castillo
 */
@EntityScan(basePackages = {"com.curso.model"})
@EnableJpaRepositories(basePackages = {"com.curso.dao"})
@SpringBootApplication(scanBasePackages = {"com.curso.controller", "com.curso.service"})
public class ProductosbdApplication {

	/**
     * Método principal que inicia la aplicación Spring Boot.
     * 
     * @param args argumentos de línea de comando.
     */
	public static void main(String[] args) {
		SpringApplication.run(ProductosbdApplication.class, args);
	}

}
