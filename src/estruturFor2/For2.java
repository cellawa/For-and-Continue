package estruturFor2;

public class For2 {
	
public static void main(String[] args) {
	
	/* Estrutura de repit��o For e Continue*/
	
	for (int numero = 0; numero <=10; numero ++) {
		if (numero ==3 || numero ==6 || numero == 9) {
			System.out.println("Obaa, encontrei o numero " + numero);
			continue;
		}
		System.out.println("Processando la�o de repeti��o ");
	}
}
}
