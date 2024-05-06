package poo_java;

/**
 *
 * @author Efrain
 */

/** extends: Palabra reservada usada para indicar esta clase extiende de otra 
 o en otras palabras decir q es hija de otra
 * En este caso Game es hija de Product
 * Es necesario tener conocimiento de herencia
 */

public class Game extends Product{
    
    private String plataform;
    private String gender;

    public Game() {
    }

    /** super: Palabra reservada q se utiliza para llamar al constructor 
     * para inicializar las cosas q se heredaron de la otra clase
     */
    
    /** Que es un constructor? 
     * Un constructor es lo q esta abajo y se utiliza para inicializar objetos de
     * una clase
     */
    
    public Game(String plataform, String gender, int code, String title, double price) {
        super(code, title, price);
        this.plataform = plataform;
        this.gender = gender;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
