import java.util.Scanner;

public class Ejercicio_Resuelto_No_14 {
    public static void main(String[] args) {
        int numero;

        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero ");
        numero = leer.nextInt();

        System.out.println("El numero es: "+numero);
        System.out.println("Su cuadrado es: "+Math.pow(numero,2));
        System.out.println("Su cubo es "+Math.pow(numero,3));

    }
}