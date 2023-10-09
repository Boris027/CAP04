import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner num1=new Scanner(System.in);
        System.out.print("Introduzca la hora: ");
        int hora=num1.nextInt();
        num1.close();
        if (hora>=6 && hora<=12) {
            System.out.println("Buenos dias");
        }
        else if (hora>=13 && hora<=20) {
            System.out.println("Buenas tardes");
        }
        else if ((hora>=21 || hora<=5) && hora<=23) {
            System.out.println("Buenas noches");
        }
        else {
            System.out.println("La hora que ha introducido es incorrecta, introduzca la hora en formato numero entero");
        }
        
    }
}
