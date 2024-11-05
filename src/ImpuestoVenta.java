
public class ImpuestoVenta {

    public static void main(String[] args) {
        // Arreglo con los montos de las facturas
        double[] facturas = {100.0, 250.0, 300.0, 450.0, 600.0};

        // Llamar a la función para calcular el impuesto
        double[] impuestos = calcularImpuesto(facturas);

        // Mostrar los resultados
        for (int i = 0; i < facturas.length; i++) {
            System.out.printf("Factura: %.2f, Impuesto: %.2f\n", facturas[i], impuestos[i]);
        }
    }

    // Función para calcular el impuesto de venta del 21%
    public static double[] calcularImpuesto(double[] facturas) {
        double[] impuestos = new double[facturas.length]; // Arreglo para almacenar los impuestos

        // Calcular el impuesto para cada factura
        for (int i = 0; i < facturas.length; i++) {
            impuestos[i] = facturas[i] * 0.21; // 21% de impuesto
        }

        return impuestos; // Retornar el arreglo con los impuestos
    }
}
