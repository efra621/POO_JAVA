package model;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Efrain
 */

public enum GenreMovie {
    COMEDIA,
    DRAMA,
    SUSPENSO,
    TERROR,
    CIENCIA_FICCION;

    // Método estático para obtener todos los géneros como una lista
    public static ArrayList<GenreMovie> getGeneros() {
        return new ArrayList<>(Arrays.asList(values()));
    }

}
