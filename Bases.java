import java.util.Scanner;

public class Bases {
    //Mensaje de entrada
    public static void Mensaje(){
        String primer="bienvenidos a la calculadora de cambio de base";
        System.out.println("\n"+primer.toUpperCase());
        System.out.println("\nEscoge la opción la cuál deseas realizar:");
        System.out.println("1.- Realizar cambio de base de DECIMAL A BINARIO");
        System.out.println("2.- Realizar cambio de base de DECIMAL A OCTAL");
        System.out.println("3.- Realizar cambio de base de DECIMAL A HEXADECIMAL");
        System.out.println("4.- Realizar cambio de base de BINARIO A DECIMAL");
        System.out.println("5.- Realizar cambio de base de BINARIO A OCTAL");
        System.out.println("6.- Realizar cambio de base de BINARIO A HEXADECIMAL");
        System.out.println("7.- Realizar cambio de base de OCTAL A DECIMAL");
        System.out.println("8.- Realizar cambio de base de OCTAL A BINARIO");
        System.out.println("9.- Realizar cambio de base de OCTAL A HEXADECIMAL");
        System.out.println("10.- Realizar cambio de base de HEXADECIMAL A DECIMAL");
        System.out.println("11.- Realizar cambio de base de HEXADECIMAL A BINARIO");
        System.out.println("12.- Realizar cambio de base de HEXADECIMAL A OCTAL");
        System.out.println("\n");
    }

    //Métodos para Validación
    //----------------------------------------------------------------------------------------------
      //Validación de un Binario
    public static boolean ValidarBin(String a){

        for(int i=0; i<a.length();i++){
            char c = a.charAt(i);
            if(c!='1'&& c!='0'){
                return false;
            }
        }
        return true;
    }

    //Validación de un Octal
    public static boolean ValidarOctal(String a){
        for(int i=0; i<a.length();i++){
            char c = a.charAt(i);
            if(c == '8'|| c =='9'){
                return false;
            }
        }
        return true;
    }

    //Validación de un Hexadecimal
    public static boolean ValidarHexa(String a){
        boolean val=false;
        for(int i=0; i<a.length();i++){
            char c = a.charAt(i);
            if(c == '1'|| c =='2' || c == '3'|| c =='4' || 
            c == '5'|| c =='6' || c == '7'|| c =='8' ||
            c == '9'|| c =='A' || c == 'B'|| c =='C' ||
            c == 'D'|| c =='E' || c == 'F'){
            }
            return val=true;
        }
        return val;
    }

    //----------------------------------------------------------------------------------------------
    //Métodos para poder cambiar de base
    //Decimal a Binario
    public static String DecaBin(int a){
        String salida="";
        int divtemp=a;
        int residuo;
        int base=2;
        while(divtemp>0){
            residuo=divtemp%base;
            divtemp=divtemp/base;
            salida=residuo+salida;
        }
        return salida;
    }
    //Decimal a Octal
    public static String DecaOct(int a){
        String salida="";
        int divtemp=a;
        int residuo;
        int base=8;
        while(divtemp>0){
            residuo=divtemp%base;
            divtemp=divtemp/base;
            salida=residuo+salida;
        }
        return salida;
    }
    // Decimal a Hexadecimal
    public static String DecaHex(int a){
        String salida="";
        String charcterHex = "123456789ABCDEF";
        int divtemp=a;
        int residuo;
        int base=16;
        while(divtemp>0){
            residuo=divtemp%base;
            divtemp=divtemp/base;
            salida=charcterHex.charAt(residuo-1)+salida;
        }
        return salida;
    }
    //Binario a Decimal
    public static int BinaDec(String a){
        String representacionBinario=a;
		
		int representacionDecimal=0;
		int n = representacionBinario.length()-1;
		for(int i=0; i<representacionBinario.length(); i++) {
			char c = representacionBinario.charAt(i);

			int var = Integer.parseInt(String.valueOf(c));
			representacionDecimal += var*Math.pow(2, n);

			System.out.println(n);
			n--;
        }
        return representacionDecimal;  
    }

    //Octal a decimal

    public static int OctaDec(String a){
        String representacionOctal=a;
		
		int representacionDecimal=0;
		int n = representacionOctal.length()-1;
		for(int i=0; i<representacionOctal.length(); i++) {
			char c = representacionOctal.charAt(i);

			int var = Integer.parseInt(String.valueOf(c));
			representacionDecimal += var*Math.pow(8, n);

			System.out.println(n);
			n--;
        }
        return representacionDecimal;  
    }

    //Hexadecimal a Decimal

    public static int HexaDec(String a){
        String representacionHexa=a; 
        int base=16;

        int representacionDecimal = Integer.parseInt(representacionHexa,base);

        return representacionDecimal;  
    }

    //---------------------------------------------------------------------------------------------------------
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        Mensaje();
        int opc=lector.nextInt();
        switch(opc){
            case 1:
            System.out.println("Ingresa el valor en decimal: ");
            int dec1= lector.nextInt();
            System.out.println("Valor en binario: "+DecaBin(dec1));
            break;

            case 2:
            System.out.println("Ingresa el valor en decimal: ");
            dec1= lector.nextInt();
            System.out.println("Valor en octal: "+DecaOct(dec1));
            break;

            case 3:
            System.out.println("Ingresa el valor en decimal: ");
            dec1= lector.nextInt();
            System.out.println("Valor en hexadecimal: "+DecaHex(dec1));
            break;

            case 4:
            System.out.println("Ingresa el valor en binario: ");
            String binario1=lector.next();
            do{
                if(ValidarBin(binario1)==false){
                    System.out.println("Ingresa un valor válido");
                    binario1=lector.next();
                }else{System.out.println("Si es un valor válido");}
            }while(ValidarBin(binario1)==false);
            System.out.println("El número en decimal es: "+BinaDec(binario1));
            break;

            case 5:
            System.out.println("Ingresa el valor en binario: ");
            binario1=lector.next();
            do{
                if(ValidarBin(binario1)==false){
                    System.out.println("Ingresa un valor válido");
                    binario1=lector.next();
                }else{System.out.println("Si es un valor válido");}
            }while(ValidarBin(binario1)==false);
            System.out.println("Valor en octal: "+DecaOct(BinaDec(binario1)));
            break;

            case 6:
            System.out.println("Ingresa el valor en binario: ");
            binario1=lector.next();
            do{
                if(ValidarOctal(binario1)==false){
                    System.out.println("Ingresa un valor válido");
                    binario1=lector.next();
                }else{System.out.println("Si es un valor válido");}
            }while(ValidarOctal(binario1)==false);
            System.out.println("Valor en hexadecimal: "+DecaHex(BinaDec(binario1)));
            break;

            case 7:
            System.out.println("Ingresa el valor en octal: ");
            String octal1=lector.next();
            do{
                if(ValidarOctal(octal1)==false){
                    System.out.println("Ingresa un valor válido");
                    octal1=lector.next();
                }else{System.out.println("Si es un valor válido");}
            }while(ValidarOctal(octal1)==false);
            System.out.println("Valor en decimal: "+OctaDec(octal1));
            break;

            case 8:
            System.out.println("Ingresa el valor en octal: ");
            octal1=lector.next();
            do{
                if(ValidarOctal(octal1)==false){
                    System.out.println("Ingresa un valor válido");
                    octal1=lector.next();
                }else{System.out.println("Si es un valor válido");}
            }while(ValidarOctal(octal1)==false);
            System.out.println("Valor en binario: "+DecaBin(OctaDec(octal1)));
            break;

            case 9:
            System.out.println("Ingresa el valor en octal: ");
            octal1=lector.next();
            do{
                if(ValidarOctal(octal1)==false){
                    System.out.println("Ingresa un valor válido");
                    octal1=lector.next();
                }else{System.out.println("Si es un valor válido");}
            }while(ValidarOctal(octal1)==false);
            System.out.println("Valor en hexadecimal: "+DecaHex(OctaDec(octal1)));
            break;

            case 10:
            System.out.println("Ingresa el valor en hexadecimal: ");
            String hexa1=lector.next();
            do{
                if(ValidarHexa(hexa1)==false){
                    System.out.println("Ingresa un valor válido");
                    octal1=lector.next();
                }else{System.out.println("Si es un valor válido");}
            }while(ValidarHexa(hexa1)==false);
            System.out.println("Valor en decimal: "+HexaDec(hexa1));
            break;

            case 11:
            System.out.println("Ingresa el valor en hexadecimal: ");
            hexa1=lector.next();
            do{
                if(ValidarHexa(hexa1)==false){
                    System.out.println("Ingresa un valor válido");
                    hexa1=lector.next();
                }else{System.out.println("Si es un valor válido");}
            }while(ValidarHexa(hexa1)==false);
            System.out.println("Valor en binario: "+DecaBin(HexaDec(hexa1)));
            break;

            case 12:
            System.out.println("Ingresa el valor en hexadecimal: ");
            hexa1=lector.next();
            do{
                if(ValidarHexa(hexa1)==false){
                    System.out.println("Ingresa un valor válido");
                    octal1=lector.next();
                }else{System.out.println("Si es un valor válido");}
            }while(ValidarHexa(hexa1)==false);
            System.out.println("Valor en octal: "+DecaOct(HexaDec(hexa1)));
            break;

            default: 
            System.out.println("Ese valor no esta en las opciones. Escoge un valor dentro de las opciones");
        }

    }
}