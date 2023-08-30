
public class Perro {
    private String raza;
    private int edad;
    private String color;
    private double peso;
    private double temp;

    public Perro(String raza, int edad, String color, double peso, double temp){
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
        this.temp = temp;
    }
    public Perro() {
        this.raza = "chusco";
        this.color = "gris";
        this.temp = 37;
        this.edad = 1;
        this.peso = 0.5;
        }

    public String getRaza() {
        return raza;
        }

    public void setRaza(String raza) {
        this.raza = raza;
        }

    public String getColor() {
        return color;
        }

    public void setColor(String color) {
        this.color = color;
        }

    public double getTemp() {
        return temp;
        }

    public void setTemp(double temp) {
        this.temp = temp;
        }

    public int getEdad() {
        return edad;
        }
    
    public void setEdad(int edad) {
        this.edad = edad;
        }

    public void ladrar(){
        System.out.println("Guau Guau");
    }
    public void dormir(){
        System.out.println("zzz zzzz");
        }
    public void comer(){
        System.out.println("pka pka");
        }
    public void increEdad(int anios){
        this.edad = this.edad + anios;
        cambiarPeso(anios);
        }
    private void cambiarPeso(int anios){
        this.peso = this.peso + (anios * 1.5);
        }
    public String toString(){
        return "Raza: " + this.raza + "\n" +
        "Edad: " + this.edad + "\n" +
        "Color: " + this.color + "\n" +
        "Peso: " + this.peso;
    }
}
