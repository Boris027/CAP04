import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner num1=new Scanner(System.in);
        System.out.println("Lunes=1");
        System.out.println("Martes=2");
        System.out.println("Miércoles=3");
        System.out.println("Jueves=4");
        System.out.println("Viernes=5");

        System.out.print("Introduzca el dia de la semana: ");
        int dia=num1.nextInt();
        num1.close();
        switch(dia) {
            case 1: System.out.println("El lunes a primera hora tienes Programación");
            break;
            case 2: System.out.println("El martes a primera hora tienes Lenguaje de marcas");
            break;
            case 3: System.out.println("El miércoles a primera hora tienes Lenguaje de marcas");
            break;
            case 4: System.out.println("El jueves a primera hora tienes Programación");
            break;
            case 5: System.out.println("El viernes a primera hora tienes Formación y orientación laboral");
            break;
            default:System.out.println("La opción que ha elegido no es correcta");
        }
        
    }
}
