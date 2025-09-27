package controller;

import model.ImovelSP;
import service.ImovelSPService;

public class ImovelSPController implements ICobranca {

	private ImovelSP im;
	
	public void setImovelSP(ImovelSP i) {
		this.im = i;
	}
	
	@Override
	public double cobrancaImposto() {
		return ImovelSPService.cobrar(im);
	}
}
