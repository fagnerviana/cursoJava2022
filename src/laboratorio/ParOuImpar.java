package laboratorio;

import java.util.Random;

public class ParOuImpar {

	public static void main(String[] args) {
		Random gerador= new Random();
		
		int valor;
		
		valor=gerador.nextInt();
		
		System.out.println("O valor gerador é "+valor);
		System.out.println( valor % 2 == 0 ? "Par" : "Impar");
		
	}

}
