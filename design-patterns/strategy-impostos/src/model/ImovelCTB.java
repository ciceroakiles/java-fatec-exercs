package model;

public class ImovelCTB extends Imovel {

	private int idadeImovel;
	
	public ImovelCTB(double a, int id) {
		this.areaTotal = a;
		this.idadeImovel = id;
	}

	public int getIdadeImovel() {
		return idadeImovel;
	}
	public void setIdadeImovel(int idadeImovel) {
		this.idadeImovel = idadeImovel;
	}
}
