public class Ejercicio1{
    public static void main(String[]args){
        int a=1;
        while (a<=100){
            System.out.println("Contador: "+ a);
            a++;
        }
        int b=1;
        do {
            System.out.println("Contador: "+ b);
            b++;
        } while (b<=100);
        for (int i=1; i<=100; i++){
            System.out.println("Contador: "+i);
        }
    }
}