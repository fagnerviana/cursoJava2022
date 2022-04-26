package orientacaoObjeto;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa joaoPessoa = new Pessoa();
		Pessoa mariaPessoa = new Pessoa();
		
		
		joaoPessoa.genero= 'M';
		joaoPessoa.idade= 44;
		
		mariaPessoa.nome="Maria";
		mariaPessoa.genero='F';
		mariaPessoa.idade=35;
		
		System.out.println(joaoPessoa);
		System.out.println(mariaPessoa);
		
		// recebendo atribuição de outras classe
		 joaoPessoa=mariaPessoa;
		 		 
		 System.out.println("Recebendo os atributos de Maria "+joaoPessoa);	
		 

	}

}
