
import java.util.Scanner;

//BUCLES
//EJ 1
public class TiempoActividad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables para almacenar las horas
        int horasEstudiar = 0;
        int horasEjercicios = 0;
        int horasLeer = 0;
        int horasTiempoLibre = 0;

        // Variable para controlar el bucle
        int opcion = 0;

        // Menú de actividades
        while (opcion != 5) {
            System.out.println("Seleccione una actividad para registrar las horas:");
            System.out.println("1. Estudiar");
            System.out.println("2. Hacer ejercicios");
            System.out.println("3. Leer");
            System.out.println("4. Tiempo libre");
            System.out.println("5. Calcular tiempo total y salir");
            System.out.print("Ingrese su opción: ");

            opcion = scanner.nextInt();

            // Pedir horas según la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese las horas dedicadas a estudiar: ");
                    horasEstudiar += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("Ingrese las horas dedicadas a hacer ejercicios: ");
                    horasEjercicios += scanner.nextInt();
                    break;
                case 3:
                    System.out.print("Ingrese las horas dedicadas a leer: ");
                    horasLeer += scanner.nextInt();
                    break;
                case 4:
                    System.out.print("Ingrese las horas dedicadas a tiempo libre: ");
                    horasTiempoLibre += scanner.nextInt();
                    break;
                case 5:
                    // Calcular el tiempo total
                    int tiempoTotal = horasEstudiar + horasEjercicios + horasLeer + horasTiempoLibre;
                    System.out.println("Tiempo total dedicado: " + tiempoTotal + " horas.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

    }
}
