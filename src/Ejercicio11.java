import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
    Scanner num1=new Scanner(System.in);
    System.out.print("Introduzca la hora (0-23): ");
    int hora=num1.nextInt();
    System.out.print("Introduce el minuto en el que estas(0-59): ");
    int minuto=num1.nextInt();
    num1.close();

    int horafinal=24*60*60;

    int convertido=((hora*60*60)+minuto*60);
    System.out.printf("%s %d","Los segundos que te faltan para llegar a medianoche son: ",horafinal-convertido);
    
    
    }
}
