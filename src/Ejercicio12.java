import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
    Scanner num1=new Scanner(System.in);
    int puntuacion=0;

    System.out.println("Como se le llama a la tarjeta gráfica");
        System.out.println("1.GPU 2.CPU");
        int elec1=num1.nextInt();
        switch (elec1){
                case 1: System.out.println("Correcto!!");
                puntuacion++;
                break;
                case 2: System.out.println("Vaya, esta no era la respuesta.");
                break;
        }
    
    System.out.println("Como se le llama al procesador");
        System.out.println("1.GPU 2.CPU");
        int elec2=num1.nextInt();
        switch (elec2){
                case 2: System.out.println("Correcto!!");
                puntuacion++;
                break;
                case 1: System.out.println("Vaya, esta no era la respuesta.");
                break;
        }

    System.out.println("Como se le donde se conectan los componentes");
        System.out.println("1.Placa base 2.Bios");
        int elec3=num1.nextInt();
        switch (elec3){
                case 1: System.out.println("Correcto!!");
                puntuacion++;
                break;
                case 2: System.out.println("Vaya, esta no era la respuesta.");
                break;
        }

    System.out.println("Que disco duro es mas rapido");
        System.out.println("1.HDD 2.SSD");
        int elec4=num1.nextInt();
        switch (elec4){
                case 2: System.out.println("Correcto!!");
                puntuacion++;
                break;
                case 1: System.out.println("Vaya, esta no era la respuesta.");
                break;
        }

    
    System.out.println("Que es indispensable para el ordenador");
        System.out.println("1.RAM 2.Disco duro");
        int elec5=num1.nextInt();
        switch (elec5){
                case 1: System.out.println("Correcto!!");
                puntuacion++;
                break;
                case 2: System.out.println("Vaya, esta no era la respuesta.");
                break;
        }

    System.out.println("De que marca son las RTX");
        System.out.println("1.AMD 2.NVIDIA");
        int elec6=num1.nextInt();
        switch (elec6){
                case 2: System.out.println("Correcto!!");
                puntuacion++;
                break;
                case 1: System.out.println("Vaya, esta no era la respuesta.");
                break;
        }


    System.out.println("Que es mas potente");
        System.out.println("1.I7 2.I5");
        int elec7=num1.nextInt();
        switch (elec7){
                case 1: System.out.println("Correcto!!");
                puntuacion++;
                break;
                case 2: System.out.println("Vaya, esta no era la respuesta.");
                break;
        }

    System.out.println("Cable para conectar el monitor");
        System.out.println("1.SATA 2.HDMI");
        int elec8=num1.nextInt();
        switch (elec8){
                case 2: System.out.println("Correcto!!");
                puntuacion++;
                break;
                case 1: System.out.println("Vaya, esta no era la respuesta.");
                break;
        }
    

    System.out.println("Que unidad representa el refresco de la pantalla");
        System.out.println("1.Hz 2.MBs");
        int elec9=num1.nextInt();
        switch (elec9){
                case 1: System.out.println("Correcto!!");
                puntuacion++;
                break;
                case 2: System.out.println("Vaya, esta no era la respuesta.");
                break;
        }

        System.out.println("Que es mas pesado");
        System.out.println("1.MB 2.KB");
        int elec10=num1.nextInt();
        switch (elec10){
                case 1: System.out.println("Correcto!!");
                puntuacion++;
                case 2: System.out.println("Vaya, esta no era la respuesta.");
        }

        
        System.out.println("Su nota final es de " +puntuacion +" sobre 10");
    }
}
