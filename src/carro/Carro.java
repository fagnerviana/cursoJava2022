package carro;
/*Crie uma classe chamada Carro dentro de um pacote denominado carro
 * Defina como atributos dessa classe: modelo, potência do motor e cor
 * */


public class Carro {
	
	//atributos
	private String modelo;
	private String cor;
	private double cv;
	
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	void setCor(String cor) {
		this.cor= cor;
	}
	void setCv(double cv) {
		this.cv=cv;
	}
	
	
	
	@Override
	public String toString() {
		return " Cor: " + cor 
				+"\n modelo: " + modelo +", "
				+"\n Potencia: " + cv ;
	}

	
	
	
	
}
