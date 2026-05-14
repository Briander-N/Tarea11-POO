//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    try{

        Estudiante e1 = new Estudiante("Briander", 20, 8.5);
        e1.mostrarDatos();

        Estudiante e2 = new Estudiante("Lesly", 19, 9.2);
        e2.mostrarDatos();

        // Edad inválida
        Estudiante e3 = new Estudiante("James", -5, 7.8);
        e3.mostrarDatos();


    } catch (EdadInvalidaException e) { /*Captura el error personalizado:*/

        System.out.println("Se produjo una excepción personalizada");
        System.out.println(e.getMessage());

    }

}
