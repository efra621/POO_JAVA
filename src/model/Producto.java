package model;

/**
 *
 * @author Efrain
 */

public abstract class Producto {
    
    protected int codigo; 
    protected String titulo;
    protected double precio;
    protected int cantidad; //Nuevo atributo para saber la cantidad de productos q se agregaron

    protected Producto() {
    }

    public Producto(int codigo, String titulo, double precio, int cantidad) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", titulo=" + titulo + ", precio=" + precio + '}';
    }
    
    public abstract void infoProduct();
    
 

}
