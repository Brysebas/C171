package B3;

public class TrabajoClase3_2 {

        public static void main(String[] args) {
            int n = 20;
            long first = 0;
            long second = 1;

            System.out.println("Los primeros 20 números de la secuencia Fibonacci:");

            System.out.print(first + " " + second + " ");

            for (int i = 2; i < n; i++) {
                long next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }


