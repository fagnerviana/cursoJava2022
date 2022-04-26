package laboratorio;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Numero primo 
		int numero;
		
		System.out.println("Digite um numero, Veremos se ele é primo ");
		numero=scanner.nextInt();
		int cont=0;
		
		for (int i = 1; i<numero;i++) {
		   int result = (numero%i);
		   
		   if(result == 0) {
			   cont++;
		   }
		   if(cont<=2) {
			   System.out.println("Numero Primo ");
		   }else {
			   System.out.println("Não é Numero Primo ");
		   }
		}
	    
	}

}
