import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numero1 = teclado.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = teclado.nextInt();

        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division;
        int modulo;

        if (numero2 != 0) {
            division = (int) (numero1 / numero2);
            modulo = (int) (numero1 % numero2);
        } else {
            division = 0;
            modulo = 0;
        }

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        if (numero2 != 0) {
            System.out.println("División: " + division);
            System.out.println("Módulo: " + modulo);
        } else {
            System.out.println("División y módulo: No se puede dividir por cero.");
        }
        teclado.close();
    }
}
