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
		curso2.setDescricao("No�oes B�sicas de Python");
		curso2.setCargaHoraria (12);
		
		mentoria1.setTitulo("Praticando Encapsulamento");
		mentoria1.setDescricao("Conceito e Exemplos de Implementa��o de Encapsulamento com Java");
		mentoria1.setData(LocalDate.now());
		
		mentoria2.setTitulo("Trabalhando com Bibliotecas Python");
		mentoria2.setDescricao("Conceitos e Usos das Principais Bibliotecas Python");
		mentoria2.setData (LocalDate.now());
		
		Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Linguagens Orientadas a Objetos");
        bootcamp.setDescricao("Descri��o Bootcamp POO Java e Python");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
		
        Dev devAntonia = new Dev();
        devAntonia.setNome("Antonia");
        devAntonia.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Antonia:" + devAntonia.getConteudosInscritos());
        devAntonia.progredir();
        devAntonia.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Antonia:" + devAntonia.getConteudosInscritos());
        System.out.println("Conte�dos Conclu�dos Antonia:" + devAntonia.getConteudosConcluidos());
        System.out.println("XP:" + devAntonia.calcularTotalXp());
        
        System.out.println("-------");
        
        Dev devValter = new Dev();
        devValter.setNome("Valter");
        devValter.inscreverBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Valter:" + devValter.getConteudosInscritos());
        devValter.progredir();
        devValter.progredir();
        devValter.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Valter:" + devValter.getConteudosInscritos());
        System.out.println("Conte�dos Concluidos Valter:" + devValter.getConteudosConcluidos());
        System.out.println("XP:" + devValter.calcularTotalXp());
	}

}
