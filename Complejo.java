/**
 * Complejo.java
 * Clase que ilustra la construcción de objetos de tipo Complejo
 * (en forma binómica). Se muestra cómo utilizar objetos Complejo dentro de la
 * misma clase que se est'a construyendo.
 * 
 * @author Rodrigo Alejandro Sánchez Morales.
 * @version Septiembre 2022.
 */
public class Complejo {

   // Atributos de clase.
   // Se debe asegurar encapsulación, por eso se usa private.
   private double a;
   private double b;

   /**
    * Constructor por omisión, se crea el Complejo: 1 + 3i
    */
   public Complejo() {
      a = 1;
      b = 3;
   }

   /**
    * Constructor por parámetros. Permite construir cualquier número Complejo en
    * forma binómica.
    * 
    * @param a La parte real del número Complejo
    * @param b La parte imaginaria del número Complejo
    */
   public Complejo(double a, double b) {
      this.a = a;
      this.b = b;
   }

   /**
    * Método que permite conocer el valor de la parte real del número Complejo
    * 
    * @return duble La parte real del número Complejo
    */
   public double getA() {
      return a;
   }

   /**
    * Método que permite conocer el valor de la parte imaginaria del número
    * Complejo
    * 
    * @return duble La parte imaginaria del número Complejo
    */
   public double getB() {
      return b;
   }

   /**
    * Método que permite modificar la parte real del número Complejo
    * 
    * @param double El nuevo valor de la parte real del número Complejo
    */
   public void setA(double a) {
      this.a = a;
   }

   /**
    * Método que permite modificar la parte imaginaria del número Complejo
    * 
    * @param double El nuevo valor de la parte imaginaria del número Complejo
    */
   public void setB(double b) {
      this.b = b;
   }

   /**
    * Método que permite efectuar la suma de Complejos en forma binómica
    * 
    * @param El segundo número Complejo para efectuar la operación
    * @return El resultado de la suma, en forma binómica.
    */
   public Complejo sumar(Complejo c) {
      double r, i;
      r = a + c.a;
      i = b + c.b;
      return new Complejo(r, i);
   }

   /**
    * Método que permite efectuar la resta de Complejos en forma binómica
    * 
    * @param El segundo número Complejo para efectuar la operación
    * @return El resultado de la resta, en forma binómica.
    */
   public Complejo restar(Complejo c) {
      double r, i;
      r = a - c.a;
      i = b - c.b;
      return new Complejo(r, i);
   }

   /**
    * Método que permite efectuar la multiplicación de Complejos en forma binómica
    * 
    * @param El segundo número Complejo para efectuar la operación
    * @return El resultado de la multiplicación, en forma binómica.
    */

   public Complejo multiplicar(Complejo c) {
      double r, i;
      r = a * c.a - b * c.b;
      i = a * c.b + b * c.a;
      return new Complejo(r, i);
   }

   /**
    * Método que permite efectuar la división de Complejos en forma binómica
    * 
    * @param El segundo número Complejo para efectuar la operación
    * @return El resultado de la división, en forma binómica.
    */
   public Complejo dividir(Complejo c) {
      double r, i;
      r = (a * c.a + b * c.b) / (Math.pow(c.a, 2) + Math.pow(c.b, 2));
      i = (b * c.a - a * c.b) / (Math.pow(c.a, 2) + Math.pow(c.b, 2));
      return new Complejo(r, i);
   }

   /**
    * Método que permite obtener el conjugado de un número Complejo en forma
    * binómica
    * 
    * @return El Complejo conjugado, en forma binómica.
    */
   public Complejo conjugado() {
      return new Complejo(a, -b);
   }

   /**
    * Método que permite determinar a partir del criterio de igualdad de Complejos
    * en forma binómica, si los dos números son iguales
    * 
    * @param El segundo número Complejo para efectuar la comparación
    * @return boolean true si son iguales, false en caso contrario
    */
   public boolean equals(Complejo c) {
      return a == c.a && b == c.b;
   }

   /**
    * Método que permite obtener un número Complejo en su forma binómica
    * 
    * @return El número Complejo con el formato a + bi
    */
   public String toString() {
      String cadena = "";
      if (b > 0)
         cadena += a + " + " + b + "i";
      if (b < 0)
         cadena += a + "" + b + "i";
      return cadena;
   }

   public static void main(String[] args) {
      Complejo z = new Complejo(); // 1 + 3i.
      Complejo c = new Complejo(10, 22); // 8 + 5i.

      System.out.println("\n-----------------ACCESO-----------------");

      System.out.println("El complejo 1 tiene:");
      double userRealZ1 = z.getA();
      double userImaginariaZ1 = z.getB();
      System.out.println("La parte real es: " + userRealZ1);
      System.out.println("La parte imaginaria es: " + userImaginariaZ1);

      System.out.println("El complejo 2 tiene:");
      double userRealZ2 = c.getA();
      double userImaginariaZ2 = c.getB();
      System.out.println("La parte real es: " + userRealZ2);
      System.out.println("La parte imaginaria es: " + userImaginariaZ2);

      System.out.println("\n-----------------MÉTODO SUMAR-----------------");

      Complejo respuesta = z.sumar(c);

      System.out.println("El complejo 2 tiene:");
      double userRealZ3 = respuesta.getA();
      double userImaginariaZ3 = respuesta.getB();
      System.out.println("La parte real es: " + userRealZ3);
      System.out.println("La parte imaginaria es: " + userImaginariaZ3);

      System.out.println("\n-----------------MÉTODO RESTAR-----------------");

      Complejo respuesta2 = z.restar(c);

      System.out.println("El complejo 3 tiene:");
      double userRealZ4 = respuesta2.getA();
      double userImaginariaZ4 = respuesta2.getB();
      System.out.println("La parte real es: " + userRealZ4);
      System.out.println("La parte imaginaria es: " + userImaginariaZ4);

      System.out.println("\n-----------------MÉTODO MULTIPLICAR-----------------");

      Complejo respuesta3 = z.multiplicar(c);

      System.out.println("El complejo 4 tiene:");
      double userRealZ5 = respuesta3.getA();
      double userImaginariaZ5 = respuesta3.getB();
      System.out.println("La parte real es: " + userRealZ5);
      System.out.println("La parte imaginaria es: " + userImaginariaZ5);

      System.out.println("\n-----------------MÉTODO DIVIDIR-----------------");

      Complejo respuesta4 = z.dividir(c);

      System.out.println("El complejo 5 tiene:");
      double userRealZ6 = respuesta4.getA();
      double userImaginariaZ6 = respuesta4.getB();
      System.out.println("La parte real es: " + userRealZ6);
      System.out.println("La parte imaginaria es: " + userImaginariaZ5);

      System.out.println("\n-----------------MÉTODO CONJUGADO-----------------");

      Complejo respuesta5 = c.conjugado();
      System.out.println("El complejo 6 tiene:");
      double userRealZ7 = respuesta5.getA();
      double userImaginariaZ7 = respuesta5.getB();
      System.out.println("La parte real es: " + userRealZ7);
      System.out.println("La parte imaginaria es: " + userImaginariaZ5);

      System.out.println("\n-----------------MÉTODO EQUALS-----------------");

      if (z.equals(c)) {
         System.out.println("¡Los complejos son iguales!");
      } else {
         System.out.println("¡Los complejos no son iguales!");
      }

      // if(z.equals(new Complejo())) {
      if (z.equals(new Complejo(1, 3))) {
         System.out.println("¡Los complejos son iguales!");
      } else {
         System.out.println("¡Los complejos no son iguales!");
      }

      System.out.println("\n-----------------MÉTODO TOSTRING-----------------");

      String miCadenaC = c.toString();
      String miCadenaZ = z.toString();
      System.out.println(miCadenaC);
      System.out.println(miCadenaZ);
      System.out.println(c.toString());
      System.out.println(z.toString());
   }

} // Fin Complejo
