package br.edu.senai.enums;

public enum Bebida {
	REFRIGERANTE("refrigerante", 6.80), 
	AGUA("Agua", 2.5), 
	SUCO("Suco de Laranja", 7.0), 
	CERVEJA("Cerveja", 8.);

	private String tipoBebida;
	private Double valor;

	private Bebida(String tipo, Double valor) {
		this.tipoBebida = tipo;
		this.valor = valor;
	}

	public String getTipo() {
		return tipoBebida;
	}

	public Double getValor() {
		return valor;
	}
	@Override
	public String toString() {
		return "Tipo: " + tipoBebida + " valor " +valor;
	}
}
