package br.edu.senai.model;

public class PolicialFedereal extends Policial {
	private final String lotacao;

	public PolicialFedereal(String nome, String matricula, String lotacao) {
		super(nome, matricula);
		this.lotacao = lotacao;		
	}

	public String getLotacao() {
		return lotacao;
	}
	
}
