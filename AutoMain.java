import java.util.Scanner;

public class AutoMain {
    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        Scanner lector = new Scanner(System.in);
        System.out.println("Tu coches tiene las siguientes características ->\n\n" + automovil.toString());
        System.out.println("\n¿Quieres encender el coche?");
        System.out.println("Escribe true en MINÚSCULAS para dejarlo apagado");
        System.out.println("Escribe false en MINÚSCULAS para dejarlo apagado");
        boolean encendido = lector.nextBoolean();
        automovil.setEncenderAuto(encendido);

        while (automovil.getApagarAuto() == true) {
            System.out.println("El coche esta encendido " + automovil.getApagarAuto());
            if (automovil.setEncenderAuto(encendido) == true) {
                automovil.Mensaje();
                System.out.println("¿Qué deseas realizar?");
                int caso = lector.nextInt();
                switch (caso) {
                    case 1:// Llenar el tanque
                        automovil.getCantTanque();
                        if (automovil.getCantTanque() < automovil.getCapacidadTanque()) {
                            System.out.println("¿Cuánto dinero tienes para recargar?");
                            int caso4 = lector.nextInt();
                            automovil.cargarGasolina(caso4);
                        } else if (automovil.getCantTanque() == automovil.getCantTanque()) {
                            System.out.println("YA TIENES EL TANQUE LLENO\n");
                        }
                        break;
                    case 2: // Llenar totalmente el tanque
                        automovil.getCantTanque();
                        if (automovil.getCantTanque() < automovil.getCapacidadTanque()) {
                            System.out.println("¿Cuánto dinero tienes para recargar?");
                            int caso5 = lector.nextInt();
                            automovil.cargarGasolina(caso5);
                            System.out.println(
                                    "El auto esta totalmente recargado " + automovil.getCantTanque() + " litros");
                        } else if (automovil.getCantTanque() == automovil.getCantTanque()) {
                            System.out.println("YA TIENES EL TANQUE LLENO\n");
                        }
                        break;
                    case 3: // Avanzar n kilometros
                        System.out.println("¿Cuántos km deseas avanzar?");
                        int km = lector.nextInt();
                        automovil.Avanzar(km);
                        if (automovil.Avanzar(km) == false) {
                            automovil.setEncenderAuto(false);
                            System.out.println("\nSE NOS APAGO EL AUTO " + automovil.getApagarAuto()
                                    + "\nYA NO TENEMOS GASOLINA!!!!\nDEBEMOS RECARGAR EL TANQUE\n");
                            System.out.println("¿Tienes dinero?\nIngresa 1 si es así, 2 si no es así");
                            int caso2 = lector.nextInt();
                            if (caso2 == 1) {
                                System.out.println("Hay una gasolinera cerca, empujá el coche para poder llegar");
                                System.out.println("LLEGAMOS!\n¿Cuánto dinero tienes?");
                                int caso3 = lector.nextInt();
                                if (caso3 > 594) {
                                    automovil.cargarTodoElTanque(caso3);
                                } else if (caso3 == 594) {
                                    automovil.cargarTodoElTanque(caso3);
                                } else if (caso3 < 594) {
                                    automovil.cargarGasolina(caso3);
                                }
                            } else if (caso2 == 2) {
                                System.out.println(
                                        "Lo siento mi chavo te quedaste sin coche, esperaa a que una alma te de un rai");
                                automovil.setEncenderAuto(false);
                                System.out.println(automovil.getApagarAuto());
                                break;
                            }

                        }
                        break;
                    case 4: // Carreritas

                        break;

                }
            }
            System.out.println(automovil.getApagarAuto());
            // Para apagar el auto
            if (automovil.getApagarAuto() != true) {
                System.out.println("¿Quieres apagar el coche?");
                System.out.println(automovil.getApagarAuto());
                System.out.println("Escribe true en MINÚSCULAS para seguir manejando");
                System.out.println("Escribe false en MINÚSCULAS para apagar la máquina");
                encendido = lector.nextBoolean();
                automovil.setEncenderAuto(encendido);
                if (automovil.setEncenderAuto(encendido) == false) {
                    System.out.println("El coche esta apagado " + automovil.getApagarAuto());
                    System.out.println("¿Quieres encender el coche o salir?");
                    encendido = lector.nextBoolean();
                }
            }

        }
        System.out.println("El coche permanece apagado " + automovil.getApagarAuto());

    }
}
