package Operadores;

public class OperRelacionais {

	public static void main(String[] args) {
		//declarando e inicializando as variaveis
		
		int a = 20, b=30 ,c=1,d = 20;
		
		System.out.println("a = 20, b=30 ,c=1,d = 20;");
		System.out.println("A Maior do que B ?"+(b<a));
		System.out.println("A igual a D ? "+(a==d));
		System.out.println("C maior que b ?"+(c>b));
		System.out.println("A diferente de b ?"+(a!=b));
		System.out.println("A maior que D ?"+(a>d));
		System.out.println("A menor ou igual a D ?"+(a<=d));
		System.out.println("C maior ou iguak a B ?"+(c>=b));
		System.out.println("********************************************");
		System.out.println("********************************************");
		
		String nome="Fagner";
		int idade=36;
		char sexo ='M';
		
		boolean result = (idade>18 && sexo=='M');
		System.out.println("Maior que 18 ano e do sexo: Masculino ?");
		System.out.println(result);
		
		System.out.println("nome==\"Marcos\" ? ");
		boolean resultNome=(nome=="Marcos");
		System.out.println(resultNome);
		

	}

}

