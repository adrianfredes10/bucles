
public class DescuentoProductos {

    public static void main(String[] args) {
        // Arreglo con los precios originales de los productos
        double[] preciosOriginales = {100.0, 250.0, 300.0, 450.0, 600.0};

        // Llamar a la función para calcular los precios finales
        double[] preciosFinales = calcularPrecioFinal(preciosOriginales);

        // Mostrar los resultados
        for (int i = 0; i < preciosOriginales.length; i++) {
            System.out.printf("Precio original: %.2f, Precio final después del descuento: %.2f\n",
                    preciosOriginales[i], preciosFinales[i]);
        }
    }

    // Función para calcular el precio final después de aplicar un 10% de descuento
    public static double[] calcularPrecioFinal(double[] precios) {
        double[] preciosFinales = new double[precios.length]; // Arreglo para almacenar los precios finales

        // Aplicar el descuento a cada precio
        for (int i = 0; i < precios.length; i++) {
            preciosFinales[i] = precios[i] * 0.90; // Aplicar 10% de descuento
        }

        return preciosFinales; // Retornar el arreglo con los precios finales
    }
}
