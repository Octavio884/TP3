import java.util.Scanner;
public class Ejercicio7{
    public static void main(String[] args) {
        Scanner objeto= new Scanner (System.in);
        double millas;
        do  
        {
            millas= objeto.nextDouble();
            if (millas==0){
                break;
            }
            double km=  1.6093*(millas);
            System.out.println("Tenes "+ km+ " km");
        } while (true);
    }
}
