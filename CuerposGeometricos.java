import java.util.Scanner;

/**
 * Escribe un programa en Java que calcule el volumen de los siguientes tres cuerpos geométricos: cono, esféra y hemisferio.
 *
 * @author JiménezSánchez Emma Alicia.
 */


public class CuerposGeometricos{
    public static void main(String[] args){
        Scanner lectorP=new Scanner(System.in); //Se crea un objeto Scanner
        System.out.println("Se puede calcular el:\n1.cono\n2.esfera\n3.hemisferio"); //Mostramos cuales figuras podemos generar su volúmen
        System.out.println("Introduzca que fórmula del volúmen desea realizar:");
        Integer figura=lectorP.nextInt();
        if(figura==1){ //Fórmula para el cícrulo
            System.out.println("¿Cuál es el radio del círculo?");
            int r=lectorP.nextInt();
            System.out.println("¿Cuál es la altura del círculo?");
            int h=lectorP.nextInt();
            double c=(Math.PI*(Math.pow(r,2))*h)/3;
            System.out.println("El vólumen del círculo "+r+ " es: "+c);
            
        }
        else if(figura==2){ //Fórmula para la esfera
            System.out.println("¿Cuál es el radio de la esfera?");
            int r=lectorP.nextInt();
            double c=(Math.PI*(Math.pow(r,3)))*4/3;
            System.out.println("El vólumen de la esfera con radio "+r+ " es: "+c);
            lectorP.close();
        }
        else if(figura==3){ //Fórmula para el hemisferio
            System.out.println("¿Cuál es el radio de la hemisferio?");
            int r=lectorP.nextInt();
            double c=(Math.PI*(Math.pow(r,3)))*2/3;
            System.out.println("El vólumen del hemisferio con radio"+r+ " es: "+c);
            lectorP.close();
        }
        else{
            System.out.println("Opción no válida");
        }
    }
}