import java.util.Random;

/**
 * Genera 20 calificaciones aleatorias de 0 a 10, imprime en pantalla su representación en letra e 
 * imprime las frecuencias de las calificaciones con asteriscos.
 *
 * @author JiménezSánchez Emma Alicia.
 */

public class Calificaciones{

    //Se creó este método para no tener que repetir el for(int a=0; a menor que i; a++) agregar un "*" por cada calificación repetida.
    public static void ast(int i) {
        for (int a=0; a < i; a++) { 
            /*mientras que i sea mayor a 0 se va a seguir corriendo el while,
             ya que como no sabemos cuantas calif se van a repetir, no podemos ponerle un máximo, 
             así que lo que se puede hacer en decrecer el contador para que cuando no sea mayor a 0 se salga del while*/
            System.out.print(" * ");
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        Random entrada = new Random(); //Se inicializa nuestro objeto random
        //Se declara un contador por cada calificación que vamos a obtener
        int conta0 = 0;
        int conta1 = 0;
        int conta2 = 0;
        int conta3 = 0;
        int conta4 = 0;
        int conta5 = 0;
        int conta6 = 0;
        int conta7 = 0;
        int conta8 = 0;
        int conta9 = 0;
        int conta10 = 0;

        System.out.println("Las calificaciones generadas:");
        //Mientras que nuestro contador i sea 1, menor que 21 y se va a ir sumando 1 cada vez que la condición se cumpla, hasta que i sea mayor que 21
        for (int i = 1; i < 21; i++) {
            int calif = entrada.nextInt(11); //nuestra variable calif va a tener 11 valores random, los cuales van a tener un rango de 0 a 10
            if (calif == 10) {
                System.out.print("A ");
                conta10++;
            } else if (calif == 9) {
                System.out.print("B ");
                conta9++;
            } else if (calif == 8) {
                System.out.print("C ");
                conta8++;
            } else if (calif == 7) {
                System.out.print("D ");
                conta7++;
            } else if (calif == 6) {
                System.out.print("E ");
                conta6++;
            } else if (calif == 5) {
                System.out.print("F ");
                conta5++;
            } else if (calif == 4) {
                System.out.print("F ");
                conta4++;
            } else if (calif == 3) {
                System.out.print("F ");
                conta3++;
            } else if (calif == 2) {
                System.out.print("F ");
                conta2++;
            } else if (calif == 1) {
                System.out.print("F ");
                conta1++;
            } else if (calif == 0) {
                System.out.print("F ");
                conta0++;
            }

        }

        System.out.println("\n");
        System.out.println("Calificaciones repetidas:");
        /*Se nos va a mostrar las calificaciones repetidas, donde el contador de cada califcación va a registrar cuantas veces 
         se repeti una calificación, y el método ast va a convertir nuestros contadores con tipo de variable int en '*' */
        System.out.print("0:"); 
        for (int i=0;i<conta0;i++) {
            System.out.print(" * ");
        }
        System.out.print("\n");     
        //ast(conta0);
        System.out.print("1:");
        ast(conta1);
        System.out.print("2:");
        ast(conta2);
        System.out.print("3:");
        ast(conta3);
        System.out.print("4:");
        ast(conta4);
        System.out.print("5:");
        ast(conta5);
        System.out.print("6:");
        ast(conta6);
        System.out.print("7:");
        ast(conta7);
        System.out.print("8:");
        ast(conta8);
        System.out.print("9:");
        ast(conta9);
        System.out.print("10:");
        ast(conta10);

    }

}
