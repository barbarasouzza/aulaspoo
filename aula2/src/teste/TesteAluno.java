package teste;

import model.Aluno;

public class TesteAluno {
	public static void main(String[] args) {
		System.out.println("-------------");
		// INSTANCIA DE UM OBJETO
		// CTROL + SHIFT + O - IMPORTAR
		//
		Aluno aluno1 = new Aluno();
		aluno1.matricula = 123;
		aluno1.nome = "Barbara"; 
		aluno1.email = "barbara@gmail.com";
		
		System.out.println(aluno1.matricula + "-" + aluno1.nome + "-" + aluno1.email);
		
		Aluno aluno2 = new Aluno();
//		Aluno aluno3 = new Aluno();
		
		if(aluno1 == aluno2) {
			System.out.println("Obejtos iguais");
		} else {
			System.out.println("Objetos diferentes");   
		}

	}

}
