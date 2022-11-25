public class Bebidas {
    /*
     * @author Jimenez Sanchez Emma Alicia
     */

    // Atributos de la clase Bebidas
    private String nombre;
    private String tam;

    // Método Constructor por omisión
    public Bebidas() {
        nombre = "vació";
        tam = "vacío";
    }

    // Método cuando solo nos entregan el nombre de una bebida el tamaño va a ser
    // mediano por omision
    public Bebidas(String nombre) {
        this.nombre = nombre;
        this.tam = "M";
    }

    // Método get de la clase Bebida, donde se obtiene el nombre, tamaño y precio
    public String getNombre() {
        return nombre;
    }

    public String getTam() {
        return tam;
    }

}
