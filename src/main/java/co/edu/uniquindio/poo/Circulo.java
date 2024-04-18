package co.edu.uniquindio.poo;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        if(radio <=0){
            throw new IllegalArgumentException("el radio del circulo debe ser mayor a 0");
        }
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;/* Math.PI para representar a el numero pi */
    }

}
