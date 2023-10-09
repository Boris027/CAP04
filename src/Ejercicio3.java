import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
    Scanner num1 =new Scanner(System.in);
    System.out.print("Introduce el numero del dia de la semana: ");
    int semana=num1.nextInt();
    num1.close();

    switch (semana){
        case 1: System.out.println("Lunes");
        break;
        case 2: System.out.println("Martes");
        break;
        case 3: System.out.println("Miércoles");
        break;
        case 4: System.out.println("Jueves");
        break;
        case 5: System.out.println("Viernes");
        break;
        case 6: System.out.println("Sábado");
        break;
        case 7: System.out.println("Domingo");
        
        default: System.out.println("Ese número no es válido, introduce un número entre (1-7)");


    }


    }
}
