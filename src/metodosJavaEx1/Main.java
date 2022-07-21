package metodosJavaEx1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		float a, b;
		
		System.out.println ("EXERCICIO CALCULADORA");
		Scanner scan = new Scanner (System.in);	
		System.out.println("Digite o primeiro valor");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor");
		b = scan.nextInt();
		
		float soma = Calculadora.soma(a, b);
		float subtracao = Calculadora.subtracao(a, b);
		float multiplicacao = Calculadora.multiplicacao (a, b);
		float divisao = Calculadora.divisao (a, b);
		
		System.out.println(soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		System.out.println ("\n");
		
		//Exercicio Mensagem
		System.out.println ("EXERCICIO MENSAGEM.\n");
		System.out.println ("Ola, como vai?");
		Mensagem.obterMensagem(9);
		Mensagem.obterMensagem(16);
		Mensagem.obterMensagem(19);
		Mensagem.obterMensagem(26);
		System.out.println ("\n");
		
		//Exercicio Emprestimo
		System.out.println ("EXERCICIO Cálculo valor emprestimo\n");
		Emprestimo.calcular(2000, 3);
		Emprestimo.calcular(2000, 2);
		Emprestimo.calcular(2000, 5);
	}
}

