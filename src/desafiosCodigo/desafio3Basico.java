package desafiosCodigo;

import java.io.IOException;
import java.util.Scanner;

public class desafio3Basico {

	public static void main(String[] args) throws IOException {
			 
            Scanner input = new Scanner(System.in);
            String[] nomes = new String[5];             // inicializar o array
            for (int i = 0; i < nomes.length; i++)
            {
// TODO: complete os espaços em branco com sua solução para o problema
                nomes[i] = input.nextLine();             // inicializar o indice em nomes
            }
 
            int pos = input.nextInt();
            System.out.println(nomes[pos]);              // imprimir nomes e a posição
                      
    }
}



