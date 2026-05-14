public class MonedaNoSoportadaException extends Exception{
    public MonedaNoSoportadaException(String moneda) {

        super("La moneda '" + moneda + "' no está soportada.");

    }

}
