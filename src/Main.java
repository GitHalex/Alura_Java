public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;



        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media / 2);

        System.out.println("convertidor de grados Celsius a Fahrenheit");
        int gradoCelcius = 10;
        float convertido = (float) ((gradoCelcius * 1.8) + 32);
        System.out.println("Convertido de grados Celsius a Fahrenheit "+ convertido);

    }
}