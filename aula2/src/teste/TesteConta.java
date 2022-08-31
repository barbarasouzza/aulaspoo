package teste;

import model.Conta;

public class TesteConta {
	
	public static void main(String[] args) {
		
		Conta conta1 = new Conta();
		conta1.numeroConta = 1234;
		conta1.titular = "Barbara";
		conta1.saldo = 600;
		
		Conta conta2 = new Conta();
		conta2.numeroConta = 2345;
		conta2.titular = "Mariana";
		conta2.saldo = 300;
		
		conta1.deposito(500);
		conta2.deposito(200);
		
		if (conta1.saque(200)) {
			System.out.println("Saque efetuado com sucesso");
		} else {
			System.out.println("Não tem dinheiro");
		}
		
		System.out.println("Saldo atual: " + conta1.saldo);
		System.out.println("Saldo atual conta2: " + conta2.saldo);
		
	}

}
