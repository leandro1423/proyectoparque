package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class ProyectoApp {
    public static void main(String[] args) {
        boolean registro = true;
        String parqueNombre = "";
        String descripcion = ""; 
        FiguraGeometrica figura = null;
        Municipio municipio = null;
        Material material = null;

        JOptionPane.showMessageDialog(null, "Proyecto para crear parques en el Quindio", "Proyecto Parques Quindio", JOptionPane.INFORMATION_MESSAGE);

        while (registro) {
            // Solicitar el nombre del parque al usuario
            parqueNombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del parque:", "Nombre del Parque", JOptionPane.QUESTION_MESSAGE);
            // Solicitar la descripción del parque al usuario
            descripcion = JOptionPane.showInputDialog(null, "Ingrese la descripción del parque:", "Descripción del Parque", JOptionPane.QUESTION_MESSAGE);

            // Si se presiona Cancelar en alguno de los diálogos, salir del bucle
            if (parqueNombre == null || descripcion == null) {
                registro = false;
                continue; // Salir del bucle sin solicitar más datos
            }

            // Solicitar el municipio al usuario
            municipio = (Municipio) JOptionPane.showInputDialog(null, "Seleccione el municipio:",
                    "Municipio", JOptionPane.QUESTION_MESSAGE, null, Municipio.values(), Municipio.ARMENIA);

            // Solicitar el tipo dica al usuarioe figura geométr
            String figuraSeleccionada = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de figura geométrica:",
                    "Tipo de Figura Geométrica", JOptionPane.QUESTION_MESSAGE, null, new String[] { "Rectángulo", "Cuadrado", "Círculo", "Triángulo Rectángulo" }, "Rectángulo");

            // Solicitar las dimensiones según el tipo de figura geométrica
            double base = 0.0, altura = 0.0;
            if (figuraSeleccionada.equals("Rectángulo")) {
                base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la Base:", "Base", JOptionPane.QUESTION_MESSAGE));
                altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la Altura:", "Altura", JOptionPane.QUESTION_MESSAGE));

            }else if(figuraSeleccionada.equals("Cuadrado")){
                base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el lado 1:", "Base", JOptionPane.QUESTION_MESSAGE));
                altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el lado 2:", "Altura", JOptionPane.QUESTION_MESSAGE));
                figura = new Cuadrado(base, altura);
                
            }else if (figuraSeleccionada.equals("Círculo")) {
                base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio:", "Radio", JOptionPane.QUESTION_MESSAGE));
                figura = new Circulo(base);

            } else if (figuraSeleccionada.equals("Triángulo Rectángulo")) {
                base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base:", "Base", JOptionPane.QUESTION_MESSAGE));
                altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura:", "Altura", JOptionPane.QUESTION_MESSAGE));
                figura = new TrianguloRectangulo(base, altura);
            }

            // Solicitar el material al usuario
            material = (Material) JOptionPane.showInputDialog(null, "Seleccione el material para la zona:",
                    "Material", JOptionPane.QUESTION_MESSAGE, null, Material.values(), Material.ARENA);

            // Crear una instancia de Parque con los datos ingresados
            Parque parque = new Parque(parqueNombre, descripcion, municipio);

            // Calcular el área y el sobre costo basado en la figura geométrica, el municipio y el material seleccionado
            double area = figura.calcularArea();
            double sobreCostoMunicipio = parque.getSobrecosto();
            double valorMetroCuadradoMaterial = material.getValorMetroCuadrado();
            double costoZona = area * valorMetroCuadradoMaterial + sobreCostoMunicipio;

            // Mostrar los datos ingresados y el costo total de la zona del parque
            String mensaje = "Nombre del parque: " + parque.getNombre() +
                    "\nDescripción del parque: " + parque.getDescripcion() +
                    "\nTipo de figura geométrica: " + figura.getClass().getSimpleName() +
                    "\nÁrea: " + area + "\nMunicipio: " + municipio.name() +
                    "\nMaterial: " + material.name() + "\nCosto de la zona: " + costoZona;
            JOptionPane.showMessageDialog(null, mensaje, "Datos del Parque", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
