package estruturasDeControle;

public class DoWhile {

	public static void main(String[] args) {
		// declarar uma variavel com um valor inicial para operar o loop
		int num =15;
		
		// construção do loop do/while
		do {
			//operação executada ao menos uma vez
			System.out.println("Valor de num é: "+num);
			num++;
		}while(num<=30);
		
		
	}
}
