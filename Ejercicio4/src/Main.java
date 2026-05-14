//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    try{
        // Leer moneda origen
        System.out.print("Moneda origen (USD/EUR): ");
        String origen = sc.nextLine().toUpperCase();
        // Leer moneda destino
        System.out.print("Moneda destino (USD/EUR): ");
        String destino = sc.nextLine().toUpperCase();
        // Leer cantidad como String
        System.out.print("Ingrese cantidad: ");
        String textoCantidad = sc.nextLine();
        // Convertir String → double
        double cantidad = Double.parseDouble(textoCantidad);
        // Llamar método convertir
        double resultado =
                ConversorMonedas.convertir(origen, destino, cantidad);
        // Mostrar resultado con 2 decimales
        System.out.println("Resultado: " + String.format("%.2f", resultado));
        // Error si el usuario escribe texto inválido
    } catch (NumberFormatException e){
        System.out.println("Error: debe ingresar un número válido.");
    }
    // Error de moneda no soportada
    catch (MonedaNoSoportadaException e) {

        System.out.println("Error de moneda: " + e.getMessage());
    }
    // Siempre se ejecuta
    finally {

        System.out.println("Programa finalizado.");
        sc.close();
    }

}
