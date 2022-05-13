package br.com.dio;

public class Saudacao {
  public static String saudacaoAdequada(int hora) {
    if (hora < 6) {
      return "Boa Madrugada";
    } else if (hora < 12) {
      return "Bom Dia";
    } else if (hora < 18) {
      return "Boa Tarde";
    }

    return "Boa Noite";
  }
}
