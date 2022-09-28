import java.util.Scanner;

/**
 * Modifica el programa visto en clase para determinar el orden de 3 números enteros y renombralo como OrdenTresNumeros.java. 
 * Pero añade que puede haber dos o tres números con el mismo valor, en este caso imprime las posibles secuencias de menor a mayor.
 * 
 *
 * @author JiménezSánchez Emma Alicia.
 */


public class OrdenTresNumeros{
    public static void main(String[] args){
    
        Scanner lector=new Scanner(System.in);
        System.out.println("Dame el primer número:");
        int a = lector.nextInt();
        System.out.println("Dame el segundo número:");
        int b = lector.nextInt();
        System.out.println("Dame el tercer número:");
        int c = lector.nextInt();


        //a b c
        if(a<b && b<c) {
            System.out.println("Números ordenados:");
            System.out.print(a+",");  
            System.out.print(b+",");
            System.out.println(c);	
        } 
        // a c b
        else if(a<c && c<b) {
            System.out.println("Números ordenados:");
            System.out.print(a+",");
            System.out.print(c+",");
            System.out.println(b);	
            
        } 
        /* b a c*/ 
        else if(b<a && a<c) {
            System.out.println("Números ordenados:");
            System.out.print(b+",");
            System.out.print(a+",");
            System.out.println(c);
        } 
        //b c a
        else if(b<c && c<a) {
            System.out.println("Números ordenados:");
            System.out.print(b+",");
            System.out.print(c+",");
            System.out.println(a);
        } 
        /* c a b*/
        else if(c<a && a<b) {
            System.out.println("Números ordenados:");
            System.out.print(c+",");
            System.out.print(a+",");
            System.out.println(b);
        } 
        // c b a
        else if(c<b && b<a) {
            System.out.println("Números ordenados:");
            System.out.print(c+",");
            System.out.print(b+",");
            System.out.println(a);
        }
        // a=c<b A es igual a C, es lo mismo que C=A y menores que B
        else if(a==c && a<b){
            System.out.println("Números ordenados:");
            System.out.print(a+",");
            System.out.print(c+",");
            System.out.println(b);
        }
        // a=c<b A es igual a B, es lo mismo que C=A y menores que C
        else if(a==b && a<c){
            System.out.println("Números ordenados:");
            System.out.print(a+",");
            System.out.print(b+",");
            System.out.println(c);
        }
        // b=c<a B es igual a C, es lo mismo que B=C y menores que A
        else if(b==c && b<a){
            System.out.println("Números ordenados:");
            System.out.print(c+",");
            System.out.print(b+",");
            System.out.println(a);
        }
        // a=b>c A es igual a B, es lo mismo que A=B y mayores que C
        else if(a==b && a>c){
            System.out.println("Números ordenados:");
            System.out.print(c+",");
            System.out.print(b+",");
            System.out.println(a);
        }
        // a=c>b A es igual a C, es lo mismo que A=C y mayores que B
        else if(a==c && a>b){
            System.out.println("Números ordenados:");
            System.out.print(b+",");
            System.out.print(a+",");
            System.out.println(c);
        }
        // b=c>a B es igual a C, es lo mismo que B=C y mayores que A
        else if(b==c && b>a){
            System.out.println("Números ordenados:");
            System.out.print(a+",");
            System.out.print(b+",");
            System.out.println(c);
        }
        // Si todas los iguales
        else if(a==b && a==c && b==c){
            System.out.println("Números ordenados:");
            System.out.println(a+","+b+","+c);
            System.out.println("************");
            System.out.println(a+","+c+","+b);
            System.out.println("************");
            System.out.println(b+","+a+","+c);
            System.out.println("************");
            System.out.println(b+","+c+","+a);
            System.out.println("************");
            System.out.println(c+","+a+","+b);
            System.out.println("************");
            System.out.println(c+","+b+","+a);
        }
        else{
            System.out.println("No seas malo onda TnT");
        }
        
    }
}