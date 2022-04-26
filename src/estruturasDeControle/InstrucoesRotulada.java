package estruturasDeControle;

public class InstrucoesRotulada {

	public static void main(String[] args) {
		// primeira instrução rotulada
		instrucao1:
			for (int i=1;i<4;i++) {
				// Segunda instrucao rotulada
				instrucao2:
					for(int j=1;j<4;j++) {
				if(j == 2) {
					System.out.println("Saindo da instrucao 1");
					break instrucao1;
				}
				System.out.println("Texto instrução 2");
			}
		System.out.println("Texto Instrucao 1");

	   }
	}

}
