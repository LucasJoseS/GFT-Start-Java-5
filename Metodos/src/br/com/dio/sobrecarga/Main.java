package br.com.dio.sobrecarga;

public class Main {
  public static void main(String[] args) {
    System.out.println("Area de quadrados e retangulos");
    System.out.println("2 x 2 = " + Quadrilatero.area(2d));
    System.out.println("3 x 3 = " + Quadrilatero.area(3d, 3d));

    System.out.println("Area do trapézio");
    System.out.println("2 x 5 x 3" + Quadrilatero.area(2d, 5d, 3d));
  }
}
