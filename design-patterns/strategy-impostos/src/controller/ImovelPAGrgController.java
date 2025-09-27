package controller;

import model.ImovelPAGrg;
import service.ImovelPAGrgService;

public class ImovelPAGrgController implements ICobranca {

	private ImovelPAGrg im;
	
	public void setImovelPAGrg(ImovelPAGrg i) {
		this.im = i;
	}
	
	@Override
	public double cobrancaImposto() {
		return ImovelPAGrgService.cobrar(im);	
	}
}
