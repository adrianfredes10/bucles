
import java.util.Scanner;

//EJ 3
public class Inventario {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        //Pedimos cantidad de productos
        System.out.println("Ingrese la cantidad de productos: ");
        int cantProductos = sc.nextInt(), unidades;
        String producto;

        for (int i = 0; i < cantProductos; i++) {

            //Pedimos el nombre del proucto
            System.out.println("Ingrese el nombre del producto: ");
            sc.nextLine();
            producto = sc.nextLine();

            //Pedimos las unidades disponibles
            System.out.println("Ingrese las unidades disponibles de " + producto + ": ");
            unidades = sc.nextInt();

            //Evaluamos si hay que reponer o no el stock
            if (unidades < 5){
                System.out.println("Debe realizar un pedido de " + producto + " por falta de stock");
            }else{
                System.out.println("Tiene stock suficiente de " + producto);
            }
        }
    }
}
