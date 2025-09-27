package controller;

import model.ImovelBH;
import service.ImovelBHService;

public class ImovelBHController implements ICobranca {

	private ImovelBH im;
	
	public void setImovelBH(ImovelBH i) {
		this.im = i;
	}
	
	@Override
	public double cobrancaImposto() {
		return ImovelBHService.cobrar(im);
	}
}
