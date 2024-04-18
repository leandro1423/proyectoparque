package co.edu.uniquindio.poo;

public class Zona {
    private String nombre;
    private FiguraGeometrica figura;
    private Material material;

    public Zona(String nombre,FiguraGeometrica figura, Material material) {
        this.nombre = nombre;
        this.figura = figura;
        this.material = material;
    }

    public double calcularValor() {
        double area = figura.calcularArea();
        return area * material.getValorMetroCuadrado();
    }
    public String getNombre() {
        return nombre;
    }
}
