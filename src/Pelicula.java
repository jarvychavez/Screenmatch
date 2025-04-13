public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    int duracionEnMinutos;
    boolean incluidoEnElPlan;
    double sumaDeLasEvaluaciones;
    int totalDeEvaluaciones;

    void muestraFicheTecnica(){
        System.out.println("El nombre de la película es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("La pelicula dura " + duracionEnMinutos);
    }

    void evalua (double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeEvaluaciones++;
    }

    double calculaLaMedia(){
        return sumaDeLasEvaluaciones / totalDeEvaluaciones;
    }


}
