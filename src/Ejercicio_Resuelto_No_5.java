import java.util.Scanner;

public class Ejercicio_Resuelto_No_5 {
    public static void main(String[] args) {

    double suma, x, y;
    suma = 0;

    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese el valor de x: ");

    x = leer.nextDouble();

    suma = suma + x;

    System.out.print("Ingrese el valor de y: ");
    y = leer.nextDouble();

    x = x+Math.pow(y,2);

    suma = suma+(x/y);

    System.out.println("El valor de la suma es: "+suma );

    }
}