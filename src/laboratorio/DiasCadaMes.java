package laboratorio;

import java.util.Scanner;

public class DiasCadaMes {

	public static void main(String[] args) {
		// Laborat�rio 2 A � Verificando quantos dias tem cada m�s
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o m�s do Ano e retornarei quantos dias existem neste m�s");
		
		String mes= leitor.nextLine();
				
				switch (mes) {
				
				case "Janeiro" : System.out.println("O m�s de "+mes+" tem 31 dias"); 
				break;
				case "Fevereiro": System.out.println("O m�s de "+mes+ "tem 28 dias"); 
				break;
				case "mar�o": System.out.println("O m�s de "+mes+" tem 31 dias");
				break;
				case "Abril": System.out.println("O m�s de "+mes+" tem 30 dias");
				break;
				case "Maio": System.out.println("O m�s de "+mes+" tem 31 dias");
				break;
				case "Junho": System.out.println("O m�s de "+mes+" tem 30 dias");
				break;
				case "Julho": System.out.println("O m�s de "+mes+" tem 30 dias");
				break;
				case "Agosto": System.out.println("O m�s de "+mes+" tem 31 dias");
				break;
				case "Setembro": System.out.println("O m�s de "+mes+" tem 30 dias");
				break;
				case "Outubro": System.out.println("O m�s de "+mes+" tem 31 dias");
				break;
				case "Novembro": System.out.println("O m�s de "+mes+" tem 30 dias");
				break;
				case "Dezembro": System.out.println("O m�s de "+mes+" tem 31 dias");
				break;
				
				default : System.out.println("Favor digitar o nome completo do m�s" );
								
				}	

	    }

}
