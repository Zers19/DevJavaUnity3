import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Scanner entrada = new Scanner(System.in);
       char confirmacion;
do { 
       System.out.println("Ingresa el indice a consultar:");
       int indice = entrada.nextInt();
       
           
        try {
            ListaDeNombres lista = new ListaDeNombres();
            System.out.println("El nombre en el indice " + indice + " es: " + lista.getNombre(indice));
        } catch (ArrayIndexOutOfBoundsException e) {
            ManejoDeErrores.IndiceFueraDeRango();
        }
        
        System.out.println("¿Deseas consultar otro indice? (s/n)");
        confirmacion = entrada.next().charAt(0);
    } while (confirmacion == 's' || confirmacion == 'S');
    entrada.close();
    }
}