package br.com.dio;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Investigacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List perguntas = Arrays.asList("Telefonou para a vítima?", "Esteve no local do crime?", "Mora perto da vítima?", "Devia para a vítima?", "Já trabalhou com a vítima?");
		Integer yesCounter = 0;
		
		System.out.println("Responsa apenas [Sim, Não]");
		for(int i = 0; i < 5; ++i) {
			System.out.println(perguntas.get(i));
			String resposta = scanner.next();
			
			if (resposta.contains("S")) {
				++yesCounter;
			}
		}
		
		String investigationSituation;
		switch (yesCounter) {
		case 2:
			investigationSituation = "Suspeita";
			break;
		case 3, 4:
			investigationSituation = "Cumplice";
			break;
		case 5:
			investigationSituation = "Assasina";
			break;
		default:
			investigationSituation = "Inocente";
		}
		
		System.out.println("Situação da investigação: " + investigationSituation);
	}

}
