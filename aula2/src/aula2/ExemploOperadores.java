package aula2;

public class ExemploOperadores {

	public static void main(String[] args) {
		//  UM ATLETA PODERA PARTICIPAR DE UMA MARATONA CASO...
		// ...A IDADE SEJA SUPERIOR OU ALTURA MAIOR A 1.80
		int idade = 19;
		double altura = 1.65;
		
		if(idade > 18 || altura >= 1.80) {
			System.out.println("Competirá");
		} else {
			System.out.println("Não competirá");
		}
		
		// TERNÁRIO
		String resposta = idade > 18 || altura >= 1.80 ? "Competirá":"Não competirá";
		System.out.println(resposta);
	}

}
