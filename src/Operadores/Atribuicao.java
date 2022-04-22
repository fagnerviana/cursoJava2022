package Operadores;

public class Atribuicao {
	//criando o método principal
	public static void main(String[] args) {
		//declaração de variavel
		
		String endereco;
		String umEndereçoString = endereco = "Endereço Principal";
		long r;
		int a,b,c,d,e,f;
		a=b=c=d=e=f=45;
		
		r=a;
		System.out.println(umEndereçoString);
		System.out.println(r);
		
		//Operador e descrição
		// '+=' '-=' '*=' '/=' '%='
		a=3;
		b=3;
		c=3;
		d=3;
		e=4;
		int g=a+b;
		System.out.println("Utilizando a=3 \"a+=1\"= "+(a+=1));		
		System.out.println("Utilizando b=3 \"b++\"= "+(b++));
		System.out.println("Utilizando c=3 \"c-=1\"= "+(c-=1));
		System.out.println("Utilizando d=3 \"d*=1\"= "+(d*=2));
		System.out.println("Utilizando e=4 \"e/=1\"= "+(e/=2));
		System.out.println("Utilizando g=6 \"g%=2\"= "+(g%=2));
		
		

	}

}
