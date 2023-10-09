import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
    
    Scanner num1=new Scanner(System.in);
    System.out.println("Este programa resuelve ecuaciones de primera grado del tipo ax + b=0");
    System.out.print("Introduce el valor de a: ");
    float a=num1.nextFloat();
    System.out.print("Introduce el valor de b: ");
    float b=num1.nextFloat();
    num1.close();

    if (a!=0){
        System.out.println("X= " +(-b/a));
    }
    else{
        System.out.println("Esta ecuación no tiene solución real");
    }
    }
}
