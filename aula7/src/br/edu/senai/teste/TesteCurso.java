package br.edu.senai.teste;

import br.edu.senai.enums.PeriodoCurso;
import br.edu.senai.model.Curso;

public class TesteCurso {

	public static void main(String[] args) {
		Curso curso = new Curso("Java", PeriodoCurso.NOTURNO);

		System.out.println("Nome so curso: " + curso.getNome());
		System.out.println("Dia do curso: " + PeriodoCurso.INTEGRAL.getDiasDaSemana());

	}

}
