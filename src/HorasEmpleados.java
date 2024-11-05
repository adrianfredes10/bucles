
public class HorasEmpleados {

    public static void main(String[] args) {
        // Arreglos para almacenar los nombres de los empleados y las horas trabajadas
        String[] empleados = {"Juan", "María", "Pedro", "Ana", "Luis"};
        double[] horasTrabajadas = {40, 38, 45, 50, 30};

        // Llamar a la función para calcular el pago semanal
        double[] pagosSemanales = calcularPagoSemanal(horasTrabajadas);

        // Mostrar los resultados
        for (int i = 0; i < empleados.length; i++) {
            System.out.printf("Empleado: %s, Horas trabajadas: %.2f, Pago semanal: $%.2f\n",
                    empleados[i], horasTrabajadas[i], pagosSemanales[i]);
        }
    }

    // Función para calcular el pago semanal
    public static double[] calcularPagoSemanal(double[] horas) {
        double tarifaPorHora = 15.0; // Tarifa por hora trabajada
        double[] pagos = new double[horas.length]; // Arreglo para almacenar los pagos semanales

        // Calcular el pago para cada empleado
        for (int i = 0; i < horas.length; i++) {
            pagos[i] = horas[i] * tarifaPorHora; // Calcular el pago
        }

        return pagos; // Retornar el arreglo con los pagos semanales
    }
}
