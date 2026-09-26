import java.util.Scanner;
public class VentasEmpresariales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadVentas;
        int ventasMayores = 0;
        int ventasMenores = 0;

        double totalVentas = 0;
        double ventaMayor = 0;
        double ventaMenor = 0;

        System.out.println("Ingrese la cantidad de ventas: ");
        cantidadVentas = entrada.nextInt();

        for (int i = 1; i <= cantidadVentas; i++) {

            System.out.println("Venta #" + i);

            System.out.println("Ingrese el valor de la venta: ");
            double venta = entrada.nextDouble();

            totalVentas += venta;

            if (venta > 500000) {
                ventasMayores++;
                
            } else {
                ventasMenores ++;
            }

            if (venta > ventaMayor) {
                ventaMayor = venta;
            }

            if (i == 1) {
                ventaMenor = venta;
                
            } else if (venta < ventaMenor) {
                ventaMenor = venta;
            }
        }

        double promedio = totalVentas / cantidadVentas;

        System.out.println("=============INFORME EMPRESARIAL==============");

        System.out.println("Cantidad de ventas: " + cantidadVentas);
        System.out.println("Total recaudado: $" + totalVentas);
        System.out.println("Promedio de ventas: $" + promedio);
        System.out.println("Venta más alta: $" + ventaMayor);
        System.out.println("Venta más baja: $" + ventaMenor);
        System.out.println("Ventas superiores a $500.000: " + ventasMayores);
        System.out.println("Ventas de $500.000 o menos: " + ventasMenores);
        System.out.println("==============================");

        entrada.close();
    }
}