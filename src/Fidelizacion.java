
import java.util.Scanner;

//EJ 4
public class Fidelizacion {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de clientes: ");
        int cantClientes = sc.nextInt();

        String[] clientes = new String[cantClientes];
        int[] compras = new int[cantClientes];

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Ingrese el nombre del cliente:");
            sc.nextLine();
            clientes[i] = sc.nextLine();
            System.out.println("Ingrese su cantidad de compras: ");
            compras[i] = sc.nextInt();
        }
        calcularDescuentos(clientes,compras);
    }
    public static void calcularDescuentos(String[]clientes, int[] compras){
        System.out.println("A los siguientes clientes se les otorga un 10% de descuento en sus compras");
        for (int i = 0; i < clientes.length; i++) {
            if (compras[i] > 10){
                System.out.println("- " + clientes[i]);
            }
        }
    }
}
