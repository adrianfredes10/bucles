
import java.util.Scanner;

//EJ 5
public class HorasExtras {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int cantEmpleados, hs;
        String empleado;

        //Pedimos cantidad de empleados
        System.out.println("Ingrese la cantidad de empleados: ");
        cantEmpleados = sc.nextInt();

        for (int i = 0; i < cantEmpleados; i++) {

            //Pedimos nombre del empleado
            System.out.println("Ingrese el nombre completo del empleado: ");
            sc.nextLine();
            empleado = sc.nextLine();

            //Pedimos sus hs semanales trabajadas
            System.out.println("Ingrese las horas semanales trabajdas por el empleado: ");
            hs = sc.nextInt();

            //Evaluamos si trabajo o no hs extra
            if (hs > 40){
                System.out.println(empleado + " ha trabajado " + (hs-40) + " hs extra esta semana");
            }else{
                System.out.println(empleado + " no ha trabajado hs extra esta semana");
            }
        }
    }
}
