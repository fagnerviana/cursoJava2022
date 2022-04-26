package orientacaoObjeto;

public class Pessoa {
      // instanciar a classe Pessoa
		char genero;
		int idade;
		String nome;
		
		
		void setNome(String nome) {
			this.nome = nome;
		}
		
		@Override
		public String toString() {
			return "Pessoa [genero=" + genero + ", idade=" + idade + ", nome=" + nome + "]";
		}
		
		
		
				

}
