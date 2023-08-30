package Lab02_Banco;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el nombre del titular de la cuenta: ");
            String titular = scanner.nextLine();

            System.out.print("(OPCIONAL)Ingrese el monto de su cuenta: ");
            double cantidadInicial = scanner.nextDouble();

            CuentaBanco cuenta;
            if (cantidadInicial > 0) {
                cuenta = new CuentaBanco(titular, cantidadInicial);
            } else {
                cuenta = new CuentaBanco(titular);
            }
                    

            System.out.println("\nInformación de la cuenta:\n" + cuenta);

            int opcion;
            do {
                System.out.println("\n======BIENVENIDO AL BANCO PICHICHI======:");
                System.out.println("1. Ingresar dinero");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Mostrar saldo");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la cantidad a ingresar: ");
                        double cantidadIngreso = scanner.nextDouble();
                        cuenta.ingresar(cantidadIngreso);
                        break;
                    case 2:
                        System.out.print("Ingrese la cantidad a retirar: ");
                        double cantidadRetiro = scanner.nextDouble();
                        cuenta.retirar(cantidadRetiro);
                        break;
                    case 3:
                        System.out.println("Saldo actual: " + cuenta.getCantidad());
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo.");
                }
            } while (opcion != 4);
        }
    }
}