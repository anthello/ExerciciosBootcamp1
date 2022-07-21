package exerciciosArrays;

import java.util.Random;


public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {
		
		Random random = new Random();           // classe para gerar os numeros
		int[]numeros = new int [20];		    // array com as 20 posições
		
		//para i=numero, até i menor que o tamanho do array, acrescenta-se 1 ao valor de i a cada laço
		
		for (int i=0; i<numeros.length; i++) {
			int numero = random.nextInt(100);
			numeros[i] = numero;                 // atribue o numero recebido a posição i até chegar na ultima/vinte numeros
		}
		System.out.println ("Numeros: ");
		
		for (int numero : numeros) {             // para cada numero do array numeros,
			System.out.println (numero + " ");   // imprima o numero
		}
		System.out.println ("\n");
		
		System.out.println ("Sucessores: ");
		for (int numero : numeros) {
			System.out.println ((numero+1)+ " "); // regra para sucessor some +1 e imprima-o
		}
	}

}
