package br.org.serractec.model;

public class TotalizaTributos {
	private Double total = 0.0;

	public Double getTotal() {
		return total;
	}
	
	// Quem implementa uma interface também pode usar o polimorfismo
	public void totalGeralTributos(Tributacao t) {
		total += t.calcularICMS();
		total += t.calcularImpostoDeRenda();
		
	}
}
