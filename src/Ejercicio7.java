import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
    Scanner num1=new Scanner(System.in);

    System.out.print("Introduce tu primera nota: ");
    float nota1=num1.nextFloat();
    System.out.print("Introduce tu segunda nota: ");
    float nota2=num1.nextFloat();
    System.out.print("Introduce tu tercera nota: ");
    float nota3=num1.nextFloat();
    num1.close();
    if (nota1>10 || nota1<0 || nota2>10 || nota2<0 || nota3>10 || nota3<0){
        System.out.println("Error debe de introducir numeros enteros (0-10)");
    }
    else {
    float media=(nota1+nota2+nota3)/3;
    if (media>=5) {
        System.out.printf("%s %.2f","Enhorabuena, has aprovado con una media de ",media);
    }
    else {
        System.out.printf("%s %.2f","Vaya, has suspendido con una media de ",media);
    }
    }
    }
}
