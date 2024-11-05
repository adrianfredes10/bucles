
import java.util.Scanner;

//FUNCIONES Y BUCLES
//EJ 1
public class IngresosMensuales {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        //Definimos variables
        int[] ingresosDia = new int[30];
        int ventasDia, valorVenta = 0, ingresosMensual;

        //Bucle para registrar ventas e ingresos por dia
        for (int i = 0; i < 30; i++) {
            System.out.println("Ingrese la cantidad de ventas del día " + (i+1) + ": ");
            ventasDia = sc.nextInt();

            for (int j = 0; j < ventasDia; j++) {
                System.out.println("Ingresa el valor de la venta " + (j+1) + " $:");
                valorVenta = sc.nextInt();
                ingresosDia[i] += valorVenta;
            }
        }
        //Llamada a la funcion para calcular los ingresos mensuales
        ingresosMensual = calcularIngresosMensuales(ingresosDia);
        System.out.println("Los ingresos mensuales fueron de un total de: $" + ingresosMensual);
    }

    //Función que calcula los ingresos mensuales
    public static int calcularIngresosMensuales(int[] ingresosDia){
        int total = 0;
        for (int i = 0; i < 30; i++) {
            total += ingresosDia[i];
        }
        return total;
    }
}
