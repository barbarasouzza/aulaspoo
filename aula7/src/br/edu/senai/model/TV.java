package br.edu.senai.model;

import br.edu.senai.enums.MarcaTv;

public class TV {
	private String modelo;
	private Double tamanho;
	private MarcaTv marca;
	
	public TV(String modelo, Double tamanho, MarcaTv marca) {
		super();
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "TV [modelo=" + modelo + ", tamanho=" + tamanho + "] " + marca;
	}
	public String getModelo() {
		return modelo;
	}
	public Double getTamanho() {
		return tamanho;
	}
	public MarcaTv getMarca() {
		return marca;
	}
	
	

}
