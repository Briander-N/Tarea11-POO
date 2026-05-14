//Se Importa Scanner
import java.util.Scanner;

void main() {
    //Se inicializa scanner como SC
    Scanner sc = new Scanner(System.in);

    try {
        String entrada;
        double resultado;
        int numero;

        //Aqui se solicita el numero al usuario
        System.out.println("Ingrese un numero entero: ");
        entrada = sc.nextLine();

        //Convertir de texto a numero entero
        numero = Integer.parseInt(entrada);

        //Division
        resultado = 100 / numero;

        System.out.println("Resultado: " + resultado);

    } catch (ArithmeticException e){
        //Aqui da error por dividir por 0
        System.out.println("No es posible dividir por 0");
    } catch (NumberFormatException e){
        //Ocurre si se escribe texto y no un numero
        System.out.println("Ingrese un numero valido!!!!");
    } finally{
        System.out.println("Programada finalizado correctamente!");
        sc.close();
    }
}
