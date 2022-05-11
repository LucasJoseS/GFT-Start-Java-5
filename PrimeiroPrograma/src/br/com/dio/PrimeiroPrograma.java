package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		Gato gato = new Gato("Josué", "Café", 2);
		
		System.out.println("O meu gato se chama: " + gato.getName());
		System.out.println("Ele é da cor: " + gato.getCor());
		System.out.println("Possui " + gato.getCor() + " anos");
	}

}
