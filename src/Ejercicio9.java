import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
    Scanner num1=new Scanner(System.in);
    System.out.println("Este programa resuelve una ecuación de segundo grado del tipo: ax2 + bx + c = 0");
    System.out.print("Introduce a: ");
    float a=num1.nextFloat();
    System.out.print("Introduce b: ");
    float b=num1.nextFloat();
    System.out.print("Introduce c: ");
    float c=num1.nextFloat();
    num1.close();

    double raiz=(Math.sqrt(b*b-4*a*c));
    
    double resultado=(-b+raiz)/2*a;
    double resultado2=(-b-raiz)/2*a;
    
    if (raiz>=0){
        System.out.printf("%s%.2f%n","El primer resultado es: ",resultado);
        System.out.printf("%s%.2f","El segundo resultado es: ",resultado2);
    }
    else{
        System.out.println("No se puede hacer puesto que la raiz da negativa");
    }
    }
}
