public class Platillos {
    // Atributo de la clase platillos
    private String nombre;

    // Metódo por omisión
    public Platillos() {
        nombre = "vació";
    }

    // Metódo constructor con parametro del nombre
    public Platillos(String nombre) {
        this.nombre = nombre;
    }

    // Metodo get para obtener el nombre del platillo
    public String getNombre() {
        return nombre;
    }
}
