import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
    Scanner num1=new Scanner(System.in);
    
    System.out.println("1.Izquierda, 2.Derecha, 3.Arriba, 4.Abajo");
    System.out.print("Hacia que dirección quiere que mire la pirámide: ");
    int direccion=num1.nextInt();

    switch (direccion){
        case 1:
        System.out.println("          *");
        System.out.println("         **");
        System.out.println("        ***");
        System.out.println("         **");
        System.out.println("          *");
        break;

        case 2:
        System.out.println("        *");
        System.out.println("        **");
        System.out.println("        ***");
        System.out.println("        **");
        System.out.println("        *");
        break;

        case 3:
        System.out.println("          *");
        System.out.println("         ***");
        System.out.println("        *****");
        break;

        case 4:
        System.out.println("        *****");
        System.out.println("         *** ");
        System.out.println("          *");
        break;
        
        default: System.out.println("Error, debes de introducir un número de 1 al 4.");
    }
    
    }
}
