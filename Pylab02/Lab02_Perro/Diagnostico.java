

class Diagnostico {
    public static boolean aptoVacunaA(int temperatura, int peso, int edad) {
        return temperatura >= 37 && temperatura <= 40 && peso > 5 && edad > 1;
    }

    public static boolean aptoVacunaB(int temperatura, int peso, int edad) {
        return !aptoVacunaA(temperatura, peso, edad);
    }
}
