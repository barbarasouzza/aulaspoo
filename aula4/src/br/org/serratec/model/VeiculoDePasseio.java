package br.org.serratec.model;

public class VeiculoDePasseio extends Veiculo {
	private Integer quantidadeDePortas;

	public VeiculoDePasseio(String chassi, String placa, String cor, Double valor, Integer quantidadeDePortas) {
		super(chassi, placa, cor, valor);
		this.quantidadeDePortas = quantidadeDePortas;
	}

	public Integer getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	
	
	

}
