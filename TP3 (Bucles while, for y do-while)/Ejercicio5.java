import java.util.Scanner;
public class Ejercicio5{
    public static void main(String[] args) {
        Scanner objeto= new Scanner (System.in);
        int A;
        int B;
        boolean C=true;
        do {
            System.out.println("Cual es tu primer número, A:");
            A= objeto.nextInt();
            System.out.println("Cual es tu segundo número, B:");
            B=objeto.nextInt();
            if (A<B){
                C=false;
                if (A%2!=0){
                    A++;
                }
            }
            else{
                System.out.println("Volve a ingresar ambos numeros: ");
                continue;
            }
            while (A<=B){
                System.out.println(A);
                A+=2;
            }
        } while(C);
    }
}
