import java.util.Scanner;
import java.util.Random;

public class Canicas {

    public static void main(String[] args){
            System.out.println("\nBIENVENIDOS AL JUEGO DE LAS CANICAS!");
            //Creación de lo objetos
            Random canica=new Random();
            Scanner lector = new Scanner(System.in);
            //Creación de las variables
            int miguel=10;
            int compu=10;
            int impar=1;
            int par=0;
            boolean Soldadorojo=true;
    
            while(Soldadorojo){
                //La partida del Usuario
                System.out.println("\nEs tu turno de elegir");
                //---------------------------------------------------------
                System.out.println("Tienes de canicas: "+miguel);
                System.out.println("¿Cuánto apuestas?");
                int apuestaU=lector.nextInt();
                do{
                    if(apuestaU<=miguel){
                        System.out.println("Si podemos apostar\n");
                        break;
                    }
                    else{
                        System.out.println("\nNo tienes esa cantidad de canicas\nIngresa una cantidad válida\n");
                        System.out.println("¿Cuánto apuestas?");
                        apuestaU=lector.nextInt();
                    }
    
                }while(apuestaU>=miguel);
                //-------------------------------------------------------------------------------------
                //EsValido(miguel);
                int apuestaCompu=canica.nextInt(compu)+1;
                System.out.println("\n¿Las canicas que tiene la computadora es impar o par?");
                System.out.println("Ingresa 1 si es impar");
                System.out.println("Ingresa 2 si es par\n");
                int sus=lector.nextInt();
                if(sus==1){
                    if(impar==(apuestaCompu%2)){
                        System.out.println("Si era impar \nGanamos estas cánicas "+apuestaCompu+"\n");
                        miguel = miguel + apuestaCompu;
                        compu = compu - apuestaCompu;
                    }
                    else if(par==(apuestaCompu%2)){
                        System.out.println("No era impar \nPerdimos estas cánicas "+apuestaU+"\n");
    
                        miguel = miguel - apuestaU;
                        compu = compu + apuestaU;
                    }
                }
                else if(sus==2){
                    if(par==(apuestaCompu%2)){
                        System.out.println("Si era par \nGanamos estas cánicas "+apuestaCompu+"\n");
    
                        miguel = miguel + apuestaCompu;
                        compu = compu - apuestaCompu;
                    }
                    else if(impar==(apuestaCompu%2)){
                        System.out.println("No era par \nPerdimos estas cánicas "+apuestaU+"\n");
    
                        miguel = miguel - apuestaU;
                        compu = compu + apuestaU;
                    }
    
                }

                //---------------------------------------------------------------------------------------

                if(miguel<=0 && compu ==20){
                    System.out.println("Perdimos al juego de las canicas");
                    Soldadorojo=false;
                    break;
                }
                else if(miguel==20 && compu<=0){
                    System.out.println("Sobrevivimos al juego de las cánicas");
                    Soldadorojo=false;
                    break;
                }

                //------------------------------------------------------------------
    
                //Partida de la Compu 
                apuestaCompu=canica.nextInt(compu)+1; //Aquí la computadora escoge las cánicas que quiere apostar
                System.out.println("\nAhora es el turno de la computadora!!!\n");
                //---------------------------------------------------------------------------------------------------
                System.out.println("Tienes de canicas: "+miguel);
                System.out.println("¿Cuánto apuestas?");
                apuestaU=lector.nextInt();
                do{
                    if(apuestaU<=miguel){
                        System.out.println("Si podemos apostar\n");
                        break;
                    }
                    else{
                        System.out.println("\nNo tienes esa cantidad de canicas\nIngresa una cantidad válida\n");
                        System.out.println("¿Cuánto apuestas?");
                        apuestaU=lector.nextInt();
                    }
    
                }while(apuestaU>=miguel);

                //--------------------------------------------------------------------------------------------------
                int suscompu=canica.nextInt(2)+1;
                System.out.println("\nLa computadora supuso esto "+suscompu);
                if(suscompu==1){
                    if(impar==(apuestaU%2)){
                        System.out.println("La computadora acerto\nSi era impar \nPerdimos estas cánicas "+apuestaU+"\n");
                        miguel = miguel - apuestaU;
                        compu = compu + apuestaU;
                    }
                    else if(par==(apuestaU%2)){
                        System.out.println("La computadora erro\nNo era impar \nGanamos estas cánicas "+apuestaCompu+"\n");
                        miguel = miguel + apuestaCompu;
                        compu = compu - apuestaCompu;
                    }
                }
                else if(suscompu==2){
                    if(par==(apuestaU%2)){
                        System.out.println("La computadora acerto\nSi era par \nPerdimos estas cánicas "+apuestaU+"\n");
    
                        miguel = miguel - apuestaU;
                        compu = compu + apuestaU;
                    }
                    else if(impar==(apuestaU%2)){
                        System.out.println("La computadora erro\nNo era par \nGanamos estas cánicas "+apuestaCompu+"\n");
    
                        miguel = miguel + apuestaCompu;
                        compu = compu - apuestaCompu;
                    }
    
                }
    
                if(miguel<=0 && compu ==20){
                    System.out.println("Perdimos al juego de las canicas");
                    Soldadorojo=false;
                }
                else if(miguel==20 && compu<=0){
                    System.out.println("Sobrevivimos al juego de las cánicas");
                    Soldadorojo=false;
                }
        }
    }
}
