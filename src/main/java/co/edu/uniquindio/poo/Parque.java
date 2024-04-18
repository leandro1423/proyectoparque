package co.edu.uniquindio.poo;

public class Parque {

    private String nombre;
    private String descripcion;
    private Municipio municipio;

    public Parque(String nombre, String descripcion, Municipio municipio) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Error, no se puede crear un parque con nombre nulo o vacío");
        }
        if (descripcion == null || descripcion.isEmpty()) {
            throw new IllegalArgumentException("Error, no se puede crear un parque con descripción nula o vacía");
        }
        if (municipio == null) {
            throw new IllegalArgumentException("Error, no se puede crear un parque con municipio no definido");
        }

        this.nombre = nombre;
        this.descripcion = descripcion;
        this.municipio = municipio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getSobrecosto() {
        return municipio.getSobreCosto();
    }
}
