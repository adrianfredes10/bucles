
import java.util.Scanner;

public class Satisfaction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de calificaciones
        System.out.print("¿Cuántas calificaciones desea ingresar? ");
        int cantidad = scanner.nextInt();

        // Arreglo para almacenar las calificaciones
        int[] calificaciones = new int[cantidad];

        // Bucle para solicitar las calificaciones
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + " (1 a 5): ");
            calificaciones[i] = scanner.nextInt();

            // Validar la calificación
            while (calificaciones[i] < 1 || calificaciones[i] > 5) {
                System.out.print("Calificación inválida. Ingrese un valor entre 1 y 5: ");
                calificaciones[i] = scanner.nextInt();
            }
        }

        // Llamar a la función para calcular el promedio
        double promedio = calcularPromedioSatisfaccion(calificaciones);

        // Mostrar el resultado
        System.out.println("El promedio de satisfacción es: " + promedio);

        scanner.close(); // Cerrar el escáner
    }

    // Función para calcular el promedio de satisfacción
    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int suma = 0; // Variable para acumular la suma de las calificaciones

        // Recorrer el arreglo y sumar las calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        // Calcular el promedio
        return (double) suma / calificaciones.length;
    }
}
