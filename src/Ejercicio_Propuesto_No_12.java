import java.util.Scanner;

public class Ejercicio_Propuesto_No_12 {
    public static void main(String[] args) {
        int salarioHora, salarioBruto, horasTrabajadas;
        double retencionFuente,salarioNeto;

        salarioHora = 5000;
        retencionFuente =  0.125;

        Scanner leer = new Scanner (System.in);
        System.out.print("Horas trabajadas: ");
        horasTrabajadas = leer.nextInt();

        salarioBruto = salarioHora * horasTrabajadas;
        salarioNeto = salarioBruto * retencionFuente;

        System.out.println("Salario bruto: "+salarioBruto);
        System.out.println("Salario Neto: "+salarioNeto);
        System.out.println("Retencion en la fuente: "+ (salarioBruto-salarioNeto));

    }
}