import java.util.Scanner;

public class EjercicioRango {
    static void main(String[] args) {
        //ejercicio dentro de rango si esta entre 0 y 5
        Scanner console = new Scanner(System.in);
        int a;
        System.out.print("Escriba un número entre 0 y 5: ");
        a = Integer.parseInt(console.nextLine());
        boolean resultado;
        resultado = a >= 0 && a <= 5;
        System.out.println("el número proporcionado esta en el rango = " + resultado);
    }
}
