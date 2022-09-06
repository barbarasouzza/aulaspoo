package br.edu.senai.teste;

import java.util.Iterator;

import br.edu.senai.enums.EstadoCivil;
import br.edu.senai.model.Pessoa;
import br.edu.senai.model.Setor;

public class TestePessoa {
	
	public static void main(String[] args) {
		Setor setor1 = new Setor(456, "RH");
		Setor setor2 = new Setor(789, "DP");
		
		Pessoa pessoa1 = new Pessoa("Paulo", "98742515", EstadoCivil.CASADO, setor2);
		Pessoa pessoa2 = new Pessoa("Guilherme", "96587441", EstadoCivil.SOLTEIRO, setor1);
		
		System.out.println("Dados pessoais: " + pessoa1 + "Setor: " + pessoa1);
	
		for (EstadoCivil situacao : EstadoCivil.values()) {
			System.out.println(situacao);
		}
		
	}
}
