package br.com.dio;

public class Main {
  public static void main(String[] args) {
    System.out.println("Calculadora:");
    System.out.println("1 + 2     = " + Calculadora.sum(1d, 2d));
    System.out.println("1.2 + 1.3 = " + Calculadora.sum(1.2d, 1.3d));
    System.out.println("9 + 2     = " + Calculadora.sum(9d, 2d));

    System.out.println("Saudações adequadas");
    System.out.println("9 hora" + Saudacao.saudacaoAdequada(9));
    System.out.println("13 hora" + Saudacao.saudacaoAdequada(13));
    System.out.println("19 hora" + Saudacao.saudacaoAdequada(19));
    System.out.println("3 hora" + Saudacao.saudacaoAdequada(3));

    System.out.println("Emprestimo");
    System.out.println("1000 -> 5 meses = " + Emprestimo.calcular(1000d, 5) + "( taxa " + Emprestimo.getTaxa(5) + ")");
    System.out.println("2000 -> 5 meses = " + Emprestimo.calcular(2000d, 5) + "( taxa " + Emprestimo.getTaxa(5) + ")");
    System.out
        .println("1000 -> 10 meses = " + Emprestimo.calcular(1000d, 10) + "( taxa " + Emprestimo.getTaxa(10) + ")");
    System.out
        .println("2000 -> 10 meses = " + Emprestimo.calcular(2000d, 10) + "( taxa " + Emprestimo.getTaxa(10) + ")");
  }
}
