package controller;


import java.util.Date;
import model.Alquiler;
import model.Juego;
import model.Cliente;
import model.Pelicula;

/**
 *
 * @author Efrain
 */
public class POO_JAVA {

    public static void main(String[] args) {

        //Instancia con videoClub
        VideoClub videoClub = VideoClub.getInstancia();

        //Crear productos para stock
        Juego juego = new Juego("Steam", "Terror", 111, "Outlast", 100.50, 10);
        Juego juego2 = new Juego("Steam", "Terror", 222, "Outlast 2", 200.50, 10);

        //Crear peliculas para stock
        Pelicula pelicula = new Pelicula(60, "Español", 333, "Titanic", 1000.50, 20);
        Pelicula pelicula2 = new Pelicula(60, "Español", 444, "Titanic 2", 1000.50, 10);
        
        //Agregar productos al stock
        videoClub.agregarProducto(juego);
        videoClub.agregarProducto(juego2);
        videoClub.agregarProducto(pelicula);
        videoClub.agregarProducto(pelicula2);
       
        //Mostrar productos en stock
        videoClub.mostrarProducto();
            
        //Clientes        
        //Simular ingreso de cliente: Crear un cliente
        Cliente cliente = new Cliente(1111, 387602834, "1111", "Efra", "efra@example.com");
        Cliente cliente2 = new Cliente(2222, 387602834, "2222", "Efra 2", "efra2@example.com");
        
        videoClub.agregarCliente(cliente);
        videoClub.agregarCliente(cliente2);
        
        //videoClub.mostrarCliente();
        
        //Simulo q estoy alquilando x juego y cierta cantidad
        Juego alquilando_juego1 = new Juego("Steam", "Terror", 111, "Outlast 1", 100.50, 10);
        Juego alquilando_juego2 = new Juego("Steam", "Terror", 222, "Outlast 2", 200.50, 1);
        
        //Agregar alquiler de un Cliente 
        //Cliente "Efra"
        Date fechaActual = new Date();
        Alquiler alquiler = new Alquiler(cliente, alquilando_juego1, fechaActual, fechaActual, true); 
        Alquiler alquiler2 = new Alquiler(cliente2, alquilando_juego2, fechaActual, fechaActual, true);

        videoClub.agregarAlquiler(alquiler);
        videoClub.agregarAlquiler(alquiler2);
       
        //NUEVAS FUNCIONES 
        //-Listar las peliculas que se devuelven hoy
        //videoClub.mostrarPeliculasByFecha(fechaActual);
        
        //-Listar el historial de alquileres de un socio
        //videoClub.mostrarAlquileresClienteByDni("1111");
       
        //Mostrar alquileres
        //videoClub.mostrarAlquileres();-
        
         //Mostrar productos en stock
        videoClub.mostrarProducto();
    }

}
