
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char decision; 
do {
        try {
        System.out.println("Ingrese primer número a dividir: ");
        int primerNumero = scanner.nextInt();
        System.out.println("Ingrese segundo número a dividir: ");
        int segundoNumero = scanner.nextInt();

        int resultado = primerNumero / segundoNumero;
        System.out.println("El resultado es: " + resultado); 
            
        } catch (ArithmeticException e) {
            System.out.println("Lo sentimos, no se puede dividir por cero.");
        }
        System.out.println("Desea realizar una nueva operacion? (Y/N): ");
        decision = scanner.next().charAt(0);
    } while (decision == 'y' || decision == 'Y');
    
System.out.println("Operación finalizada");
}

}
