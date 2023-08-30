package Lab02_Banco;

class CuentaBanco {
    private String titular;
    private double cantidad;
    

    public CuentaBanco(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }
    public CuentaBanco(String titular) {
        this(titular, 0);
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad) {
            if (cantidad >= 1) {
                this.cantidad += cantidad;
                System.out.println("Se ha ingresado " + cantidad + " a la cuenta.");
            } else {
                System.out.println("No se ha ingresado una cantidad válida, vuelve a intentar.");
            } 
    }
    
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.cantidad - cantidad < 0) {
                this.cantidad = 0;
            } else {
                this.cantidad -= cantidad;
                System.out.println("Se ha retirado " + cantidad + " de la cuenta.");
            }
        }
    }

    public String toString() {
        return "Titular: " + titular + "\nCantidad: " + cantidad;
    }
}


