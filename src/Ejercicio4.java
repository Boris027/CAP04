import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
    
    Scanner num1=new Scanner(System.in);

    System.out.print("Introduce el numero de horas que trabajas a la semana: ");
    int horas=num1.nextInt();
    num1.close();
    
    if (horas<=40){
        System.out.print("El sueldo semanal que le corresponde es de " +(horas*12) +" euros");
    }
    else if (horas>=41){
        int resto=horas-40;
        System.out.print("El sueldo semanal que le corresponde es de " +(resto*16+480) +" euros");
    }
    else {
        System.out.print("Error, prueba a introducir un numero entero");
    }
    }
}
