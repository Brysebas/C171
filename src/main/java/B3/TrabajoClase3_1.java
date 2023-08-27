package B3;

public class TrabajoClase3_1 {

        public static void main(String[] args) {
            System.out.println("Números primos del 1 al 1000:");

            for (int numero = 2; numero <= 1000; numero++) {
                boolean esPrimo = true;

                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }

                if (esPrimo) {
                    System.out.print(numero + " ");
                }
            }
        }
    }


