package teste;

import java.util.Scanner;

public class TesteEntradaDados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		System.out.println("Entre com um valor: ");
		a = sc.nextInt();

		System.out.println("Entre com um segundo valor: ");
		b = sc.nextInt();
		
		System.out.println("O resultado é: " + (a + b));
		
		sc.close();
	}

}
