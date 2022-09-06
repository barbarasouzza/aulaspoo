package exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite seu nome: ");
		String telefone = JOptionPane.showInputDialog("Digite seu telefone: ");
		String email = JOptionPane.showInputDialog("Digite seu email: ");
		String salario = JOptionPane.showInputDialog("Digite seu salario: ");
		
		
		Double salario1 = Double.parseDouble(salario);
		
		
		JOptionPane.showMessageDialog(null, "\nNome: " + nome + "\nTelefone: " + telefone + 
				"\nEmail: " + email + "\nSalario R$ " +  salario + " " );
	        JOptionPane.showMessageDialog(null, "Salário + 10% " + salario1 + (salario1 * 0.01));
	}

}
