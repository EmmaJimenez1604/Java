
public class Complejos {

    private double real;
    private double imagine;

    public Complejos() {
        real = 1;
        imagine = 2;
    }

    public Complejos(double real, double imagine) {
        this.real = real;
        this.imagine = imagine;
    }

    public double getReal() {
        return real;
    }

    public double getImagine() {
        return imagine;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImagine(double imagine) {
        this.imagine = imagine;
    }

    public Complejos sumar(Complejos c1, Complejos c2) {
        double r, i, q, w;
        double resultado_real, resultado_imaginario;
        r = c1.real;
        i = c1.imagine;
        q = c2.real;
        w = c2.imagine;
        resultado_real = r + q;
        resultado_imaginario = i + w;
        return new Complejos(resultado_real, resultado_imaginario);
    }

    public Complejos restar(Complejos c1, Complejos c2) {
        double r, i, q, w;
        double resultado_real, resultado_imaginario;
        r = c1.real;
        i = c1.imagine;
        q = c2.real;
        w = c2.imagine;
        resultado_real = r - q;
        resultado_imaginario = i - w;
        return new Complejos(resultado_real, resultado_imaginario);
    }

    public Complejos multiplicar(Complejos c1, Complejos c2) {
        double r, i, q, w;
        double resultado_real, resultado_imaginario;
        r = c1.real;
        i = c1.imagine;
        q = c2.real;
        w = c2.imagine;

        resultado_real = (c1.real * c2.real) - (c1.imagine * c2.imagine);
        resultado_imaginario = (c1.real * c2.imagine) + (c1.imagine * c2.real);
        return new Complejos(resultado_real, resultado_imaginario);
    }

    public Complejos dividir(Complejos c1, Complejos c2) {
        double r, i, q, w;
        double resultado_real, resultado_imaginario;
        r = c1.real;
        i = c2.imagine;
        q = c2.real;
        w = c2.imagine;
        resultado_real = (c1.real * c2.real + c1.imagine * c2.imagine)
                / (Math.pow(c2.real, 2) + Math.pow(c2.imagine, 2));
        resultado_imaginario = (c1.real * c2.real - c1.real * c2.imagine)
                / (Math.pow(c2.real, 2) + Math.pow(c2.imagine, 2));
        return new Complejos(resultado_real, resultado_imaginario);
    }

    public String toString() {
        String cadena = "";
        if (imagine > 0)
            cadena += real + " + " + imagine + "i";
        if (imagine < 0)
            cadena += real + "" + imagine + "i";
        return cadena;
    }

    public static void main(String[] args) {
        Complejos num1 = new Complejos();
        Complejos num2 = new Complejos(10, 22);

        // Método de Acceso
        System.out.println("\nAquí se muestra la información de los números complejos generados -->");
        System.out.println("El primer número complejo: " + num1);
        System.out.println("Parte real : " + num1.getReal());
        System.out.println("Parte imaganaria : " + num1.getImagine());
        System.out.println("\n");
        System.out.println("El segundo número complejo: " + num2);
        System.out.println("Parte real : " + num2.getReal());
        System.out.println("Parte imaganaria : " + num2.getImagine());
        System.out.println("\n");

        System.out.println("\n-----------------MÉTODO SUMAR-----------------");

        Complejos resultado = num1.sumar(num1, num2);

        System.out.println("El complejo resultado tiene:");
        double real = resultado.getReal();
        double imaginario = resultado.getImagine();
        System.out.println("La parte real es: " + real);
        System.out.println("La parte imaginaria es: " + imaginario);

        System.out.println("\n-----------------MÉTODO RESTAR-----------------");

        Complejos resultado2 = num1.restar(num1, num2);

        System.out.println("El complejo resultado tiene:");
        double real2 = resultado2.getReal();
        double imaginario2 = resultado2.getImagine();
        System.out.println("La parte real es: " + real2);
        System.out.println("La parte imaginaria es: " + imaginario2);

        System.out.println("\n-----------------MÉTODO MULTIPLICAR-----------------");

        Complejos resultado3 = num1.multiplicar(num1, num2);

        System.out.println("El complejo resultado tiene:");
        double real3 = resultado3.getReal();
        double imaginario3 = resultado3.getImagine();
        System.out.println("La parte real es: " + real3);
        System.out.println("La parte imaginaria es: " + imaginario3);

        System.out.println("\n-----------------MÉTODO DIVIDIR-----------------");

        Complejos resultado4 = num1.dividir(num1, num2);

        System.out.println("El complejo resultado tiene:");
        double real4 = resultado4.getReal();
        double imaginario4 = resultado4.getImagine();
        System.out.println("La parte real es: " + real4);
        System.out.println("La parte imaginaria es: " + imaginario4);

    }
}
