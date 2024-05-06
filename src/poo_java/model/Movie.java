package poo_java.model;

import poo_java.model.Product;
import java.util.ArrayList;

/**
 *
 * @author Efrain
 */
public class Movie extends Product{
       
    private int duration;
    private String language;
    
    /** ArrayList es un tipo de dato q contiene una cantidad de elementos de
     * tipo en este caso es una lista de elementos de tipo String
    */
    private ArrayList<String> gender;

    public Movie(int duration, String language, ArrayList<String> gender, int code, String title, double price) {
        super(code, title, price);
        this.duration = duration;
        this.language = language;
        this.gender = gender;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ArrayList<String> getGender() {
        return gender;
    }

    public void setGender(ArrayList<String> gender) {
        this.gender = gender;
    }
    
}
