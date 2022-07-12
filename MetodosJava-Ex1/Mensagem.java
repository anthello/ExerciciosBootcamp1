package MetodosJava;

public class Mensagem {
	
	public static int obterMensagem ( int hora) {
		
			if (hora < 12) { 
				mensagemBomDia();
			} else if ((hora >12) && (hora<18)) {
				mensagemBoaTarde();
			} else if((hora > 18) && (hora < 24)){
				mensagemBoaNoite();
			} else {
				System.out.println ("Hora inválida");
			} return hora;
			
	} 
	
	public static void mensagemBomDia () {
		System.out.println ("Bom dia!");
	}
	
	public static void mensagemBoaTarde () {
		System.out.println ("Boa Tarde!");
	}
	
	public static void mensagemBoaNoite () {
		System.out.println ("Boa Noite!");
	}	
}
	