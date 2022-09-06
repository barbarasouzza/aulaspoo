package exercicios;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		String nome = new String("Maria");
		double peso = 60.00;
		float altura = 1.78f;
		
		String nome2 = new String("Felipe");
		double peso2 = 85.00;
		float altura2 = 1.70f;
		
		String nome3 = new String("João");
		double peso3 = 70.00;
		float altura3 = 1.69f;
		
		String nome4 = new String("Renata");
		double peso4 = 50.00;
		float altura4 = 1.75f;
		
		if(peso > peso2 && peso > peso3 && peso > peso4) {
			System.out.println("A pessoa com maior peso: " + nome);
		} else if(peso2 > peso && peso2 > peso3 && peso2 > peso4) {
			System.out.println("A pessoa com maior peso: " + nome2);
		} else if(peso3 > peso && peso3 > peso2 && peso3 > peso4) {
			System.out.println("A pessoa com maior peso: " + nome3);
		} else if(peso4 > peso && peso4 > peso3 && peso4 > peso2) {
			System.out.println("A pessoa com maior peso: " + nome4);
		}
		
		if(altura > altura2 && altura > altura3 && altura > altura4) {
			System.out.println("A pessoa com maior altura: " + nome);
		} else if(altura2 > altura && altura2 > altura3 && altura2 > altura4) {
			System.out.println("A pessoa com maior altura: " + nome2);
		} else if(altura3 > altura && altura3 > altura2 && altura3 > altura4) {
			System.out.println("A pessoa com maior altura: " + nome3);
		} else if(altura4 > altura && altura4 > altura3 && altura4 > altura2) {
			System.out.println("A pessoa com maior altura: " + nome4);
		}
		
		double media = (peso + peso2 + peso3 + peso4) / 4;
		System.out.println(media);
		
		float media2 = (altura + altura2 + altura3 + altura4) / 4;
		System.out.println(media2);
		
	}

}
