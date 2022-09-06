package exercicios;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		int valor;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o valor da Tabuada");
		valor = teclado.nextInt();
		
		for (int i = 0; i <= 10; i++) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
		}
	}
	

}
