package com.maycon.estruturadados.vetor.teste;

import com.maycon.estruturadados.vetor.Vetor;

public class Aula04 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(10);

		vetor.adiciona("Elemento1");
		vetor.adiciona("Elemento2");
		vetor.adiciona("Elemento3");
		System.out.println(vetor.tamanho());

	}

}
