package br.org.serractec.teste;

import br.org.serractec.model.ContaCorrente;

public class TesteConta {
	
	public static void main(String[] args) {
		ContaCorrente cc =  new ContaCorrente("Barbara", 14500.);
		
		cc.deposito(1000.);
		cc.saque(500.);
		
		System.out.println("Seu saldo é: " + cc.toString());
	
	}

}
