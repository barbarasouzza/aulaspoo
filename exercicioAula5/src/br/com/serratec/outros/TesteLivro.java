package br.com.serratec.outros;

public class TesteLivro {

	public static void main(String[] args) {

		Livro livro1 = new Livro("Marco Antonio", "Cisco CCNA", 85);
		Livro livro2 = new Livro("Kathy Sierra", "Use a cabeça Java", 98);

		Operacao operacao1 = new Operacao("venda", livro1);
		Operacao operacao2 = new Operacao("empréstimo", livro2);

		livro1.reajuste(6);
		operacao1.venderLivro();
		operacao2.emprestarLivro();

		System.out.println(operacao1.toString() + livro1.toString());
		System.out.println(operacao2.toString() + livro2.toString());

	}

}
