package carro;

public class Principal {

	public static void main(String[] args) {
// 3. Crie a mesma estrutura b�sica de um programa Java nessa classe (m�todo main(String [] args)) e, dentro desse m�todo, instancie um objeto do pr�prio
// tipo Garagem com o nome de �g�;
		
		Garagem g= new Garagem();
		g.setTipoCarro("Carro de Passeio");
		g.carroPasseio.setCor("Vermelho");
		g.carroPasseio.setCv(2.3);
		g.carroPasseio.setModelo("VM Jetta");
		
		System.out.println(g.getTipoCarro());
		System.out.println(g.carroPasseio);
		System.out.println("-----------------------------------------------------------------");
		
		
		g.setTipoCarro("Carro Utilitario");
		g.utilitario.setCor("Branco");
		g.utilitario.setCv(3.8);
		g.utilitario.setModelo("Renault Boxer");
		
		System.out.println(g.getTipoCarro());
		System.out.println(g.utilitario);
		

	}

}
