package orientacaoObjeto;

public class Empregado {
	
	//declarar duas variaveis
	private String enderecoString;
	private int idade;
	Pessoa pessoa = new Pessoa();
	
	//inicializar as variaveis
	void setEndereco(String endereco) {
		this.enderecoString=endereco;
	}
	
	void setIdade(int idade) {
		this.idade=idade;
	}
	
	void setNome(String nome) {
		this.pessoa.nome=nome;
	}
	
	//Criar uma fun��o para exibir os valores das variaveis
	String mostrar() {
		return("Endere�o: "+enderecoString+"\n Idade: " + idade+"\n Nome Funcioario: " + pessoa.nome);
	}

}
