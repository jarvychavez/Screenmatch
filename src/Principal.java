public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaDeLanzamiento = 2021;
        miPelicula.duracionEnMinutos = 120;

        System.out.println("Mi película es:" + miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);
        System.out.println("La pelicula dura " + miPelicula.duracionEnMinutos);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaDeLanzamiento = 1998;
        otraPelicula.duracionEnMinutos = 180;

        System.out.println("Mi otra pelicula es: " + otraPelicula.nombre);
        System.out.println("Su fecha de lanzamiento fue: " + otraPelicula.fechaDeLanzamiento);
        System.out.println("Esta película dura " + otraPelicula.duracionEnMinutos);
        


    }
}
