public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022) {
            System.out.println("Peliculas mas populares");
        } else {
            System.out.println("Peliculas Retro que aun vale la pena ver");
        }

        if (incluidoEnElPlan || tipoPlan.equals("plus")  ) {
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelucula no disponible para su plan actual");
        }
        int valor = 3;
        switch (valor) {
            case 1:
                System.out.println("Es uno");
                break;
            case 2:
                System.out.println("Es dos");
                break;
            case 3:
                System.out.println("Es tres");
                break;
        }




    }
}
