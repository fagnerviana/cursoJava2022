package Operadores;

public class IncreDecremento {

	public static void main(String[] args) {
		
		int h = 7;
		
		//implementa os operadores de incremento e decremento
		
		System.out.println("Incremento sufixo:"+ (h++));
		System.out.println("Incremento prefixo:"+ (++h) );
		System.out.println("Decremento sufixo:"+ (h++) );
		System.out.println("Decremento prefixo:"+ (++h) );
		
	}

}
