package model;

/**
 *
 * @author Efrain
 */
public class Pelicula extends Producto {

    private int duracion;
    private String idioma;
    //private GeneroPelicula generoPelicula;

    public Pelicula() {
    }

    public Pelicula(int duracion, String idioma, int codigo, String titulo, double precio, int cantidad) {
        super(codigo, titulo, precio, cantidad);
        this.duracion = duracion;
        this.idioma = idioma;
    }
    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public void infoProduct() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Idioma: " + idioma);
    }


}
