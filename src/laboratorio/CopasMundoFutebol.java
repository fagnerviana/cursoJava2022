package laboratorio;

public class CopasMundoFutebol {

	public static void main(String[] args) {
		// Laboratório 3 A - Exibindo os anos de ocorrência de todas as copas do mundo de futebol
		
		int ano=2022;
		
		for (int i=1930;i<ano;i+=4) {
			if((i<1942)||(i>1946)) {
				System.out.println("Copas do mundo de "+i+"!");
			}		
		}
	}
}
