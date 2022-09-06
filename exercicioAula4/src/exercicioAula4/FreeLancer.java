package exercicioAula4;

public class FreeLancer extends Vendedor {

	private Integer diasTrabalhados;
	private Double valorDia;

	public FreeLancer(String nome, String cpf, Integer diasTrabalhados, Double valorDia) {
		super(nome, cpf);
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
	}

	public Integer getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public Double getValorDia() {
		return valorDia;
	}


}
