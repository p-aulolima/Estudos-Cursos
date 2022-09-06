package Exercicios1;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício da Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("Execícios da Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(23);


        //Emprétimo
        System.out.println("----Exercícios de Empréstimo-----");
        Emprestimo.calcuar(1000, Emprestimo.getDuasParcelas());//passando método como parâmetro.
        Emprestimo.calcuar(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcuar(1000, 5);



    }




}
