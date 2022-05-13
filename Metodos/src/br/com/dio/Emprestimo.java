package br.com.dio;

public class Emprestimo {
  public static Double getTaxa(Integer numParcelas) {
    return 0.3 * numParcelas;
  }

  public static Double calcular(Double valor, Integer parcelas) {
    return valor * (1d + getTaxa(parcelas));
  }
}
