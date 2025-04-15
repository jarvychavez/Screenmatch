package com.aluracursos.screenmatch.calculos;
import com.aluracursos.screenmatch.modelos.Pelicula;

public class claculadoraDeTiempo {

    private int tiempoTotal;

    public void incluye(Pelicula pelicula){
        tiempoTotal += pelicula.getDuracionEnMinutos();
    }
}
