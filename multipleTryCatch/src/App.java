import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        char continuar;
        
        do { 
             System.out.println("Bienvenido a CalcuDev, ¿qué operación haremos hoy?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("Elige una opción: ");

            opcion = entrada.nextInt();

        switch (opcion) { // Un switch para darle mayor dinamismo al programa, y que el usuario pueda elegir la operación a realizar
            case 1:
                operacionSuma(entrada);
                break;
                case 2:
              operacionResta(entrada);
                break;
                case 3:
               operacionMultiplicacion(entrada);
                break;
                case 4:
                operacionDivision(entrada);
                break;
            default:
                System.out.println("Opción no válida, por favor elige una opción del 1 al 4.");
                break;

        } 
        System.out.println("¿Deseas continuar? (s/n)");
            continuar = entrada.next().charAt(0);
        } while (continuar == 's' || continuar == 'S'); // Un do-while para determinar si quiere continuar.

    }

public static void operacionSuma(Scanner entrada) {
    try {
        System.out.println("Ingresa el primer número: ");
    
        int num1 = entrada.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2 = entrada.nextInt();
        Operaciones operacion = new Operaciones(num1, num2);
        operacion.operacionSuma();
    } catch (InputMismatchException e) {
        Excepciones.valorNoValido();
        entrada.nextLine(); // Limpiar el buffer del scanner
    }
}
public static void operacionResta(Scanner entrada) {
    try {
        System.out.println("Ingresa el primer número: ");
    
        int num1 = entrada.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2 = entrada.nextInt();
        Operaciones operacion = new Operaciones(num1, num2);
        operacion.operacionResta();
    } catch (InputMismatchException e) {
        Excepciones.valorNoValido();
        entrada.nextLine(); // Limpiar el buffer del scanner
    }
}
public static void operacionMultiplicacion(Scanner entrada) {
    try {
        System.out.println("Ingresa el primer número: ");
    
        int num1 = entrada.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2 = entrada.nextInt();
        Operaciones operacion = new Operaciones(num1, num2);
        operacion.operacionMultiplicacion();
        
    } catch (InputMismatchException e) {
        Excepciones.valorNoValido();
        entrada.nextLine(); // Limpiar el buffer del scanner
    }
}
public static void operacionDivision(Scanner entrada) {
    try {
        System.out.println("Ingresa el primer número: ");
    
        int num1 = entrada.nextInt();
        System.out.println("Ingresa el segundo número: ");
        int num2 = entrada.nextInt();
            Operaciones operacion = new Operaciones(num1, num2);
            operacion.operacionDivision();
          
    } catch (ArithmeticException e) {
        Excepciones.dividirPorCero();
        entrada.nextLine(); // Limpiar el buffer del scanner
    }
}
}