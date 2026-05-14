import java.util.Scanner;
public class ConversorMonedas {
    // Método para convertir monedas
    public static double convertir(String monedaOrigen, String monedaDestino, double cantidad)
            throws MonedaNoSoportadaException {
        // Validar monedas soportadas
        if ((!monedaOrigen.equals("USD") && !monedaOrigen.equals("EUR")) || (!monedaDestino.equals("USD") && !monedaDestino.equals("EUR"))) {
            // Lanzar excepción personalizada
            throw new MonedaNoSoportadaException(
                    monedaOrigen + " o " + monedaDestino);
        }
        // Tasas de cambio hardcodeadas
        double tasa = 0;
        // USD → EUR
        if (monedaOrigen.equals("USD") && monedaDestino.equals("EUR")) {
            tasa = 0.88;
        }
        // EUR → USD
        else if (monedaOrigen.equals("EUR") && monedaDestino.equals("USD")) {
            tasa = 1.14;
        }
        // Misma moneda
        else {
            tasa = 1;
        }
        // Resultado final
        return cantidad * tasa;
    }
}
