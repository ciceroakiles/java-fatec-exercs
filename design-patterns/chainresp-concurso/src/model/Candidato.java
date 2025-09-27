package model;

public class Candidato {

	private int id;
	private String nome;
	private boolean ensinoMedioPublico;
	private boolean ensinoSuperiorCompleto;
	private int anosRegistroEntidadeClasse;
	private int anosExperiencia;
	private int pontosProva;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isEnsinoMedioPublico() {
		return ensinoMedioPublico;
	}
	public void setEnsinoMedioPublico(boolean ensinoMedioPublico) {
		this.ensinoMedioPublico = ensinoMedioPublico;
	}
	public boolean isEnsinoSuperiorCompleto() {
		return ensinoSuperiorCompleto;
	}
	public void setEnsinoSuperiorCompleto(boolean ensinoSuperiorCompleto) {
		this.ensinoSuperiorCompleto = ensinoSuperiorCompleto;
	}
	public int getAnosRegistroEntidadeClasse() {
		return anosRegistroEntidadeClasse;
	}
	public void setAnosRegistroEntidadeClasse(int anosRegistroEntidadeClasse) {
		this.anosRegistroEntidadeClasse = anosRegistroEntidadeClasse;
	}
	public int getAnosExperiencia() {
		return anosExperiencia;
	}
	public void setAnosExperiencia(int anosExperiencia) {
		this.anosExperiencia = anosExperiencia;
	}
	public int getPontosProva() {
		return pontosProva;
	}
	public void setPontosProva(int pontosProva) {
		this.pontosProva = pontosProva;
	}
	
	@Override
	public String toString() {
		return "Candidato [id=" + id + ", nome=" + nome + ", ensinoMedioPublico=" + ensinoMedioPublico
				+ ", anosRegistroEntidadeClasse=" + anosRegistroEntidadeClasse + ", anosExperiencia=" + anosExperiencia
				+ ", pontosProva=" + pontosProva + "]";
	}
}
