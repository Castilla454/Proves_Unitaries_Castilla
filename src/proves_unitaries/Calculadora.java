package proves_unitaries;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1 =0;
        int numero2=0;
        int operacion;

        try {

            System.out.println("Ingrese el primer número: ");
            numero1 = sc.nextInt();

            System.out.println("Ingrese el segundo número: ");
            numero2 = sc.nextInt();

        } catch (InputMismatchException e){
            System.out.println(e.getMessage());

        }

        System.out.println("Seleccione la operación: " + "\n" +
                "1.Suma" + "\n" +
                "2.Resta" + "\n" +
                "3.Multiplicación" + "\n" +
                "4.División");
        operacion = sc.nextInt();

        switch (operacion) {

            case 1:
                System.out.println("La suma de los numeros introducidos da: " + sumar(numero1, numero2));

                break;
            case 2:

                System.out.println("La resta de los numeros introducidos da: " + restar(numero1, numero2));

                break;
            case 3:
                System.out.println("La multiplicación de los numeros introducidos da: " + multiplicar(numero1, numero2));
                break;
            case 4:
                try {
                    System.out.println("La división de los numeros introducidos da: " + dividir(numero1, numero2));
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());

                }
                ;
                break;
            default:
                System.out.println("No se ha introducido un numero de operacion válido");
                break;
        }

    }

    public static int sumar(int numero1, int numero2) {

        return numero1 + numero2;
    }

    public static int restar(int numero1, int numero2) {

        return numero1 - numero2;
    }

    public static int multiplicar(int numero1, int numero2) {

        return numero1 * numero2;
    }

    public static int dividir(int numero1, int numero2) {

        if (numero2 == 0) {
            throw new ArithmeticException("ERROR -- No se puede dividir entre cero");

        }

        return numero1 / numero2;
    }


}

