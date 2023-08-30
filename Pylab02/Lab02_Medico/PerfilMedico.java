package medico;

import java.time.LocalDate;

public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private char sexo;
    private LocalDate fechaNacimiento;
    private double altura; // en centímetros
    private double peso; // en kilogramos

    public PerfilMedico(String primerNombre, String apellido, char sexo, int diaNacimiento, int mesNacimiento, int anoNacimiento, double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaNacimiento = LocalDate.of(anoNacimiento, mesNacimiento, diaNacimiento);
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos establecer (Set) y obtener (Get) para los atributos

    public int calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaActual.getMonthValue() < fechaNacimiento.getMonthValue() ||
            (fechaActual.getMonthValue() == fechaNacimiento.getMonthValue() &&
             fechaActual.getDayOfMonth() < fechaNacimiento.getDayOfMonth())) {
            edad--;
        }
        return edad;
    }

    public int calcularFrecuenciaCardiacaMaxima() {
        return 220 - calcularEdad();
    }

    public double calcularIndiceMasaCorporal() {
        double alturaMetros = altura / 100;
        return peso / (alturaMetros * alturaMetros);
    }

    public static void main(String[] args) {
        // Solicitar información de la persona al usuario (puedes usar Scanner)
        String primerNombre = "John";
        String apellido = "Doe";
        char sexo = 'M';
        int diaNacimiento = 15;
        int mesNacimiento = 8;
        int anoNacimiento = 1990;
        double altura = 175;
        double peso = 70;

        // Crear una instancia de PerfilMedico
        PerfilMedico perfil = new PerfilMedico(primerNombre, apellido, sexo, diaNacimiento, mesNacimiento, anoNacimiento, altura, peso);

        // Mostrar información de la persona
        System.out.println("Información de la persona:");
        System.out.println("Nombre completo: " + perfil.primerNombre + " " + perfil.apellido);
        System.out.println("Sexo: " + perfil.sexo);
        System.out.println("Fecha de nacimiento: " + perfil.fechaNacimiento);
        System.out.println("Altura: " + perfil.altura + " cm");
        System.out.println("Peso: " + perfil.peso + " kg");

        // Calcular e imprimir edad, IMC y FCM
        int edad = perfil.calcularEdad();
        System.out.println("Edad: " + edad + " años");
        System.out.println("Índice de Masa Corporal (IMC): " + perfil.calcularIndiceMasaCorporal());
        System.out.println("Frecuencia Cardiaca Máxima (FCM): " + perfil.calcularFrecuenciaCardiacaMaxima());
    }
}
