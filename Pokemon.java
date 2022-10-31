import java.util.Scanner;
import java.util.Random;

public class Pokemon {

    private String nombre;
    private String tipo;
    private String salud;
    private int HP;
    // Falta bolsita
    // Dentro de la bolsita un pokemón puede encontrar:
    // • 1 oranberry (suma 30 puntos al HP de un pokem ́on)
    // • 1 Full Heal (cura el estado de un pokem ́on envenenado, quemado o congelado
    // a normal)

    public Pokemon() {
        nombre = "Bulbasaur";
        tipo = "Planta";
        salud = "Normal";
        HP = 100;
    }

    public Pokemon(String nombre, String tipo, String salud, int HP) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.salud = salud;
        this.HP = HP;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getSalud() {
        return salud;
    }

    public int getHP() {
        return HP;
    }

    // public int getEnergia() {
    // return energia;
    // }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSalud(String salud) {
        this.salud = salud;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    // public void setEnergia(int z) {
    // energia = z;
    // }

    public String toString() {
        String mensaje = "El pokemon " + nombre + " de tipo " + tipo + " , su estado de salud es " + salud + " con "
                + HP + " de HP";
        return mensaje;
    }

    // void probabilidadEnfermarse(Pokemon p):

    // void comparaPokemones(Pokemon p):

    // void caerse(Pokemon p):

    public static void main(String[] args) {
        Scanner lector = new Scanner();
        Pokemon pokemon1 = new Pokemon();

        System.out.println("\nTu pokemon por omisión es: " + pokemon1.toString());
        System.out.println("¿Quieres cambiarlo?");
        System.out.println("Presiona 1 si deseas continuar con el pokemon");
        System.out.println("Presiona 2 si deseas cambiarlo");
        int s = lector.nextInt();
        if (s == 1) {

        } else {

        }

    }

}
