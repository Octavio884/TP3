import java.util.Scanner;
public class Ejercicio8{
    public static void main(String[] args) {
        Scanner objeto= new Scanner (System.in);
        char caracter;
        do{
            System.out.println("Cual es tu caracter, en mayusculas:");
            caracter= objeto.nextLine().charAt(0);
            if (caracter=='0'){
                break;
            }
            else if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
                System.out.println("Tu caracter es una vocal");
            }
            else{
                System.out.println("Tu caracter no es una vocal");
            }
        }while(caracter!='0');
    }
}
