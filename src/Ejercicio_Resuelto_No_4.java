import java.util.Scanner;

public class Ejercicio_Resuelto_No_4 {
    public static void main(String[] args) {
        int edadJuan, edadAlberto, edadAna, edadMadre;

        Scanner leer = new Scanner (System.in);
        System.out.print("Cual es la edad de Juan:");
        edadJuan = leer.nextInt();

        edadAlberto = (2*edadJuan)/3;
        edadAna = (4*edadJuan)/3;
        edadMadre = edadAna+edadJuan+edadAlberto;

        System.out.println("La edad de Juan es: "+edadJuan);
        System.out.println("La edad de Alberto es: "+edadAlberto);
        System.out.println("La edad de Ana es: "+edadAna);
        System.out.println("La edad de la madre de juan es: "+edadMadre);

    }
}