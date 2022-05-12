package br.com.dio.calc;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int valueA, valueB;
		
		System.out.println("Digite o primeiro valor");
		valueA = scanner.nextInt();
		
		System.out.println("Digite o segundo valor");
		valueB = scanner.nextInt();
		
		int soma = soma(valueA, valueB);
		int sub  = subtracao(valueA, valueB);
		int mult = multiplicacao(valueA, valueB);
		double div = divisao(valueA, valueB);
		
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + sub);
		System.out.println("Multiplicação: " + mult);
		System.out.println("Divisão: " + div);

	}
	
	public static int soma(int valueA, int valueB) {
		return valueA + valueB;
	}
	
	public static int subtracao(int valueA, int valueB) {
		return valueA - valueB;
	}
	
	public static int multiplicacao(int valueA, int valueB) {
		return valueA * valueB;
	}
	
	public static double divisao(int valueA, int valueB) {
		return valueA / (double) valueB;
	}
	
	
	
	

}
