package br.org.serractec.teste;

import br.org.serractec.model.Empresa;
import br.org.serractec.model.Pessoa;
import br.org.serractec.model.TotalizaTributos;

public class TesteTributos {
	
	public static void main(String[] args) {
		Empresa e = new Empresa("ABC", 259000.);
		Pessoa p = new Pessoa("Marcos", 82000.);
		TotalizaTributos t = new TotalizaTributos();
		
		System.out.println(e + "Tributos à pagar: ICMS " 
							+ e.calcularICMS() + "IR: " + e.calcularImpostoDeRenda());
		System.out.println(p + "Tributos à pagar: IR " + p.calcularImpostoDeRenda());
		
		t.totalGeralTributos(e);
		t.totalGeralTributos(p);
		
		System.out.println("Totalização dos tributos: " + t.getTotal());
	}

}
