package estruturasdeRepeticao;

import java.util.Scanner;

public class Ex5Tabuada {

	public static void main(String[] args) {
		
		int tabuada;
		Scanner scan = new Scanner (System.in);
		
		System.out.println ("Tabuada: ");
		tabuada = scan.nextInt();
		
		System.out.println ("Tabuada de: " + tabuada);
		
		for (int i=1; i<=10; i++) {
			System.out.println (tabuada + "X" + i + "=" + (tabuada*i));
		}	
	}
}
