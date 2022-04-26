package cap5lab1;

/*1.Crie um pacote chamado cap5lab1
 *2.Dentro do pacote, crie uma classe chamada Funcionario
 *3. Defina os atributos nome, sobrenome, cargo e salario na classe
 *4. Salve a classe.
*/


public class Funcionario {
	private String nome;
	private String sobrenome;
	private String cargo;
	private double salario;
	
	void setNome(String nome) {
		this.nome=nome;
	}	
	void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}	
	void setCargo(String cargo) {
		this.cargo=cargo;
	}	
	void setSalario(double salario) {
		this.salario=salario;
	}	

	@Override
	public String toString() {
		return "Nome= " + nome + ","
				+ "\nSobrenome= " + sobrenome + ","
				+ "\nCargo= " + cargo + ","
				+ "\nSalário= " + salario
				+"";
	}
	
	

}
