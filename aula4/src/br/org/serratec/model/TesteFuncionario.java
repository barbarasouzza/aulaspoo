package br.org.serratec.model;

import br.org.serratec.model.Gerente;

public class TesteFuncionario {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente("123", "Roberto", 5000., "Financeiro");
		System.out.println("Dados: " + gerente.getNome() + "\n" + gerente.getSalario());
		
	}

}
