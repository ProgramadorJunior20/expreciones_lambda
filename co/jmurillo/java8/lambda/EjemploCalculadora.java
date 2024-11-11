package co.jmurillo.java8.lambda;

import co.jmurillo.java8.lambda.aritmetica.Aritmetica;
import co.jmurillo.java8.lambda.aritmetica.Calculadora;

public class EjemploCalculadora {
    public static void main(String[] args) {


        Aritmetica suma = Double::sum;
        Aritmetica resta = (a, b) -> a - b;

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10, 5, suma));
        System.out.println(cal.computar(10, 5, resta));
    }
}
