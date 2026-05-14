public class Estudiante {

    private String nombre;
    private int edad;
    private double promedio;

    /*throws EdadInvalidaException lanza manualmente la excepcion*/
    public Estudiante(String nombre, int edad, double promedio) throws EdadInvalidaException {

        // Validación de edad
        if (edad < 0 || edad > 120) {
            /*Indica que el constructor puede generar esa excepción*/
            throw new EdadInvalidaException(edad);
        }
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);

        System.out.println("-------------------------");
    }


}
