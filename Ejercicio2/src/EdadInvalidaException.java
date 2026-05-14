/*Se crea una herencia con Exception*/
public class EdadInvalidaException extends Exception{

    private int edadIngresada;

    public EdadInvalidaException(int edadIngresada){
        super("Error: la edad ingresada (" + edadIngresada + ") no es válida.");
        /*Llama la excepcion de la clase padre*/
        this.edadIngresada = edadIngresada;

    }

    public int getEdadIngresada() {

        return edadIngresada;

    }

}
