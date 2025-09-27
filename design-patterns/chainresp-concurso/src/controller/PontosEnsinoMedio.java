package controller;

import model.Candidato;

public class PontosEnsinoMedio implements _IPontuacao {

	@Override
	public int calculaPontuacao(Candidato c) {
		int pontos = c.getPontosProva();
		if (c.isEnsinoMedioPublico()) {
			pontos += 5;
		}
		return pontos;
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		c.setPontosProva(calculaPontuacao(c));
		
		PontosSuperiorCompleto p2 = new PontosSuperiorCompleto();
		p2.proximaPontuacao(c);
	}

}
