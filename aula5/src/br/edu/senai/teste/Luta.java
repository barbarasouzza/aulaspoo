package br.edu.senai.teste;

import br.edu.senai.model.Lutador;

public class Luta {
	private Lutador desafiante;
	private Lutador desafiado;
	private Boolean confirmacao = false;

	public Luta(Lutador desafiante, Lutador desafiado, Boolean confirmacao) {
		super();
		this.desafiante = desafiante;
		this.desafiado = desafiado;
		this.confirmacao = confirmacao;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public Boolean getConfirmacao() {
		return confirmacao;
	}

	public Boolean confirmacaoLuta() {
		// Para lutar ser confirmada é necessária checar se o
		// desafiante é diferente do desafiado e também se as categorias
		// são iguais

		if (!desafiante.equals(desafiado) && desafiante.getCategoria().equals(desafiado.getCategoria())) {
			return true;
		}
		return false;
	}

}
