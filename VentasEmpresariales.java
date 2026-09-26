import java.util.Scanner;
public class VentasEmpresariales {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadVentas;
        int ventasMayores = 0;
        int ventasMenores = 0;
        int clientesVIP = 0;
        int ClientesFrecuentes = 0;
        int clientesGenerales = 0;

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

            if (venta > 1000000) {
                System.out.println("-> Registro: Nivel 1 (VIP)");
                clientesVIP++;
            } else if (venta >= 500000 && venta <= 1000000) {
                System.out.println("-> Registro: Nivel 2 (Frecuente)");
                ClientesFrecuentes++;
            } else {
                System.out.println("-> Registro: Nivel 3 (General)");
                clientesGenerales++;
            }
            if (venta > ventaMayor) {
                ventaMayor = venta;
            }

            if (i ==1) {
                ventaMenor = venta;
            } else if (venta < ventaMenor) {
                ventaMenor = venta;
            }
        }

        double promedio = totalVentas / cantidadVentas;

        System.out.println("=============INFORME EMPRESARIAL==============");

        System.out.println("Cantidad de ventas totales: " + cantidadVentas);
        System.out.println("Total recaudado en el día: $" + totalVentas);
        System.out.println("Promedio general de ventas: $" + promedio);
        System.out.println("Venta más alta registrada: $" + ventaMayor);
        System.out.println("Venta más baja registrada: $" + ventaMenor);
        System.out.println("----------------------------------------------");
        System.out.println("Ventas superiores a $500.000: " + ventasMayores);
        System.out.println("Ventas de $500.000 o menos: " + ventasMenores);
        System.out.println("----------------------------------------------");
        System.out.println("==========REPORTES POR NIVEL CLIENTE==========");
        System.out.println("Clientes nivel 1 (VIP - Mayores a $1M: " + clientesVIP);
        System.out.println("Clientes nivel 2 (Frecuente - $500K a $1M: " + ClientesFrecuentes);
        System.out.println("Clientes nivel 3 (General - Menores a $500K: " + clientesGenerales);
        System.out.println("==============================================");

        entrada.close();
    }
}