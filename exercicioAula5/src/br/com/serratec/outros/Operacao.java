package br.com.serratec.outros;

public class Operacao implements Livraria {
		private String tipo;
		private double valorOperacao;
		private Livro livro;

		public Operacao(String tipo, Livro livro) {
			this.tipo = tipo;
			this.livro = livro;
		}
		
		@Override
		public String toString() {
			return "Tipo:" + tipo + " " + "Valor:" + valorOperacao + " ";
		}

		public Livro getLivro() {
			return livro;
		}

		public void setLivro(Livro livro) {
			this.livro = livro;
		}

		public String getTipo() {
			return tipo;
		}

		public double getValorOperacao() {
			return valorOperacao;
		}

		@Override
		public void venderLivro() {
			valorOperacao = livro.getValor() *  1.09;
			
		}

		@Override
		public void emprestarLivro() {
			valorOperacao = livro.getValor() * 2 /100 + taxaEmprestimo;
		}


}
