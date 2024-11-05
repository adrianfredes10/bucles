
import java.util.Scanner;

//EJ 3
public class GestionClientes {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de clientes: ");
        int cantClientes = sc.nextInt();

        String[] clientes = new String[cantClientes];
        int[] facturas = new int[cantClientes];

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Ingrese el nombre del cliente: ");
            sc.nextLine();
            clientes[i] = sc.nextLine();
            System.out.println("Ingrese su factura: $");
            facturas[i] = sc.nextInt();
        }
        enviarFacturas(clientes,facturas);
    }
    public static void enviarFacturas(String[] clientes, int[] facturas){
        for (int i = 0; i < clientes.length; i++) {
            if (facturas[i] > 500){
                System.out.println(clientes[i] + " tiene una factura pendiente de $" + facturas[i]);
            }
        }
    }
}
