package model;

public class ImovelBH extends Imovel {

	private int numQuartos;
	
	public ImovelBH(double a, int nq) {
		this.areaTotal = a;
		this.numQuartos = nq;
	}

	public int getNumQuartos() {
		return numQuartos;
	}
	public void setNumQuartos(int numQuartos) {
		this.numQuartos = numQuartos;
	}
}
