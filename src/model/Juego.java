package model;

/**
 *
 * @author Efrain
 */
/**
 * extends: Palabra reservada usada para indicar esta clase extiende de otra o
 * en otras palabras decir q es hija de otra En este caso Game es hija de
 * Product Es necesario tener conocimiento de herencia
 */
public class Juego extends Producto {

    private String plataforma;
    private String genero;

    public Juego() {
    }

    /**
     * super: Palabra reservada que se utiliza para llamar al constructor para
     * inicializar las cosas que se heredaron de la otra clase
     */
    /**
     * ¿Qué es un constructor? Un constructor es lo que está abajo y se utiliza
     * para inicializar objetos de una clase
     */
    

    public Juego(String plataforma, String genero, int codigo, String titulo, double precio, int cantidad) {
        super(codigo, titulo, precio, cantidad);
        this.plataforma = plataforma;
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void infoProduct() {
        System.out.println("Código: " + getCodigo());
        System.out.println("Título: " + getTitulo());
        System.out.println("Precio: $" + getPrecio());
        System.out.println("Plataforma: " + plataforma);
        System.out.println("Género: " + genero);
    }


}
