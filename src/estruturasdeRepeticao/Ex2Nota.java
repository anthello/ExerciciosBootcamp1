package estruturasdeRepeticao;

import java.util.Scanner;

public class Ex2Nota {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int nota;
		System.out.println ("Nota: ");
		nota = scan.nextInt();
		
		while (nota<0 || nota >10) {
			System.out.println ("Nota invalida. Digite novamente: ");
			nota = scan.nextInt();
		}
		System.out.println ("Programa executado com sucesso");
	}

}
