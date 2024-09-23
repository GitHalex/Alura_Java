import java.util.Scanner;

public class DesafioCuenta {
    public static void main(String[] args) {
        String nombre = "Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldo = 1599.99;
        System.out.println("*******************************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("El tipo de cuenta es: " + tipoDeCuenta);
        System.out.println("Su saldo disponible es: " + saldo + "$");
        System.out.println("\n*******************************************");

        int opcion = 0;

        String menu = """
                *** Escriba el numero de la opcion deseada ***
                1 - Consultar saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        Scanner teclado = new Scanner(System.in);
        float retirar = 0;
        float depositar = 0;
        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("El saldo es: " + saldo +"$");
                    break;
                case 2:
                    System.out.println("¿Cual es el valor que desea retirar?");
                    retirar = teclado.nextFloat();
                    if (saldo > retirar){
                        saldo -= retirar;
                        System.out.println("El nuevo saldo es: " + saldo +"$");
                    } else {
                        System.out.println("Saldo insuficiente");
                    }
                    break;
                case 3:
                    System.out.println("Ingresa el monto que desea depositar: ");
                    depositar = teclado.nextFloat();
                    saldo += depositar;
                    System.out.println("El nuevo saldo es: " + saldo +"$");
                    break;
                case 9:
                    System.out.println("Saliendo del programa!!!");
                    break;
            }
        }
    }
}
