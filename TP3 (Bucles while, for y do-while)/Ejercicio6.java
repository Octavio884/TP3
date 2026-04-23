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
            if (N>=M || N<=0 || M<=0){
                System.out.println("N debe ser menor a M y ambos numeros deben ser positivos");
                continue;
            }
            for (int i=1; N*i<=M; i++){
                    System.out.println(N*i);
            }
        } while(M<N || N<=0 || M<=0);
    }
}