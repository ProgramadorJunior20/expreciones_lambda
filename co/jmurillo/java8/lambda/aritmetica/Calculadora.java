package co.jmurillo.java8.lambda.aritmetica;

public class Calculadora {
    public  double computar(double a, double b, Aritmetica lambda){
        return lambda.operacion(a, b);
    };
}
