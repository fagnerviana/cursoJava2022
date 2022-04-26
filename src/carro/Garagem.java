package carro;



public class Garagem {
	//No mesmo pacote da classe Carro, crie uma classe denominada Garagem;
	//Crie dois atributos do tipo Carro nessa classe e nomeie-os de carroPasseio e carroUtilitario;
	//private String carroPasseio;
	//private String carroUtilitario;
	
	Carro carroPasseio = new Carro();
	Carro utilitario = new Carro();
	private String tipoCarro;
	
	void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}


	public String getTipoCarro() {
		return tipoCarro;
	}

	
	

}
