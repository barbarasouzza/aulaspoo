package exercicios;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
	String numero = JOptionPane.showInputDialog("Entre com o número: ");
	
	Double numero1 = Double.parseDouble(numero);
	
	JOptionPane.showMessageDialog(null, numero1 + 1 );
	JOptionPane.showMessageDialog(null, numero1 - 1 );
	
	}
}
