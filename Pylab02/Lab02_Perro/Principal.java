
import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Perro fido = new Perro("chihuahua", "marron");
        Perro pelusa = new Perro("pequines", "blanco");


        fido.increEdad(2);
        pelusa.increEdad(5);


        System.out.print("Ingrese el nuevo peso para el perro: ");
        int pesoPrueba1 = scanner.nextInt();
        System.out.print("Ingrese la nueva edad para el perro: ");
        int edadPrueba1 = scanner.nextInt();
        System.out.print("Ingrese la nueva temperatura para el perro: ");
        int temperaturaPrueba1 = scanner.nextInt();

        if (Diagnostico.aptoVacunaA(temperaturaPrueba1, pesoPrueba1, edadPrueba1)) {
            System.out.println("DIAGNÓSTICO: El Perro esta SANO");
        } else {
            System.out.println("DIAGNÓSTICO: El Perro esta ENFERMO");
        }
        System.out.print("Ingrese el nuevo peso para el perro: ");
        int pesoPrueba2 = scanner.nextInt();
        System.out.print("Ingrese la nueva edad para el perro: ");
        int edadPrueba2 = scanner.nextInt();
        System.out.print("Ingrese la nueva temperatura para el perro: ");
        int temperaturaPrueba2 = scanner.nextInt();

        if (Diagnostico.aptoVacunaA(temperaturaPrueba2, pesoPrueba2, edadPrueba2)) {
            System.out.println("DIAGNÓSTICO: El Perro esta SANO");
        } else {
            System.out.println("DIAGNÓSTICO: El Perro esta ENFERMO");
        }

        scanner.close();
    }
}
