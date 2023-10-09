import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
    Scanner num1 =new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    int numero=num1.nextInt();


    if (numero%2==0){
        System.out.print(numero +" es par");
        if (numero%5==0){
            System.out.print(" y ademas es divisible entre 5");
         }
        else{
            System.out.print(" y no es divisible entre 5");
        }
    }
    else{
        System.out.println(numero +" no es par");
    }
    }
}
