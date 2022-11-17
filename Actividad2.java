import java.util.Scanner;

public class Actividad2 {
    /*
     * Crea la clase Canci ́on.
     * Una canci ́on tiene:
     * • Int ́erprete (String)
     * • T ́ıtulo (String)
     * • Segundos de duraci ́on (int)
     * Imagina que tienes un ipod para almacenar a lo m ́as 15 canciones, o bien a
     * lo m ́as 1000 segundos de m ́usica.
     * Implementa los siguientes m ́etodos:
     * • Guardar canci ́on (siempre y cuando no haya 15 canciones ya o la nueva no
     * exceda los 1000 segundos del
     * dispositivo).
     * • Buscar canci ́on por t ́ıtulo o int ́erprete.
     * • Borrar canci ́on por t ́ıtulo.
     * • Ver todas las canciones en el iPod.
     * • Ordenar las canciones por duraci ́on.
     * • Borrar todo el iPod.
     */

    public static boolean Val() {
        Scanner lector = new Scanner(System.in);
        boolean honey;
        System.out.println("Quieres salir?");
        System.out.println("Ingresa 1 si así lo deseas");
        System.out.println("Ingresa 2 si deseas continuar");
        int b = lector.nextInt();
        if (b == 1) {
            honey = false;
        } else {
            honey = true;
        }
        return honey;
    }

    public static void Menu(int opc) {
        UsodeIpod ipod = new UsodeIpod();
        Scanner lector = new Scanner(System.in);
        boolean honey = true;
        switch (opc) {
            // Agregar cancion.
            case 1:
                ipod.imprimeIpod();
                break;
            case 2:
                Scanner entrada = new Scanner(System.in);
                System.out.println("Escribe el autor de la canción");
                String author = entrada.nextLine();
                System.out.println("Escribe el nombre de la canción");
                String name = entrada.nextLine();
                System.out.println("Escribe cuantos minutos dura tu canción");
                int time = entrada.nextInt();
                Cancion Song = new Cancion(author, name, time);
                ipod.guardarCancion(Song);
                break;
            case 3:
                ipod.borrarCancion();
                break;
            case 4:
                ipod.buscarCancion();
                break;
            case 5:
                ipod.Ordenar();
                break;
            case 6:
                ipod.borraTodo();
                break;

        }

    }

    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);
        boolean data = true;
        while (data != false) {
            System.out.println("Ingrea el número de opción que desees realizar:");
            System.out.println("1-> Ver todas las canciones");
            System.out.println("2-> Guardar una cancion ");
            System.out.println("3-> Borrar cancion ");
            System.out.println("4-> Buscar cancion por titulo o interprete");
            System.out.println("5-> Ordenar las canciones por duracion. ");
            System.out.println("6-> Borrar todo. ");
            System.out.println("7-> Salir ");
            int opc2 = lector.nextInt();
            if (opc2 == 7) {
                data = Val();
            } else {
                Menu(opc2);
            }
        }

    }

}

class UsodeIpod {

    Cancion[] canciones = new Cancion[15];
    int Numcancion = 0;
    int duracionmax = 0;

    // Hay problemas
    public void imprimeIpod() {
        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                System.out.println((i + 1) + "    " + this.canciones[i].toString());
            } else {
                System.out.println((i + 1) + "    | espacio vacío | ");
            }
        }
        System.out.println();
    }

    // Agregar una canción
    public void guardarCancion(Cancion p) {
        // Revisar aún espacio
        boolean sePuedeGuardar = false;
        int time = this.duracionmax + p.getTime();
        if (time < 1000) {
            sePuedeGuardar = true;
        } else if (this.Numcancion <= 15) {
            sePuedeGuardar = true;
        }
        if (sePuedeGuardar == true) {
            for (int i = 0; i < canciones.length; i++) {
                if (canciones[i] == null) {
                    this.canciones[i] = p;
                    System.out.println("Se ha agregado '" + p.getTitulo() + "'. ");
                    this.duracionmax = this.duracionmax + p.getTime();
                    Numcancion++;
                    break;
                }
            }

        } else {

            System.out.println("El ipod está llenó");
        }

    }

    public void borrarCancion() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el título del libro que quieres borrar");
        String titulo = entrada.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                String tituloActual = canciones[i].getTitulo();
                if (tituloActual.equals(titulo)) {
                    canciones[i] = null;
                    System.out.println("Canción encontrada y eliminada");
                    encontrado = true;
                    break;
                }
            }
        }

        if (encontrado == false) {
            System.out.println("La canción que intentas borrar no esta en el ipod");
        }

    }

    public void buscarCancion() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe el título de la canción que estás buscando");
        String name = entrada.nextLine();
        System.out.println("Escribe el autor de la canción que estás buscando");
        String author = entrada.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < canciones.length; i++) {
            if (canciones[i] != null) {
                String tituloActual = canciones[i].getTitulo();
                String authorAct = canciones[i].getName();
                if (tituloActual.equals(name) || authorAct.equals(author)) {
                    System.out.println("Canción encontrado");
                    canciones[i].toString();
                    encontrado = true;
                    break;
                }
            }
        }

        if (encontrado == false) {
            System.out.println("Ese libro no está en tu estante");
        }

    }

    public void borraTodo() {

        for (int i = 0; i < canciones.length; i++) {
            canciones[i] = null;
        }

        System.out.println("Se borraon todos los libros");

    }

    public void Ordenar() {

    }

}

class Cancion {
    private String interprete;
    private String titulo;
    private int duracion;

    public Cancion() {
    }

    public Cancion(String interprete, String nombre, int duracion) {
        this.interprete = interprete;
        this.titulo = nombre;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getName() {
        return interprete;
    }

    public int getTime() {
        return duracion;
    }

    public String toString() {
        String cad = "";
        cad = "Título: " + titulo + " de " + interprete + " de duración" + duracion;
        return cad;
    }
}
