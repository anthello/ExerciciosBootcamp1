package estruturasdeRepeticao;

import java.util.Scanner;

public class Ex3MaioreMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		float numero;
		float maior = 0;
		float soma = 0;
		int count = 0;
		
		do {
			System.out.println ("\nNumero: ");
			numero = scan.nextInt();
			soma = soma + numero;
			
			if (numero > maior) maior = numero;
			
			count = count + 1;
		} while (count < 5);
		
		System.out.println ("\nMaior: " + maior);
		System.out.println ("Média: " + (soma/5));
				
	}

}

