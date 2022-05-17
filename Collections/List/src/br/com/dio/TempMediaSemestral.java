package br.com.dio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TempMediaSemestral {

	public static void main(String[] args) {
		List nomesMeses = Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho");
		Scanner scanner = new Scanner(System.in);
		List tempMedia = new ArrayList();
		Double total = 0d;
		
		for (int  i = 0; i < 6; ++i) {
			System.out.println("Insira a temperatura média do mês de " + nomesMeses.get(i));
			tempMedia.add(scanner.nextDouble());
			total += (Double) tempMedia.get(i);
		}
		
		double mediaSemestral = total / 6;
		
		System.out.println("Temperaturas acima da média");
		for (int i = 0; i < 6; ++i) {
			Double temp = (Double) tempMedia.get(i);
			if (temp > mediaSemestral) {
				System.out.println(nomesMeses.get(i) + " -> " + temp);
			}
		}
		System.out.println("Média semestral: " + mediaSemestral);
	}

}
