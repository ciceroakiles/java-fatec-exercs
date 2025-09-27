package model;

public class ImovelPAGrg extends ImovelPA {

	private double areaGaragem;
	
	public ImovelPAGrg(double a, double ag) {
		super(a);
		this.areaGaragem = ag;
	}

	public double getAreaGaragem() {
		return areaGaragem;
	}
	public void setAreaGaragem(double areaGaragem) {
		this.areaGaragem = areaGaragem;
	}
}
