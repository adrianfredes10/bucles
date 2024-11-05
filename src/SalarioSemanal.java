

import java.util.Scanner;

//EJ 2
public class SalarioSemanal {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //Pedimos al usuario la cantidad de empleados
        System.out.println("Ingresa la cantidad de empleados: ");
        int cantEmpleados = sc.nextInt();
        int i = 0, tarifa = 15, hsTrabajadas, salario;

        while (cantEmpleados >= i){
            //Pedimos al usuario las hs trabajadas del empleado
            System.out.println("Ingresa las hs trabajadas del empleado " + (i+1) + ": ");
            hsTrabajadas = sc.nextInt();
            //Calculamos e imprimos el salario
            salario = hsTrabajadas * tarifa;
            System.out.println("Salario semanal del empleado " + (i+1)+ ": " + "$" + salario);
            i++;
        }
    }
}
