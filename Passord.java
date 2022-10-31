import java.util.Arrays;
import java.util.Random;

public class Passord {
    String secuencia;
    String seguridad;

    public Passord() {
        secuencia = "";
        seguridad = "";
    }

    public void Generar_Sec(int opc) {

        char[] mayus = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        char[] minus = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
                't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] numeros = { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
        char[] especiales = { '*', '#', '$', '&', '+', '?', '%' };
        char[] contraseña = new char[8];
        Random aletoria = new Random();
        int alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
        int aleminus = aletoria.nextInt(26); // Escoger la letra minúscula
        int alenum = aletoria.nextInt(9);
        int especial = aletoria.nextInt(7);

        switch (opc) {
            case 0: // Contraseña Básica
                int ale = aletoria.nextInt(3);
                switch (ale) {
                    case 0:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            // ----------------------------------------------------------------------
                            contraseña[0] = mayus[alemayus]; // Se gurada la posición de la mayúscula
                            contraseña[1] = minus[aleminus];
                            contraseña[5] = especiales[especial];
                            for (int k = 0; k < 1; k++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[2] = minus[aleminus];
                            }
                            for (int j = 0; j < 1; j++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[3] = minus[aleminus];
                            }
                            contraseña[4] = numeros[alenum];
                            for (int l = 0; l < 1; l++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[6] = minus[aleminus];
                            }
                            for (int m = 0; m < 1; m++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[7] = minus[aleminus];
                            }
                        }
                        break;
                    case 1:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            contraseña[0] = mayus[alemayus];
                            contraseña[5] = especiales[especial]; // Se gurada la posición de la mayúscula
                            contraseña[1] = minus[aleminus];
                            contraseña[7] = numeros[alenum];
                            for (int k = 0; k < 1; k++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[2] = minus[aleminus];
                            }
                            for (int j = 0; j < 1; j++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[3] = minus[aleminus];
                            }
                            for (int l = 0; l < 1; l++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[6] = minus[aleminus];
                            }
                            for (int m = 0; m < 1; m++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[4] = minus[aleminus];
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            contraseña[7] = mayus[alemayus]; // Se gurada la posición de la mayúscula
                            contraseña[1] = minus[aleminus];
                            contraseña[0] = numeros[alenum];
                            contraseña[5] = especiales[especial];
                            for (int n = 0; n < 1; n++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[4] = minus[aleminus];
                            }
                            for (int k = 0; k < 1; k++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[2] = minus[aleminus];
                            }
                            for (int j = 0; j < 1; j++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[3] = minus[aleminus];
                            }
                            for (int l = 0; l < 1; l++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[6] = minus[aleminus];
                            }
                        }
                        break;
                    default:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            contraseña[5] = mayus[alemayus]; // Se gurada la posición de la mayúscula
                            contraseña[1] = minus[aleminus];
                            contraseña[0] = numeros[alenum];
                            contraseña[3] = especiales[especial];
                            for (int p = 0; p < 1; p++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[2] = minus[aleminus];
                            }
                            for (int k = 0; k < 1; k++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[4] = minus[aleminus];
                            }
                            for (int l = 0; l < 1; l++) {
                                aleminus = aletoria.nextInt(9);
                                contraseña[6] = minus[aleminus];
                            }
                            for (int m = 0; m < 1; m++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[7] = minus[aleminus];
                            }
                        }
                }

                String password = new String(contraseña);
                secuencia = password;
                seguridad = "Baja";

                System.out.print("Contraseña: " + password + " | " + seguridad);

                break;
            case 1: // Contraseña Media
                int ale2 = aletoria.nextInt(3);
                switch (ale2) {
                    // En caso de que tenga un número y dos mayusculas
                    case 0:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            contraseña[0] = mayus[alemayus]; // Se gurada la posición de la mayúscula
                            contraseña[1] = minus[aleminus];
                            contraseña[4] = numeros[alenum];
                            contraseña[5] = especiales[especial];
                            for (int k = 0; k < 1; k++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[2] = minus[aleminus];
                            }
                            for (int j = 0; j < 1; j++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[3] = minus[aleminus];
                            }
                            for (int l = 0; l < 1; l++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[6] = minus[aleminus];
                            }
                            for (int m = 0; m < 1; m++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[7] = mayus[alemayus];
                            }
                        }
                        break;
                    // En caso de que tenga dos números y una mayuscula
                    case 1:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            contraseña[0] = mayus[alemayus];
                            contraseña[5] = especiales[especial]; // Se gurada la posición de la mayúscula
                            contraseña[1] = minus[aleminus];
                            contraseña[7] = numeros[alenum];
                            for (int k = 0; k < 1; k++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[2] = minus[aleminus];
                            }
                            for (int j = 0; j < 1; j++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[3] = minus[aleminus];
                            }
                            for (int l = 0; l < 1; l++) {
                                alenum = aletoria.nextInt(9);
                                contraseña[6] = numeros[alenum];
                            }
                            for (int m = 0; m < 1; m++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[4] = minus[aleminus];
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            contraseña[7] = mayus[alemayus]; // Se gurada la posición de la mayúscula
                            contraseña[1] = minus[aleminus];
                            contraseña[0] = numeros[alenum];
                            contraseña[5] = especiales[especial];
                            for (int k = 0; k < 1; k++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[2] = minus[aleminus];
                            }
                            for (int j = 0; j < 1; j++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[3] = minus[aleminus];
                            }
                            for (int h = 0; h < 1; h++) {
                                alemayus = aletoria.nextInt(26);
                                contraseña[4] = mayus[alemayus];
                            }
                            for (int l = 0; l < 1; l++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[6] = minus[aleminus];
                            }
                        }
                        break;
                    default:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            contraseña[5] = mayus[alemayus]; // Se gurada la posición de la mayúscula
                            contraseña[1] = minus[aleminus];
                            contraseña[0] = numeros[alenum];
                            contraseña[3] = especiales[especial];
                            for (int l = 0; l < 1; l++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[2] = minus[aleminus];
                            }
                            for (int k = 0; k < 1; k++) {
                                alenum = aletoria.nextInt(9);
                                contraseña[4] = numeros[alenum];
                            }
                            for (int l = 0; l < 1; l++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[6] = minus[aleminus];
                            }
                            for (int m = 0; m < 1; m++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[7] = minus[aleminus];
                            }
                        }
                }

                String password2 = new String(contraseña);
                secuencia = password2;
                seguridad = "Media";
                System.out.print("Contraseña: " + secuencia + " | " + seguridad);

                break;

            case 2: // Contraseña Alta
                int ale3 = aletoria.nextInt(3);
                switch (ale3) {
                    case 1:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            contraseña[0] = mayus[alemayus]; // Se gurada la posición de la mayúscula
                            contraseña[1] = minus[aleminus];
                            contraseña[4] = numeros[alenum];
                            contraseña[5] = especiales[especial];
                            for (int k = 0; k < 1; k++) {
                                alenum = aletoria.nextInt(9);
                                contraseña[2] = numeros[alenum];
                            }
                            for (int j = 0; j < 1; j++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[3] = minus[aleminus];
                            }
                            for (int l = 0; l < 1; l++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[6] = minus[aleminus];
                            }
                            for (int m = 0; m < 1; m++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[7] = mayus[alemayus];
                            }
                        }
                        break;
                    case 2:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            contraseña[0] = mayus[alemayus];
                            contraseña[1] = minus[aleminus];
                            contraseña[7] = numeros[alenum];
                            for (int k = 0; k < 1; k++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[5] = mayus[aleminus];
                            }
                            for (int k = 0; k < 1; k++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[2] = minus[aleminus];
                            }
                            for (int j = 0; j < 1; j++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[3] = minus[aleminus];
                            }
                            for (int l = 0; l < 1; l++) {
                                especial = aletoria.nextInt(6);
                                contraseña[6] = especiales[especial];
                            }
                            for (int m = 0; m < 1; m++) {
                                alenum = aletoria.nextInt(9);
                                contraseña[4] = numeros[alenum];
                            }
                        }
                        break;
                    case 3:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(28); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            contraseña[7] = mayus[alemayus]; // Se gurada la posición de la mayúscula
                            contraseña[1] = minus[aleminus];
                            contraseña[0] = numeros[alenum];
                            contraseña[5] = especiales[especial];
                            for (int k = 0; k < 1; k++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[2] = minus[aleminus];
                            }
                            for (int j = 0; j < 1; j++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[3] = minus[aleminus];
                            }
                            for (int l = 0; l < 1; l++) {
                                alemayus = aletoria.nextInt(26);
                                contraseña[6] = mayus[alemayus];
                            }
                            for (int l = 0; l < 1; l++) {
                                alenum = aletoria.nextInt(9);
                                contraseña[4] = numeros[alenum];
                            }
                        }
                        break;
                    default:
                        for (int i = 0; i < 1; i++) {
                            aleminus = aletoria.nextInt(26);
                            alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                            alenum = aletoria.nextInt(9);
                            especial = aletoria.nextInt(7);
                            contraseña[5] = mayus[alemayus]; // Se gurada la posición de la mayúscula
                            contraseña[1] = minus[aleminus];
                            contraseña[2] = especiales[especial];
                            for (int k = 0; k < 1; k++) {
                                alenum = aletoria.nextInt(9);
                                contraseña[4] = numeros[alenum];
                            }
                            for (int l = 0; l < 1; l++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[3] = minus[aleminus];
                            }
                            for (int l = 0; l < 1; l++) {
                                aleminus = aletoria.nextInt(26);
                                contraseña[6] = minus[aleminus];
                            }
                            for (int m = 0; m < 1; m++) {
                                alemayus = aletoria.nextInt(26);
                                contraseña[7] = mayus[alemayus];
                            }
                        }
                        break;
                }

                String password3 = new String(contraseña);
                secuencia = password3;
                seguridad = "Alta";
                System.out.print("Contraseña: " + secuencia + " | " + seguridad);

                break;
            default: // Contraseña Media
                for (int i = 0; i < 1; i++) {
                    aleminus = aletoria.nextInt(26);
                    alemayus = aletoria.nextInt(26); // Escoger la letra mayúscula
                    alenum = aletoria.nextInt(9);
                    especial = aletoria.nextInt(7);
                    contraseña[0] = mayus[alemayus];
                    contraseña[5] = especiales[especial]; // Se gurada la posición de la mayúscula
                    contraseña[1] = minus[aleminus];
                    contraseña[7] = numeros[alenum];
                    for (int k = 0; k < 1; k++) {
                        aleminus = aletoria.nextInt(26);
                        contraseña[2] = minus[aleminus];
                    }
                    for (int j = 0; j < 1; j++) {
                        alemayus = aletoria.nextInt(26);
                        contraseña[3] = mayus[alemayus];
                    }
                    for (int l = 0; l < 1; l++) {
                        alenum = aletoria.nextInt(9);
                        contraseña[6] = numeros[alenum];
                    }
                    for (int m = 0; m < 1; m++) {
                        aleminus = aletoria.nextInt(26);
                        contraseña[4] = minus[aleminus];
                    }
                }

                String password4 = new String(contraseña);
                secuencia = password4;
                seguridad = "Alta";
                System.out.print("Contraseña: " + secuencia + " | " + seguridad);
                break;
        }
    }

    public static void main(String[] args) {
        Passord contraseña = new Passord();
        Random azar = new Random();
        System.out.println("Contraseñas generadas: ");
        for (int i = 0; i < 10; i++) {
            int alet = azar.nextInt(4);
            System.out.print((i + 1) + " . ");
            contraseña.Generar_Sec(alet);
            System.out.print("\n");
        }
    }
}