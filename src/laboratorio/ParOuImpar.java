package laboratorio;

import java.util.Random;

public class ParOuImpar {

	public static void main(String[] args) {
		Random gerador= new Random();
		
		int valor;
		
		valor=gerador.nextInt();
		
		if(valor%2 == 0) {
			System.out.println("O número grado foi "+valor);
			System.out.println("O numero é Par");
			
		}
		else {
			System.out.println("O número grado foi "+valor);
			System.out.println("O número é Impar");
		}
	
	}

}
