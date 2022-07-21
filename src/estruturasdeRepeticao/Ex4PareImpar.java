package estruturasdeRepeticao;

import java.util.Scanner;

public class Ex4PareImpar {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		int qtdeNumeros;
		int numero;
		int qtdePares = 0;
		int qtdeImpares = 0;
				
		System.out.println ("Quantidade de numeros: ");
		qtdeNumeros = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println ("Numero: ");
			numero = scan.nextInt();
			count = count+1;
			
			if (numero %2==0) qtdePares++;
			else qtdeImpares++;
			
		}while (count < qtdeNumeros);
			
		System.out.println ("Quantidade de numeros pares: " + qtdePares);
		System.out.println ("Quantidade de numeros impares: " + qtdeImpares);
		
	}
	
}


