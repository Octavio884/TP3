import java.util.Scanner;
public class Ejercicio9{
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int c=1;
    System.out.println("Ingrese el numero base");
    int a =teclado.nextInt();
    System.out.println("Ingrese el número exponente");
    int b =teclado.nextInt();
    for (int d=1; b>=d; b--){
        c = c * a;
    }
    System.out.println("El valor es: " + c);
}
}