package laboratorio;

import java.util.Random;

public class ParOuImpar {

	public static void main(String[] args) {
		Random gerador= new Random();
		
		int valor;
		
		valor=gerador.nextInt();
		
		if(valor%2 == 0) {
			System.out.println("O n�mero grado foi "+valor);
			System.out.println("O numero � Par");
			
		}
		else {
			System.out.println("O n�mero grado foi "+valor);
			System.out.println("O n�mero � Impar");
		}
	
	}

}
