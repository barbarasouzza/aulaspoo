package br.org.serractec.model;
//Uma inteface não pode ter instâncias
//Não posso fazer conta - Conta conta = new Conta();
//É uma forma de substituir a herança em algumas coisas
//Toda inteface é criada para ter somente assinaturas
// Interface não tem implementações

public interface Conta {
	Double taxaBancaria = 2.50;
	
	//Não é necessário colocar o abstract porque fica implicito
	public Boolean saque(Double valor);
	
	public void deposito(double valor);
	















}
