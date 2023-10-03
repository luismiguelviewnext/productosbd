package com.curso.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Representa un producto dentro del sistema. Esta entidad está mapeada a la tabla "productos"
 * en la base de datos.
 * 
 * @author Luis Miguel Albarracín Castillo
 */
@Entity
@Table(name ="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigoProducto;
    private String nombreProducto;
    private double precioUnitario;
    private int stock;

    /**
     * Constructor por defecto.
     */
    public Producto() {
        super();

    }
    /**
     * Constructor que inicializa el código del producto.
     * 
     * @param codigoProducto el código único del producto.
     */
    public Producto(int codigoProducto) {
        super();
        this.codigoProducto = codigoProducto;
    }

    /**
     * Constructor que inicializa todos los campos del producto.
     * 
     * @param codigoProducto el código único del producto.
     * @param nombreProducto el nombre del producto.
     * @param precioUnitario el precio unitario del producto.
     * @param stock la cantidad en stock del producto.
     */
    public Producto(int codigoProducto, String nombreProducto, double precioUnitario, int stock) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.precioUnitario = precioUnitario;
        this.stock = stock;
    
    }

    // Getters y setters ...
    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // Métodos hashCode, equals y toString ...
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoProducto;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (codigoProducto != other.codigoProducto)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Producto [codigoProducto=" + codigoProducto + ", producto=" + nombreProducto + ", precioUnitario="
                + precioUnitario + ", stock=" + stock + "]";
    }

    
    
    


    
    
}
