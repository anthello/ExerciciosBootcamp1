package exerciciosArrays;

import java.util.Scanner;

public class Ex2_Consoantes {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);   
        String[] consoantes = new String[6];        //iniciando O array

        int count = 0; 
        int quantidadeDeConsoantes = 0;

        do {
            System.out.print("Letra: "); 
            String letra = scan.next();            //guarda a letra e atrubua a variável letra.
            									   //se a letra informada não for: a, e, i, o ou u
            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                                                    
                consoantes[count] = letra;			// atribue a letra na posição do vetor caso seja consoante
                quantidadeDeConsoantes++;		    // incrementa a quantidade de consoantes
            }
            count++; 								//acrescente o valor 1 ao contador a cada loop
        } while (count < consoantes.length);        //enquanto o contador tiver o valor menor que o tamanho do array

        System.out.print("Consoantes: "); 
        
        for (String consoante : consoantes) {       //para cada consoante dentro do array consoantes
            if (consoante != null)                  //se o valor da consoante for diferente de null
                System.out.print(consoante + " ");  //imprima a consoante
        }
        System.out.println ("\n");
        System.out.println("Quantidade de consoantes: " + quantidadeDeConsoantes);
    }
}