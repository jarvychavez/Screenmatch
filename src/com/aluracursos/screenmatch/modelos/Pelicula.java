package com.aluracursos.screenmatch.modelos;

public class Pelicula {
    public String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeEvaluaciones;

    public int getTotalDeEvaluaciones(){
        return totalDeEvaluaciones;
    }

    void muestraFichaTecnica(){
        System.out.println("El nombre de la película es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("La pelicula dura: " + duracionEnMinutos);
    }

    public void evalua (double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    public double calculaLaMedia(){
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }
}
