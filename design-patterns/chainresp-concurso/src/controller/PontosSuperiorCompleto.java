package controller;

import model.Candidato;

public class PontosSuperiorCompleto implements _IPontuacao {

	@Override
	public int calculaPontuacao(Candidato c) {
		int pontos = c.getPontosProva();
		if (c.isEnsinoSuperiorCompleto()) {
			pontos += 10;
		}
		return pontos;
	}

	@Override
	public void proximaPontuacao(Candidato c) {
		c.setPontosProva(calculaPontuacao(c));
		
		PontosRegEntClasse p3 = new PontosRegEntClasse();
		p3.proximaPontuacao(c);
	}

}
