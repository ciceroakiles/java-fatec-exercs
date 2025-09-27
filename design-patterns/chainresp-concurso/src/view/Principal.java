package view;

import controller.PontosEnsinoMedio;
import model.Candidato;

public class Principal {

	public static void main(String[] args) {
		PontosEnsinoMedio p = new PontosEnsinoMedio();
		
		Candidato c1 = new Candidato();
		c1.setId(1);
		c1.setNome("Joao Silva");
		c1.setEnsinoMedioPublico(true);
		c1.setEnsinoSuperiorCompleto(true);
		c1.setAnosRegistroEntidadeClasse(0);
		c1.setAnosExperiencia(1);
		c1.setPontosProva(10);
		
		p.proximaPontuacao(c1);
		System.out.println(c1);
		
		Candidato c2 = new Candidato();
		c2.setId(2);
		c2.setNome("Maria Santos");
		c2.setEnsinoMedioPublico(false);
		c2.setEnsinoSuperiorCompleto(true);
		c2.setAnosRegistroEntidadeClasse(3);
		c2.setAnosExperiencia(0);
		c2.setPontosProva(7);
		
		p.proximaPontuacao(c2);
		System.out.println(c2);
	}
}
