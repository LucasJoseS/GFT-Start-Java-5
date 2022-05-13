package br.com.dio.sobrecarga;

public class Quadrilatero {
  public static Double area(Double lados) { // Quadrado
    return lados * lados;
  }

  public static Double area(Double altura, Double base) { // retangulo
    return altura * base;
  }

  public static Double area(Double baseMenor, Double baseMaior, Double altura) { // Trapézio
    return (baseMenor + baseMaior) * altura / 2;
  }
}
