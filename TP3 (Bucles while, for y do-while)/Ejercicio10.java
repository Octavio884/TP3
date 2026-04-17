import java.util.Scanner;
public class Ejercicio10{
    public static void main(String[] args) {
        Scanner objeto= new Scanner(System.in);
        System.out.println("¿Cual es el primer monto a pagar de tu producto (mensual)?");
        int monto_inicial = objeto.nextInt();
        System.out.println("¿A que plazo tenes que pagar tu producto (meses)?");
        int plazo=objeto.nextInt();
        int sum=0;
        for (int b=1; b<=plazo; b++){
            sum=sum+monto_inicial;
            monto_inicial*=2;
        }
        System.out.println("El total a pagar es de "+sum+ " dólares");
    }
}