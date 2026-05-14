//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println("////////// PARTE A: CONVERSIÓN IMPLÍCITA /////////");
    // Se inicia con un dato tipo byte
    byte valorByte = 10;

    // Conversión automática (widening)
    // Java convierte automáticamente a tipos más grandes
    short valorShort = valorByte;    // byte → short
    int valorInt = valorShort;       // short → int
    long valorLong = valorInt;       // int → long
    float valorFloat = valorLong;    // long → float
    double valorDouble = valorFloat; // float → double

    // Mostrar resultados
    System.out.println("byte: " + valorByte);
    System.out.println("short: " + valorShort);
    System.out.println("int: " + valorInt);
    System.out.println("long: " + valorLong);
    System.out.println("float: " + valorFloat);
    System.out.println("double: " + valorDouble);


    System.out.println("////////// PARTE B: CASTING EXPLÍCITO /////////");
    // Número decimal original
    double numero = 45.89;

    // Casting manual (narrowing)
    // Aquí sí puede perderse información
    float numeroFloat = (float) numero;
    int numeroInt = (int) numero;
    short numeroShort = (short) numero;
    byte numeroByte = (byte) numero;

    // Mostrar conversiones
    System.out.println("double original: " + numero);
    System.out.println("float: " + numeroFloat);
    System.out.println("int: " + numeroInt);
    System.out.println("short: " + numeroShort);
    System.out.println("byte: " + numeroByte);

    // int pierde la parte decimal (.89)
    // short también pierde decimales
    // byte puede perder precisión si el número es muy grande


    System.out.println("////////// PARTE C: CONVERSIÓN CON STRINGS /////////");
    // Strings originales
    String textoEntero = "2024";
    String textoDecimal = "98.6";
    String textoBoolean = "false";

    // Conversión de String → tipos primitivos
    int entero = Integer.parseInt(textoEntero);
    double decimal = Double.parseDouble(textoDecimal);
    boolean booleano = Boolean.parseBoolean(textoBoolean);

    // Mostrar valores convertidos
    System.out.println("int: " + entero);
    System.out.println("double: " + decimal);
    System.out.println("boolean: " + booleano);

    // Conversión de tipos primitivos → String
    String s1 = String.valueOf(entero);
    String s2 = Double.toString(decimal);

    // Conversión automática mediante concatenación
    String s3 = "" + booleano;

    System.out.println("String 1: " + s1);
    System.out.println("String 2: " + s2);
    System.out.println("String 3: " + s3);


    System.out.println("////////// PARTE D: CASTING DE OBJETOS /////////");
    // Upcasting:
    // Un objeto Perro se guarda en una variable Animal
    Animal animal = new Perro();
    animal.hacerSonido();
    // Verificar el tipo antes de castear
    if (animal instanceof Perro) {
        // Downcasting:
        // Convertir nuevamente Animal → Perro
        Perro perro = (Perro) animal;

        perro.ladrar();
    }

}