package metodosJavaEx1;

public class Emprestimo {
	
	public int getDuasParcelas() {
		return 2;
	}	
	public int getTresParcelas() {
		return 3;
	}
	
	public static double getTxDuasParcelas () {
		return 0.3;
	}
	public static double getTxTresParcelas () {
		return 0.45;
	}
	
	public static void calcular (double valor, double d) {
		
		if (d == 2) {
			double valorFinal = valor + (valor * getTxDuasParcelas());
			System.out.println ("Valor final do empr�stimo em duas parcelas: R$" + valorFinal);
			}
			else if (d == 3) {
				double valorFinal = valor + (valor * getTxTresParcelas());
				System.out.println ("Valor final do empr�stimo em tres parcelas: R$" + valorFinal);
			} else {
				System.out.println ("Quantidade de parcelas n�o aceita");
			}
			
	}
}

