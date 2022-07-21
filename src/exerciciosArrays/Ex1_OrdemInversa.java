package exerciciosArrays;

public class Ex1_OrdemInversa {

	public static void main(String[] args) {
		
		int[] vetor = {0, -1, 6, 8, 11, 13};
		int count = (vetor.length -1);                 // contador deve ser menor que o tamanho do vetor
		System.out.println ("Vetor inverso: ");
		
		while (count >= 0) {                           // contador come�ar� com 5 posi��es
			System.out.println (vetor[count] + " ");   //imprime o valor do elemento na posi��o do contador
			count --;
		}
		System.out.println ("\n--------------");
		
		for (int elemento : vetor) {                   // para cada elemento do vetor
			System.out.println (elemento + " ");       // imprime o elemento
		}
	}
}
