package Exercicios2;

public class CalculoTriangulo {

    public static double area(double lado){

        return lado * lado;
        //System.out.println("A área do quadrado é: " + lado * lado);

    }

    public static double area(double lado1, double lado2){

        return lado1 * lado2;
        // System.out.println("A área do retângulo é: " + lado1 * lado2);

    }

    public static double area(double baseMaior, double baseMenor, double altura){

        return ((baseMaior+baseMenor)*altura)/2;
        //System.out.println("A área do trapézio é: " + ((baseMaior+baseMenor)*altura)/2);

    }
}
