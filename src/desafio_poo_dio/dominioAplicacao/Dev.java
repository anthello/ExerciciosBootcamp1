package desafio_poo_dio.dominioAplicacao;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.*;

public class Dev {
	
	private String nome;
	private Set <Conteudo> conteudosInscritos = new LinkedHashSet<>();
	private Set <Conteudo> conteudosConcluidos = new LinkedHashSet<>();
	private Object calcularXp;
	
	public void inscreverBootcamp ( Bootcamp bootcamp) {
		this.conteudosInscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevsInscritos().add(this);
	}
	
	public void progredir () {
		Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
		
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosInscritos.remove(conteudo.get());
		} else {
			System.err.println ("N�o h� mais conteudos a concluir");
		}
	}
	
	public double calcularTotalXp () {
		return this.conteudosConcluidos.stream()
				.mapToDouble(conteudo -> conteudo.calcularXp()).sum();
	}

	public Set<Conteudo> getConteudosInscritos() {
		return conteudosInscritos;
	}

	public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
		this.conteudosInscritos = conteudosInscritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	// m�todos equals and hashcode - para Collection Set
	@Override
	public int hashCode() {
		return Objects.hash(conteudosConcluidos, conteudosInscritos, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(conteudosConcluidos, other.conteudosConcluidos)
				&& Objects.equals(conteudosInscritos, other.conteudosInscritos) 
				&& Objects.equals(nome, other.nome);
	}
	
}
