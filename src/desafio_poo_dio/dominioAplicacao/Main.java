package desafio_poo_dio.dominioAplicacao;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria1 = new Mentoria();
		Mentoria mentoria2 = new Mentoria();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Principais Conceitos em Java");
		curso1.setCargaHoraria(14);
		
		curso2.setTitulo("Curso Python");
		curso2.setDescricao("Noçoes Básicas de Python");
		curso2.setCargaHoraria (12);
		
		mentoria1.setTitulo("Praticando Encapsulamento");
		mentoria1.setDescricao("Conceito e Exemplos de Implementação de Encapsulamento com Java");
		mentoria1.setData(LocalDate.now());
		
		mentoria2.setTitulo("Trabalhando com Bibliotecas Python");
		mentoria2.setDescricao("Conceitos e Usos das Principais Bibliotecas Python");
		mentoria2.setData (LocalDate.now());
		
		
	}

}
