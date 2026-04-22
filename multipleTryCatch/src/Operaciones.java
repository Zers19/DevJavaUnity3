

public class Operaciones {
int num1, num2;
public Operaciones(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
}
public void operacionSuma() {
    System.out.println("El resultado de la suma es: " + (num1 + num2));
}
public void operacionResta() {
    System.out.println("El resultado de la resta es: " + (num1 - num2));
}
public void operacionMultiplicacion() {
    System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
}
public void operacionDivision() {
    if (num1 == 0 || num2 == 0) {
        Excepciones.dividirPorCero();
    } else {
        System.out.println("El resultado de la división es: " + (num1 / num2));
    }
}
}
