//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    System.out.println("////////// PARTE A: CONVERSIÓN IMPLÍCITA /////////");
    byte valorByte = 10;

    short valorShort = valorByte;   // byte → short
    int valorInt = valorShort;      // short → int
    long valorLong = valorInt;      // int → long
    float valorFloat = valorLong;   // long → float
    double valorDouble = valorFloat; // float → double

    System.out.println("byte: " + valorByte);
    System.out.println("short: " + valorShort);
    System.out.println("int: " + valorInt);
    System.out.println("long: " + valorLong);
    System.out.println("float: " + valorFloat);
    System.out.println("double: " + valorDouble);

    System.out.println("////////// PARTE B: CASTING EXPLÍCITO /////////");
    double numero = 45.89;

    float numeroFloat = (float) numero;
    int numeroInt = (int) numero;
    short numeroShort = (short) numero;
    byte numeroByte = (byte) numero;

    System.out.println("double original: " + numero);
    System.out.println("float: " + numeroFloat);
    System.out.println("int: " + numeroInt);
    System.out.println("short: " + numeroShort);
    System.out.println("byte: " + numeroByte);

    // int pierde la parte decimal (.89)
    // short también pierde decimales
    // byte puede perder precisión si el número es muy grande

    System.out.println("////////// PARTE C: CONVERSIÓN CON STRINGS /////////");
    // Pasar de String a tipos primitivos
    String textoEntero = "2024";
    String textoDecimal = "98.6";
    String textoBoolean = "false";

    int entero = Integer.parseInt(textoEntero);
    double decimal = Double.parseDouble(textoDecimal);
    boolean booleano = Boolean.parseBoolean(textoBoolean);

    System.out.println("int: " + entero);
    System.out.println("double: " + decimal);
    System.out.println("boolean: " + booleano);

    // tipos → String
    String s1 = String.valueOf(entero);
    String s2 = Double.toString(decimal);
    String s3 = "" + booleano;

    System.out.println("String 1: " + s1);
    System.out.println("String 2: " + s2);
    System.out.println("String 3: " + s3);

    System.out.println("////////// PARTE D: CASTING DE OBJETOS /////////");

    // Upcasting (implícito)
    Animal animal = new Perro();

    animal.hacerSonido();

    // Downcasting (explícito)
    if (animal instanceof Perro) {

        Perro perro = (Perro) animal;

        perro.ladrar();
    }


}
