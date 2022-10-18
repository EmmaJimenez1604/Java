import java.util.Scanner;

public class Automovil {
    Scanner lector = new Scanner(System.in);
    private String compania;
    private String marca;
    private double capacidad_tanque;
    private double capacidad_tanque_act;
    private boolean encendido;

    public Automovil() {
        compania = "Honda";
        marca = "Suzuki";
        capacidad_tanque = 30.00;
        capacidad_tanque_act = 30.00;
        encendido = false;
    }

    public Automovil(String compania, String marca, double capacidad_tanque, double capacidad_tanque_act,
            boolean encendido) {
        this.compania = compania;
        this.marca = marca;
        this.capacidad_tanque = capacidad_tanque;
        this.capacidad_tanque_act = capacidad_tanque_act;
        this.encendido = encendido;
    }

    public void Mensaje() {
        System.out.println("TU COCHE ESTA ENCENDIDO\n\nEscoje que deseas realizar :");
        System.out.println("1. Llenar el tanque de gasolina");
        System.out.println("2. Llenar TODO el tanque de gasolina");
        System.out.println("3. Avanzar cierta cantidad de kilometros");
        System.out.println("4. Jugar a las carreritas");
    }

    public boolean setEncenderAuto(boolean encendido) {
        this.encendido = encendido;
        return encendido;
    }

    public boolean getApagarAuto() {
        return encendido;
    }

    public double getCantTanque() {
        double redonA = Math.round(capacidad_tanque_act * 100.00) / 100.00;
        return redonA;
    }

    public double getCapacidadTanque() {
        return capacidad_tanque;
    }

    public boolean Avanzar(int km) {
        int recorrido = km;
        System.out.println("Capacidad del tanque actual:" + capacidad_tanque_act);
        double gas_base = 0.3;
        int km_actual = 0;
        boolean lleno = true;
        boolean enc = true;

        while (lleno) {
            km_actual += 1;
            capacidad_tanque_act = capacidad_tanque_act - 0.3;
            System.out.println("Kilometro actual: " + km_actual + "->" + recorrido);
            System.out.println(
                    "Capacidad del tanque de gas actualmente:" + Math.round(capacidad_tanque_act * 100.0) / 100.0);

            if (capacidad_tanque_act < 2) {
                lleno = false;
                enc = false;
                System.out.println("Nos quedamos en el kilimetro " + km_actual + " de " + recorrido);
                break;
            } else if (km_actual == recorrido) {
                lleno = false;
                enc = true;
                System.out.println("Llegamos al kilimetro " + km_actual + " de " + recorrido);
                break;
            }
        }
        ;

        return enc;

    }

    public void cargarGasolina(double dinero) {
        double result = capacidad_tanque * dinero;

        System.out.println("Por culpa de la inflación la gasolina esta en $19.8");
        if (dinero >= result) {
            System.out.print("No nos mientas, sabemos que no tienes esa cantidad de dinero");
        } else if (dinero < result) {
            System.out.println("Podemos recargar una parte del tanque");
            capacidad_tanque_act = (dinero / 19.8);
            System.out.println(
                    "El tanque se llenó con " + Math.round(capacidad_tanque_act * 100.00) / 100.00
                            + " litros de gasolina");
            double result2 = capacidad_tanque - capacidad_tanque_act;
            System.out.println("Nos faltó " + Math.round(result2 * 100.00) / 100.00 + " para que se llenará el tanque");
        }
    }

    public double cargarTodoElTanque(double dinero) {
        double result = capacidad_tanque * dinero;
        double dinerorest = 0;
        if (dinero < result) {
            dinerorest = dinero - result;
            capacidad_tanque_act = capacidad_tanque;
        } else if (dinero >= result) {
            System.out.println("No nos mientas, sabemos que no tienes esa cantidad de dinero");
        }

        return dinerorest;
    }

    public String toString() {
        String torrino = "";
        torrino = "Mi auto es de la marca: " + marca + "\nDe la compañía: " + compania
                + "\nCon una capacidad de tanque hasta " + capacidad_tanque +
                " litros,\nActualmente tiene " + capacidad_tanque
                + "\nSi esta en false esta APAGADO, si esta en true esta ENCENDIDO: " + encendido;
        return torrino;
    }

    // public void carreritas(Automovil a1, Automovil a2){

    // }

}
