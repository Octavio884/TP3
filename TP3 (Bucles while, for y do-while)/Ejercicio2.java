import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[]args){
        int i=1;
        int c=1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Cual es tu numero");
        int n=lector.nextInt();
        while (i<=n){
            System.out.println(i);
            i++;
        }
        System.out.println("¿Cual es tu numero?");
        int p=lector.nextInt();
        do {
            System.out.println(c);
            c++;
        } while (c<=p);
        System.out.println("¿Cual es tu numero?");
        int ñ=lector.nextInt();
        for(int k=1; k<=ñ; k++){
            System.out.println(k);
        }
    }
}
