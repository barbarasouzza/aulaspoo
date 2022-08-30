package br.org.serratec.diversos;

import java.time.LocalDate;

public class Exemplo2 {

	public static void main(String[] args) {
		// ALT + SHIFT + R - ALTERAR NOME DE VARIÁVEIS E MÉTODOS
		// CTRL + SHIFT + F - IDENTAÇÃO DO PROGRAMA
		int valor = 100;
		valor = 300;
		
		// CTROL + SHIFT + O - IMPORTAÇÃO DE PACOTE
		List Aluno;
		
		LocalDate data = LocalDate.now();
		
		System.out.println("Hoje é dia: " + data);
		System.out.println(valor);
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);

	}

}
