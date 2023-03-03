import java.util.Scanner;

public class Ejercicio_Resuelto_No_17 {
    public static void main(String[] args) {
        int radioCircunferencia;
        double areaCircunferencia, longitudCircunferencia;

        Scanner leer = new Scanner(System.in);
        System.out.print("Cual es el radio de la circunferencia: ");

        radioCircunferencia = leer.nextInt();
        areaCircunferencia = Math.PI * Math.pow(radioCircunferencia,2);
        longitudCircunferencia = 2 * Math.PI * radioCircunferencia;

        System.out.println("el radio es: "+radioCircunferencia);
        System.out.println("el area es: " + areaCircunferencia);
        System.out.println("la longitud es: "+ longitudCircunferencia);

    }
}