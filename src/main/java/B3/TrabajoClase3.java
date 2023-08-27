package B3;

import java.util.Arrays;
public class TrabajoClase3 {

        public static void main(String[] args) {
            int[] arreglo = {3, 0, -1, 2, 4};

            Arrays.sort(arreglo);

            int n = arreglo.length;
            int[] arregloInverso = new int[n];

            for (int i = 0; i < n; i++) {
                arregloInverso[i] = arreglo[n - 1 - i];
            }

            System.out.println("Arreglo ordenado en orden inverso: " + Arrays.toString(arregloInverso));
        }
    }