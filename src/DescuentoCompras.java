
public class DescuentoCompras {

    public static void main(String[] args) {
        // Arreglo con los montos de las compras
        double[] compras = {400.0, 600.0, 750.0, 300.0, 550.0};

        // Llamar a la función para aplicar el descuento
        double[] preciosFinales = aplicarDescuento(compras);

        // Mostrar los resultados
        for (int i = 0; i < compras.length; i++) {
            System.out.printf("Compra original: %.2f, Precio final: %.2f\n", compras[i], preciosFinales[i]);
        }
    }

    // Función para aplicar el descuento del 15% a compras superiores a $500
    public static double[] aplicarDescuento(double[] compras) {
        double[] preciosFinales = new double[compras.length]; // Arreglo para almacenar los precios finales

        // Aplicar descuento a las compras que superan $500
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                preciosFinales[i] = compras[i] * 0.85; // Aplicar 15% de descuento
            } else {
                preciosFinales[i] = compras[i]; // Sin descuento
            }
        }

        return preciosFinales; // Retornar el arreglo con los precios finales
    }
}
