package controller;

import model.Candidato;

public class PontosExpArea implements _IPontuacao {

	@Override
	public int calculaPontuacao(Candidato c) {
		int pontos = c.getPontosProva();
		if (c.getAnosExperiencia() > 0) {
			pontos += (c.getAnosExperiencia() * 2);
		}
		return pontos;
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		c.setPontosProva(calculaPontuacao(c));
	}

}
