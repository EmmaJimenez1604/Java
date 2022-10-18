import java.util.Random;
import java.util.Scanner;


public class Robot {
    public static void main(String[] args) {
        RobotMet estado=new RobotMet();
        Scanner lector=new Scanner(System.in);
        Random pregalt=new Random();
        int pregnum=pregalt.nextInt(2)+1;
        boolean estado2= estado.getEncender();
        if(estado2==false){
            System.out.println("\nEstado del robot: apagado "+estado.getEncender());
        }
        System.out.println("\n¿Quieres encender el robot?");
        System.out.println("Ingresa el true EN MINÚSCULAS si deseas encender el robot");
        boolean a=lector.nextBoolean();
        if(a==true){
            estado.setEncender(a);
            System.out.println("Estado del robot: encendido "+estado.getEncender()+"\n"); 
            
            while(estado.getEncender()==true){
                estado.getMensaje();
                int caso=lector.nextInt();
                switch(caso){
                    case 1:
                        estado.OpBasic1();
                    break;
                    case 2:
                        estado.OpInter();
                    break;
                    case 3:
                        estado.OpAvanz();
                    break;
                    default:
                    System.out.println("No se encuentra la opción");
                    System.out.println("Ingresa una opción válida");
                    estado.getMensaje();
                    caso=lector.nextInt();
                    break;

                }

                System.out.println("¿Quieres apagar el robot?");
                System.out.println("Ingresa el false EN MINÚSCULAS si deseas encender el robot\n");
                System.out.println("Ingresa el true EN MINÚSCULAS si deseas continuar aprendiendo con el robot\n");
                boolean b = lector.nextBoolean();
                if(b==false){
                    estado.setEncender(b);
                }

            }
            System.out.println("Estado del robot: apagado "+estado.getEncender());
        }

    }
}
