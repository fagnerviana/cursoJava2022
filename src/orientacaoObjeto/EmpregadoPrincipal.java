package orientacaoObjeto;

public class EmpregadoPrincipal {

	public static void main(String[] args) {
		// Inicializando as classes
		Empregado funcionario = new Empregado();
		funcionario.pessoa.setNome("Fagner");
		funcionario.setEndereco("Cidade Nova");
		funcionario.setIdade(36);
		
		
		System.out.println(funcionario.mostrar());

	}

}
