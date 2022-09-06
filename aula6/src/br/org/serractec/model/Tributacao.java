package br.org.serractec.model;

public interface Tributacao extends Taxas, ImpostoDeRenda{
	public Double calcularICMS();

	Double calcularImpostoDeRenda();

}
