package metodosJavaEx2;

public class Quadrilatero {
	
	public static void area (double lado) {
		System.out.println ("�rea do Quadrado: " + lado * lado);
	}
	
	public static void area (double lado1, double lado2) {
		System.out.println ("�rea do Ret�ngulo: " + lado1 * lado2);
	}
	
	public static void area (double baseMaior, double baseMenor, double altura) {
		System.out.println ("�rea do Trap�zio: " + ((baseMaior+baseMenor) * altura)/2);
	}
	
	

}
