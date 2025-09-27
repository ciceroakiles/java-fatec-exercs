package controller;

import model.Candidato;

public class PontosRegEntClasse implements _IPontuacao {

	@Override
	public int calculaPontuacao(Candidato c) {
		int pontos = c.getPontosProva();
		if (c.getAnosRegistroEntidadeClasse() > 0) {
			pontos += c.getAnosRegistroEntidadeClasse();
		}
		return pontos;
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		c.setPontosProva(calculaPontuacao(c));
		
		PontosExpArea p4 = new PontosExpArea();
		p4.proximaPontuacao(c);
	}

}
