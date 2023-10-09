import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
    Scanner num1=new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int numero1=num1.nextInt();
    System.out.print("Introduce un numero: ");
    int numero2=num1.nextInt();
    System.out.print("Introduce un numero: ");
    int numero3=num1.nextInt();


    if (numero1>numero2 && numero2>numero3){
        System.out.println("Los numeros ordenados son: "+numero1 +" " +numero2 +" " +numero3);
    }
    else if (numero1>numero3 && numero3>numero2){
        System.out.println("Los numeros ordenados son: "+numero1 +" " +numero3 +" " +numero2);
    }
    else if (numero2>numero1 && numero1>numero3){
        System.out.println("Los numeros ordenados son: "+numero2 +" "+numero1 +" "+numero3);
    }
    else if (numero2>numero3 && numero3>numero1){
        System.out.println("Los numeros ordenados son: "+numero2 +" "+numero3 +" "+numero1);
    }
    else if (numero3>numero2 && numero2>numero1){
        System.out.println("Los numeros ordenados son: "+numero3 +" "+numero2 +" "+numero1);
    }
    else if (numero3>numero1 && numero1>numero2){
        System.out.println("Los numeros ordenados son: "+numero3 +" "+numero1 +" "+numero2);
    }
    }
}
