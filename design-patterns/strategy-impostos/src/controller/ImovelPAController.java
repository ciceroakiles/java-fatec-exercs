package controller;

import model.ImovelPA;
import service.ImovelPAService;

public class ImovelPAController implements ICobranca {

	private ImovelPA im;
	
	public void setImovelPA(ImovelPA i) {
		this.im = i;
	}
	
	@Override
	public double cobrancaImposto() {
		return ImovelPAService.cobrar(im);
	}
}
