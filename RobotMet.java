import java.util.Random;
import java.util.Scanner;


public class RobotMet {
    //Atributos
    Scanner lector = new Scanner(System.in);
    Random alt = new Random();
    private boolean encendida;

    public RobotMet(){
        encendida=false; //Esta apagada
    }

    public RobotMet(boolean encendida){
        this.encendida=encendida; //Esta apagada
    }
    //Método de Mensaje de Bienvenida
    public static void getMensaje(){
        String b="bienvenido al robot de estudio";
        System.out.println(b.toUpperCase());
        System.out.println("¿Qué nivel deseas estudiar?");
        System.out.println("Ingresa el número de la opción");
        System.out.println("1. Practicar operaciones básicas");
        System.out.println("2. Practicar operaciones intermedias");
        System.out.println("3. Practicar operaciones avanzadas");
    }

    //Método para encender el robot
    public boolean setEncender(boolean encendida){
        this.encendida=encendida;
        return encendida;
    }

    //Método para apagar el robot
    public boolean getEncender(){
        return encendida;
    }

    //Método Generar Operaciones Básicas
    public void OpBasic1(){
        int num1=alt.nextInt(9)+1;
        int num2=alt.nextInt(9)+1;
        int pregnum=alt.nextInt(2)+1;
        int cont=0;
        int result=num1+num2;

        for(int i=1; i<11;i++){
            pregnum=alt.nextInt(2)+1;
            if(pregnum==1){
                for(int k=0; k<1; k++){
                    num1=alt.nextInt(9)+1;
                    num2=alt.nextInt(9)+1;
                    result=num1+num2;
                    System.out.print("Pregunta "+i+": "+num1+"+"+num2+"=");
                    int resultU=lector.nextInt(); 
                    if(resultU==result){
                        System.out.println("Correct!\nEl resultado es: "+result+"\nSigue continuando.");
                        cont++;
                    }
                    else if(resultU!=result){
                        System.out.println("Incorrect! El resultudo es: "+result);
                    }
                }
            }
            
            else if(pregnum==2){
                for(int j=0; j<1; j++){
                    num1=alt.nextInt(9)+1;
                    num2=alt.nextInt(9)+1;
                    int result2=num1-num2;
                    System.out.print("Pregunta "+i+": "+num1+"-"+num2+"=");
                    int resultU=lector.nextInt(); 
                    if(resultU==result2){
                        System.out.println("Correct!\nEl resultado es:"+result2+"\nSigue continuando.");
                        cont++;
                    }
                    else if(resultU!=result2){
                        System.out.println("Incorrect! El resultudo es: "+result2);
                    }
                }
    
            }
        }

        if(cont<6){
            System.out.println("¡REPROBASTE!\nResultado "+cont);
        }else if(cont>=6){
            System.out.println("¡APROBASTE! Resultado "+cont);
        }

    }

    // //Método Generar Operaciones Intermedias
    public void OpInter(){
        int num1=alt.nextInt(99-10)+10;
        int num2=alt.nextInt(99-10)+10;
        int cont=0;
        int pregnum=alt.nextInt(3)+1;
        int result=num1+num2;

        for(int i=1; i<11;i++){
            pregnum=alt.nextInt(3)+1;
            if(pregnum==1){
                for(int k=0; k<1; k++){
                    num1=alt.nextInt(99-10)+10;
                    num2=alt.nextInt(99-10)+10;
                    result=num1+num2;
                    System.out.print("Pregunta "+i+": "+num1+"+"+num2+"=");
                    int resultU=lector.nextInt(); 
                    if(resultU==result){
                        System.out.println("Correct!\nEl resultado es:"+result+"\nSigue continuando.");
                        cont++;
                    }
                    else if(resultU!=result){
                        System.out.println("Incorrect! El resultudo es: "+result);
                    }
                }
            }
            
            else if(pregnum==2){
                for(int j=0; j<1; j++){
                    num1=alt.nextInt(99-10)+10;
                    num2=alt.nextInt(99-10)+10;
                    int result2=num1-num2;
                    System.out.print("Pregunta "+i+": "+num1+"-"+num2+"=");
                    int resultU=lector.nextInt(); 
                    if(resultU==result2){
                        System.out.println("Correct!\nEl resultado es:"+result2+"\nSigue continuando.");
                        cont++;
                    }
                    else if(resultU!=result2){
                        System.out.println("Incorrect! El resultudo es: "+result2);
                    }
                }
    
            }
    
            else if(pregnum==3){
                for(int j=0; j<1; j++){
                    num1=alt.nextInt(99-10)+10;
                    num2=alt.nextInt(9)+1;
                    int result3=num1*num2;
                    System.out.print("Pregunta "+i+": "+num1+"*"+num2+"=");
                    int resultU=lector.nextInt(); 
                    if(resultU==result3){
                        System.out.println("Correct!\nEl resultado es:"+result3+"\nSigue continuando.");
                        cont++;
                    }
                    else if(resultU!=result3){
                        System.out.println("Incorrect! El resultudo es: "+result3);
                    }
                }
    
            }
        }
        if(cont<6){
            System.out.println("¡REPROBASTE!\nResultado "+cont);
        }else if(cont>=6){
            System.out.println("¡APROBASTE! Resultado "+cont);
        }

    }
    // //Método Generar Operaciones Avanzadas
    public void OpAvanz(){
        int num1=alt.nextInt(900-100)+100;
        int num2=alt.nextInt(900-100)+100;
        int pregnum=alt.nextInt(2)+1;
        int cont=0;
        int result=num1+num2;

        for(int i =1; i<11;i++){
            pregnum=alt.nextInt(4)+1;
            if(pregnum==1){
                for(int k=0; k<1; k++){
                    num1=alt.nextInt(900-100)+100;
                    num2=alt.nextInt(900-100)+100;
                    result=num1+num2;
                    System.out.print("Pregunta "+i+": "+num1+"+"+num2+"=");
                    int resultU=lector.nextInt(); 
                    if(resultU==result){
                        System.out.println("Correct!\nEl resultado es:"+result+"\nSigue continuando.");
                        cont++;
                    }
                    else if(resultU!=result){
                        System.out.println("Incorrect! El resultudo es: "+result);
                    }
                }
            }
            
            else if(pregnum==2){
                for(int j=0; j<1; j++){
                    num1=alt.nextInt(900-100)+100;
                    num2=alt.nextInt(900-100)+100;
                    int result2=num1-num2;
                    System.out.print("Pregunta "+i+": "+num1+"-"+num2+"=");
                    int resultU=lector.nextInt(); 
                    if(resultU==result2){
                        System.out.println("Correct!\nEl resultado es:"+result2+"\nSigue continuando.");
                        cont++;
                    }
                    else if(resultU!=result2){
                        System.out.println("Incorrect! El resultudo es: "+result2);
                    }
                }
    
            }
    
            else if(pregnum==3){
                for(int j=0; j<1; j++){
                    num1=alt.nextInt(900-100)+100;
                    num2=alt.nextInt(900-100)+100;
                    int result3=num1*num2;
                    System.out.print("Pregunta "+i+": "+num1+"*"+num2+"=");
                    int resultU=lector.nextInt(); 
                    if(resultU==result3){
                        System.out.println("Correct!\nEl resultado es:"+result3+"\nSigue continuando.");
                        cont++;
                    }
                    else if(resultU!=result3){
                        System.out.println("Incorrect! El resultudo es: "+result3);
                    }
                }
    
            }
    
            else if(pregnum==4){
                for(int j=0; j<1; j++){
                    num1=alt.nextInt(900-100)+100;
                    num2=alt.nextInt(900-100)+100;
                    if(num1<=num2){
                        while(num1<=num2){
                            num1=alt.nextInt(900-100)+100;
                        }
                    }
                    else if(num1>num2){
                        int result4=num1/num2;
                        System.out.print("Pregunta "+i+": "+num1+"/"+num2+"=");
                        System.out.println("\nRecuerda que debe ser un número entero el que debes de ingresar");
                        int resultU=lector.nextInt(); 
                        if(resultU==result4){
                            System.out.println("Correct!\nEl resultado es:"+result4+"\nSigue continuando.");
                            cont++;
                        }
                        else if(resultU!=result4){
                            System.out.println("Incorrect! El resultudo es: "+result4);
                        }
                    }
                }
            }
        }
        if(cont<6){
            System.out.println("¡REPROBASTE!\nResultado "+cont);
        }else if(cont>=6){
            System.out.println("¡APROBASTE! Resultado "+cont);
        }

    }
}
