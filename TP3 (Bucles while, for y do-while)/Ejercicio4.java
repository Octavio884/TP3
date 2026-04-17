import java.util.Scanner;
public class Ejercicio4{
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        int i;
        int k;
        do{
            System.out.println("¿Cual es tu primer número?");
            i=lector.nextInt();
            System.out.println("¿Cual es tu segundo número?");
            k=lector.nextInt();
            if (k>i){
                while(k>=i){
                    System.out.println(i);
                    i++;
                }
            }
            else if (k<i){
                while(k<=i){
                    System.out.println(k);
                    k++;
                }
            }
        } while (i==k);
    }
}
