package exercicioAula4;

public class Fixo extends Vendedor {
	private Double salarioBase;
	private Double venda;
	private Double salarioBruto;

	public Fixo(String nome, String cpf, Double salarioBase) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public Double getVenda() {
		return venda;
	}

	public void setVenda(Double venda) {
		this.venda = venda;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void calcularSalario() {
		salarioBruto = salarioBase + venda * 0.10;
	}

}
