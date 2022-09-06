package br.com.dio.aula03;

/**
 * Classe de exemplo para o exercício da Aula 3 de Variáveis, Tipos de Dado e Operadores aritméticos.
 */
public class Operadores {

    public static void main(String[] args) {

        System.out.println("PrePos");
        prePos();
        System.out.println("Aritmético");
        aritmetico();
        System.out.println("Atribuição");
        atribuicao();
        System.out.println("Precedência");
        precedencia();
        System.out.println("Casting");;
        casting();

    }

    private static void prePos() {

        int k = 10;

        int i = ++k;// 'k' se torna 11 e i recebe 'k'; PRIMEIRO 'K' SOMA E DEPOIS ATRIBUI A 'I'
        int j = k--;// 'j' vai receber 'k' (que é 11), mas depois 'k' volta a valer 10;
                                // PRIMEIRO ATRIBUI A 'J' E DEPOIS SUBTRAI
        int x = k;// 'x' recebe 'k' que vale 10;

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("x:" + x);

    }

    private static void aritmetico() {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        int r1 = a+b;
        int r2 = c-a;
        int r3 = d*b;
        int r4 = e/a;
        int r5 = c%b;

        System.out.println("a+b " + r1);
        System.out.println("c-a " + r2);
        System.out.println("d*b " + r3);
        System.out.println("e/a " + r4);
        System.out.println("c%b " + r5);

    }

    private static void atribuicao() {

        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 3.5f;
        double d = f;

        System.out.println("d:" + d);

        i += 5; // i = i + 5 -- 1505
        j -= 3; // j = j - 3 --
        d /= 2.7d; // d = d / 2.7d
        l *= 3; // l = l * 3
        k %= 2; // k = k % 2 -- o resto da divisão de 35/2 = 1;(17+17)+1

        System.out.println("i:" + i);
        System.out.println("j:" + j);
        System.out.println("d:" + d);
        System.out.println("l:" + l);
        System.out.println("k:" + k);

        i = k = j;

        System.out.println("k:" + k);
        System.out.println("i:" + i);

    }

    private static void precedencia() {

        int i = 10;
        int j = 20;
        int k = 30;

        int a = i++ + --j * k; // 10 + 19 * 30 -> 10 + 570 -> 580 (depois de concluído a ope. i = 11;

        System.out.println("i++ + --j * k: " + a);//580

        System.out.println("i: " + i); // 11

        int b = k / --i % 3 + 1; // 30 / 10 % 3 + 1 -> 1 (primeiro a divisão, depois resto de div, depois soma);
                                //30/10 = 3/3 = 0 + 1 =1;

        System.out.println("k / --i % 3 + 1: " + b);

        System.out.println("i: " + i); // 10

        int c = 2;

        c *= i += 5; // c = 2 * i; i = i + 5 --> c = 2 * i; i = 10 + 5; -ca-> c = 2 * 15; -> c = 2 * 15; c = 30
                    //em cálculos simples (*) > (+), mas em atribuição (+=) > (*=)

        System.out.println("c *= i += 5: " + c);

    }

    private static void casting (){

        byte b1;
        short s1 = 1000;
        b1 =(byte) s1;//downcast;

        long l1;
        int i1 = 10;
        l1 = i1;

        int i2;
        long l2 = 1000000000;
        i2 = (int) l2;

        double d1;
        float f1 = 10.5f;
        d1 = f1;


        int i3;
        float f2 = 11.497f;
        i3 = (int) f2; //truncado, perca de valor;


        System.out.println(b1);
        System.out.println(s1);
        System.out.println(l1);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(l2);
        System.out.println(d1);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(i3);



    }

}