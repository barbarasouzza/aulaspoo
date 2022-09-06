package br.org.serractec.teste;

import br.org.serractec.model.Assistente;
import br.org.serractec.model.Diretor;
import br.org.serractec.model.Gerente;

public class TesteEmpregado {

	public static void main(String[] args) {
		Assistente a = new Assistente("123", "Barbara", 2500., 100.0);
		Gerente g = new Gerente("234", "Maria", 4500., "Financeiro");
		Diretor d = new Diretor("321", "Ana", 9500., "CIO");
		
		a.aumentarSalario();
		g.aumentarSalario();
		d.aumentarSalario();
		
		System.out.println(a);
		System.out.println(g);
		System.out.println(d);
	}
}
