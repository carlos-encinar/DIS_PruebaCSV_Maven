package com.pruebaCSV;

/*
    Ejemplo muy sencillo de acceso a un archivo .csv desde java
    NO UTILIZA NINGUN GESTOR DE DEPENDENCIAS
 */

public class PruebaCSV {
    /**
     * @author: Carlos Encinar
     */

    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();
        miLector.leeCSV("./src/main/resources/datos/pokemon.csv");
    }
}
