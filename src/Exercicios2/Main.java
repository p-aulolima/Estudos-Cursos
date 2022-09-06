package Exercicios2;

public class Main {

    public static void main(String[] args) {
        System.out.println("########");
        //CalculoTriangulo.area(3);
        System.out.println("A área do quadrado é: " + CalculoTriangulo.area(3));

        double areaTriangulo = CalculoTriangulo.area(5,6);
        System.out.println("A área do Triângulo é: "+ areaTriangulo);

        //CalculoTriangulo.area(7,6,4);
        System.out.println("A área do bagulh lá é: " + CalculoTriangulo.area(7,6,4));


    }
}
