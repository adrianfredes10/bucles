
import java.util.Scanner;

//EJ 4
public class Ventas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ventasTotal = 0, i=0;

        do{
            System.out.println("Ingresa las ventas del día " + (i+1) + ": ");
            ventasTotal += sc.nextInt();
        }while(i<7);

        System.out.println("Las ventas totales de la semana fueron " + ventasTotal + " ventas");
    }
}
