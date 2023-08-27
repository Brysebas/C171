package B2;

import java.util.Scanner;

public class TrabajoClase1y2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese el primer número: ");
            int numero1 = scanner.nextInt();

            System.out.println("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();

            System.out.println("Ingrese el tercer número: ");
            int numero3 = scanner.nextInt();

            int mayor = numero1;

            if (numero2 > mayor) {
                mayor = numero2;
            }

            if (numero3 > mayor) {
                mayor = numero3;
            }

            System.out.println("El mayor número es: " + mayor);

            scanner.close();
        }
    }




