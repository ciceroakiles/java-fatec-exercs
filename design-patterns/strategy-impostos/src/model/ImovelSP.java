package model;

public class ImovelSP extends Imovel {

	private int numComodos;
	
	public ImovelSP(double a, int nc) {
		this.areaTotal = a;
		this.numComodos = nc;
	}

	public int getNumComodos() {
		return numComodos;
	}
	public void setNumComodos(int numComodos) {
		this.numComodos = numComodos;
	}
}
