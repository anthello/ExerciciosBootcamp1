package desafiosCodigo;

import java.util.Scanner;

public class desafio2Intermediario {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
      
		   // TODO: complete os espa�os em branco com sua solu��o para o problema	
        int desconto = input.nextInt();
        int precoAntigo =  input.nextInt();


        int precoNovo = precoAntigo - (precoAntigo * desconto /  100);
        System.out.println(precoNovo);
	}
}