package controller;

import java.util.ArrayList;
import java.util.Date;
import model.Alquiler;
import model.Cliente;
import model.Producto;

/**
 *
 * @author Efrain
 */
public class VideoClub {

    //Patron singleton
    static private VideoClub videoClub;

    static public VideoClub getInstancia() {
        if (videoClub == null) {
            videoClub = new VideoClub();
        }
        return videoClub;
    }

    private VideoClub() {
    }
    //-----------

    ArrayList<Cliente> lista_clientes = new ArrayList<>();
    ArrayList<Producto> lista_productos = new ArrayList<>();
    ArrayList<Alquiler> lista_alquiler = new ArrayList<>();

    //Cliente
    public boolean agregarCliente(Cliente new_client) {
        for (Cliente c : lista_clientes) {
            if (new_client.getDocument() == c.getDocument()) {
                System.out.println("Ya se registro este cliente");
                return false;
            }
        }
        lista_clientes.add(new_client);
        return true;
    }

    public void mostrarCliente() {

        System.out.println("\n----------------------------");
        System.out.println("Lista de clientes: ");
        System.out.println("----------------------------\n");

        for (Cliente cliente : lista_clientes) {
            System.out.println(cliente.getName());
        }
        System.out.println("");
    }

    //Producto
    public boolean agregarProducto(Producto new_producto) {
        for (Producto producto : lista_productos) {
            if (producto.getCodigo() == new_producto.getCodigo()) {
                System.out.println("Ya hay un producto con este codigo");
                return false;
            }
        }
        lista_productos.add(new_producto);
        return true;
    }

    public void mostrarProducto() {

        System.out.println("----------------------------");
        System.out.println("Lista de productos en stock: ");
        System.out.println("----------------------------\n");

        for (Producto producto : lista_productos) {
            System.out.println(producto.getTitulo() + " | Cantidad disponible: " + producto.getCantidad());
        }
    }

    // Alquiler 
    public boolean agregarAlquiler(Alquiler new_alquiler) {

        System.out.println("\nAgregando alquiler...");

        Producto producto = new_alquiler.getProducto();

        for (Producto prod : lista_productos) {
            if (prod.getCodigo() == producto.getCodigo()) {
                System.out.println("Se encontró el producto");
                System.out.println("Producto: " + prod.getTitulo());
                System.out.println("Cantidad disponible: " + prod.getCantidad());

                if (prod.getCantidad() >= new_alquiler.getProducto().getCantidad()) {
                    prod.setCantidad(prod.getCantidad() - new_alquiler.getProducto().getCantidad());
                    lista_alquiler.add(new_alquiler);
                    System.out.println("Alquiler agregado. Nueva cantidad disponible: " + prod.getCantidad());
                    return true;
                } else {
                    System.out.println("No disponible para esta cantidad.");
                    return false;
                }
            }
        }

        System.out.println("El producto no existe en el inventario.");
        return false;
    }

    public void mostrarAlquileres() {

        System.out.println("\n----------------------------");
        System.out.println("Lista de alquileres: ");
        System.out.println("----------------------------\n");

        for (Alquiler alquiler : lista_alquiler) {

            System.out.println("Nombre del cliente: " + alquiler.getCliente().getName());
            System.out.println("DNI del cliente: " + alquiler.getCliente().getDocument());
            System.out.println("Producto: " + alquiler.getProducto().getTitulo());
            System.out.println("Fecha de entrega: " + alquiler.getFechaInicioAlquiler());
            System.out.println("Fecha de devolucion: " + alquiler.getFechaEntregaAlquiler());
            System.out.println("Codigo de producto: " + alquiler.getProducto().getCodigo());
            System.out.println("Cantidad de productos q alquilo: " + alquiler.getProducto().getCantidad());
            System.out.println("\n");
        }
    }

    //Mostrar alquiler de un cliente
    public void mostrarAlquileresClienteByDni(String Dni) {

        System.out.println("----------------------------");
        System.out.println("Producto que devuelve el Cliente con DNI: " + Dni);
        System.out.println("----------------------------\n");

        for (Alquiler alquiler : lista_alquiler) {

            if (Dni == alquiler.getCliente().getDocument()) {
                System.out.println("Nombre de producto: " + alquiler.getProducto().getTitulo());
                System.out.println("Fecha de entrega: " + alquiler.getFechaInicioAlquiler());
                System.out.println("Fecha de devolucion: " + alquiler.getFechaEntregaAlquiler());
                System.out.println("Codigo de producto: " + alquiler.getProducto().getCodigo());
                System.out.println("\n");
            }
        }
    }

    //Mostrar peliculas q se devuelven hoy
    public void mostrarPeliculasByFecha(Date hoy) {

        System.out.println("----------------------------");
        System.out.println("Peliculas q se devuelven hoy: ");
        System.out.println("----------------------------\n");

        for (Alquiler alquiler : lista_alquiler) {

            if (hoy == alquiler.getFechaEntregaAlquiler()) {

                System.out.println("Producto: " + alquiler.getProducto().getTitulo());
                System.out.println("Codigo de producto: " + alquiler.getProducto().getCodigo());
                System.out.println("Fecha de entrega: " + alquiler.getFechaInicioAlquiler());
                System.out.println("Fecha de devolucion: " + alquiler.getFechaEntregaAlquiler());
                System.out.println("\n");
            }
        }
    }

    
    //Mostrar la cantidad
    
    
    
}
