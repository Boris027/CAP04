import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
    Scanner num1=new Scanner(System.in);
    System.out.println("Este programa se base en sacar el tiempo aplicando la formula T= raiz cuadrada de 2*altura/9,81 m/sg ");
    System.out.print("Introduzca la altura: ");
    float h=num1.nextFloat();
    num1.close();
    float g=9.81f;
    float prueba=((2*h)/g);
    double raiz=Math.sqrt(prueba);
    if (prueba>=0){
        System.out.printf("%s%.2f%s","El tiempo que tardará en caer el objeto es de ",raiz," segundos");
    }
    else {
        System.out.println("No se puede hacer, el resultado de la raiz da negativo");
    }
    }
}
