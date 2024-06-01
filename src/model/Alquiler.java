package model;

import java.util.Date;

/**
 *
 * @author Efrain
 */
public class Alquiler {

    private Cliente cliente;
    private Producto producto;
    private Date fechaInicioAlquiler;
    private Date fechaEntregaAlquiler; 
    private boolean alquilado; 

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, Producto producto, Date fechaInicioAlquiler, Date fechaEntregaAlquiler, boolean alquilado) {
        this.cliente = cliente;
        this.producto = producto;
        this.fechaInicioAlquiler = fechaInicioAlquiler;
        this.fechaEntregaAlquiler = fechaEntregaAlquiler;
        this.alquilado = alquilado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFechaInicioAlquiler() {
        return fechaInicioAlquiler;
    }

    public void setFechaInicioAlquiler(Date fechaInicioAlquiler) {
        this.fechaInicioAlquiler = fechaInicioAlquiler;
    }

    public Date getFechaEntregaAlquiler() {
        return fechaEntregaAlquiler;
    }

    public void setFechaEntregaAlquiler(Date fechaEntregaAlquiler) {
        this.fechaEntregaAlquiler = fechaEntregaAlquiler;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "cliente=" + cliente + ", producto=" + producto.getTitulo() + ", fechaInicioAlquiler=" + fechaInicioAlquiler + ", fechaEntregaAlquiler=" + fechaEntregaAlquiler + ", alquilado=" + alquilado + '}';
    }
    
}
