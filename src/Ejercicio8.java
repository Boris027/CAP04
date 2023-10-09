import java.util.Scanner;
public class Ejercicio8 {
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
        System.out.printf("%s%.2f%n","Enhorabuena, has aprovado con una media de ",media);
            if (media>=5 && media<6){
                System.out.println("Nota de boletin: Suficiente");
            }
            else if (media>=6 && media<7){
                System.out.println("Nota de boletin: Bien");
            }
            else if (media>=7 && media<9){
                System.out.println("Nota de boletin: Notable");
            }
            else if (media>=9){
                System.out.println("Nota de boletin: Sobresaliente");
            }
    }
    else {
        System.out.printf("%s%.2f%n","Vaya, has suspendido con una media de ",media);
        System.out.println("Nota de boletin: Insuficiente");
    }
    }
    }
}
