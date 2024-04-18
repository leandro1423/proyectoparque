package co.edu.uniquindio.poo;

public class Rectangulo extends FiguraGeometrica {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        if (ancho <= 0 || alto <= 0) {
            throw new IllegalArgumentException("Los lados del rectángulo deben ser mayores que cero");
        }
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return ancho * alto;
    }

    public void setAncho(double ancho) {
        if (ancho <= 0) {
            throw new IllegalArgumentException("El ancho del rectángulo debe ser mayor que cero");
        }
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        if (alto <= 0) {
            throw new IllegalArgumentException("El alto del rectángulo debe ser mayor que cero");
        }
        this.alto = alto;
    }  
    
    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }  
}
