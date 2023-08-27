package B4;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class RegistroUniversidad {
        static Logger logger;

        static {
            try {
                logger = Logger.getLogger("RegistroUniversidad");
                FileHandler fh = new FileHandler("registro_universidad.log", true);
                fh.setFormatter(new SimpleFormatter());
                logger.addHandler(fh);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        static Estudiante solicitarDatosEstudiante() {
            Scanner scanner = new Scanner(System.in);
            Estudiante estudiante;

            while (true) {
                try {
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();

                    System.out.print("Teléfono: ");
                    String telefono = scanner.nextLine();

                    System.out.print("Cédula: ");
                    String cedula = scanner.nextLine();

                    System.out.print("Promedio de notas escolares: ");
                    double promedio = Double.parseDouble(scanner.nextLine());

                    if (promedio < 0 || promedio > 10) {
                        throw new IllegalArgumentException("El promedio debe estar entre 0 y 10");
                    }

                    System.out.print("Carrera a cursar: ");
                    String carrera = scanner.nextLine();

                    estudiante = new Estudiante(nombre, apellido, telefono, cedula, promedio, carrera);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage() + ". Por favor, ingresa datos válidos.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage() + ". Por favor, ingresa datos válidos.");
                }
            }

            return estudiante;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                try {
                    Estudiante estudiante = solicitarDatosEstudiante();

                    String resultado = (estudiante.promedio >= 3) ? "APROBADO" : "NO APROBADO";

                    logger.info("Estudiante: " + estudiante.nombre + " " + estudiante.apellido + ", Cédula: " + estudiante.cedula + ", Carrera: " + estudiante.carrera + ", Resultado: " + resultado);
                    System.out.println("El estudiante " + estudiante.nombre + " " + estudiante.apellido + " ha sido " + resultado + " en la universidad.");

                    System.out.print("¿Deseas registrar otro estudiante? (s/n): ");
                    String continuar = scanner.nextLine();
                    if (!continuar.equalsIgnoreCase("s")) {
                        break;
                    }
                } catch (Exception e) {
                    logger.severe("Error en el registro: " + e.getMessage());
                    System.out.println("Ha ocurrido un error en el registro. Por favor, intenta nuevamente.");
                }
            }
        }
}



