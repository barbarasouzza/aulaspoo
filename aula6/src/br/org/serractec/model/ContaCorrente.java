package br.org.serractec.model;

public class ContaCorrente implements Conta {
	private String titular;
	private Double saldo;
	
		
	public ContaCorrente(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Titular: " + titular + "Saldo: " + saldo;
	}

	@Override
	public Boolean saque(Double valor) {
		if(saldo > valor) {
			saldo = saldo - valor - taxaBancaria;
			return true;
		} 
		return false;
	}

	@Override
	public void deposito(double valor) {
		if (valor > 0 && valor < 1000) {
			saldo += valor;
		}
		
	}

}
