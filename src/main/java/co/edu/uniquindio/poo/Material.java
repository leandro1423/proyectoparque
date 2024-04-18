package co.edu.uniquindio.poo;

public enum Material {
    ARENA(10000.0),
    GRAMASINTETICA(35000.0),
    GRAMANATURAL(20000.0),
    ASFALTO(40000.0);

    private double valorMetroCuadrado;

    private Material(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

}
