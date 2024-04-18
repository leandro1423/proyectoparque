package co.edu.uniquindio.poo;

public class TrianguloRectangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public TrianguloRectangulo(double base, double altura) {

        if(base <=0 || altura <=0){
            throw new IllegalArgumentException("La base y la altura deben de ser mayor a 0");
        }
        this.base = base;
        this.altura = altura;

    }

    public double calcularArea() {
        return (base * altura) / 2.0;

    }
    public void SetBase(double base){
        if(base <=0){
            throw new IllegalArgumentException("La base debe de ser mayor a 0 ");
        }
        this.base =base;
    }
    public void SetAltura(double altura){
        if(altura<=0){
            throw new IllegalArgumentException("la altura debe de ser mayor a 0");
        }
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

}
