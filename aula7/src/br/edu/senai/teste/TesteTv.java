package br.edu.senai.teste;

import br.edu.senai.enums.MarcaTv;
import br.edu.senai.model.TV;

public class TesteTv {
	
	public static void main(String[] args) {
		TV tv = new TV("SN/2343", 42., MarcaTv.PHILCO);
		
		System.out.println(tv);
	}

}
