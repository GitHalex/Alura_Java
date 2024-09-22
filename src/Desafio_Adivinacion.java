import java.util.Random;
import java.util.Scanner;

public class Desafio_Adivinacion {
    public static void main(String[] args) {
//        int numero = (int) (Math.random()*10 + 1);
        int randomNumero;
        randomNumero = new Random().nextInt( 100);
        int intentos = 0;
        System.out.println(randomNumero);
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        while (intentos < 5) {
            numero = teclado.nextInt();
            System.out.println("Ingrese un numero maximo de intentos cinco");
            if (numero > randomNumero) {
                System.out.println("El numero es menor que ");
            } else if (numero < randomNumero) {
                System.out.println("El numero es mayor que ");
            } else {
                System.out.println("Adivinaste el numero " + randomNumero + " Intentos " + intentos);
                break;
            }
            intentos++;

        }

    }
}
