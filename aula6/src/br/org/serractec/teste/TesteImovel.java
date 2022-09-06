package br.org.serractec.teste;

import br.org.serractec.model.Casa;
import br.org.serractec.model.Imovel;
import br.org.serractec.model.Proprietario;

public class TesteImovel {
	
	public static void main(String[] args) {
		Proprietario proprietario1 = new Proprietario("Roni");
		Proprietario proprietario2 = new Proprietario("Barbara");
		Casa casa1 = new Casa("Centro ", 409500.0, true);
		Casa casa2 = new Casa("Centro ", 506000.0, false);
		
		casa1.setProprietario(proprietario1);
		casa2.setProprietario(proprietario2);
	
		System.out.println("Dados do Imovel: " + casa1 + casa1.getProprietario().getNome());
		System.out.println("Dados do imovel" + casa2 + casa2.getProprietario().getNome());
				
	
	}
	
	
}
