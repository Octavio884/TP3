import java.util.Scanner;
public class Ejercicio6{
    public static void main(String[] args) {
        Scanner objeto= new Scanner (System.in);
        int N;
        int M;
        do {
            System.out.println("Ingrese N y M, ambos positivos");
            N=objeto.nextInt();
            M=objeto.nextInt();
            if (N>=M){
                System.out.println("N debe ser menor a M");
            }
        } while(M<N || N<=0 || M<=0);
    }
}