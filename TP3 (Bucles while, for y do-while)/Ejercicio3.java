import java.util.Scanner;
public class Ejercicio3{
    public static void main(String[]args){
        Scanner lector = new Scanner(System.in);
        System.out.println("¿Cual es tu numero?");
        int ñ=lector.nextInt();
        for(int k=1; ñ>=k; ñ--){
            System.out.println(ñ);
        }
    }
}
