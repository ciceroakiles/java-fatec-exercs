package controller;

import model.ImovelCTB;
import service.ImovelCTBService;
import service.strategy._IStrategy;

public class ImovelCTBController implements ICobranca {

	private ImovelCTB im;
	private _IStrategy strategy;
	
	public void setImovelCTBeStr(ImovelCTB i, _IStrategy str) {
		this.im = i;
		this.strategy = str;
	}
	
	@Override
	public double cobrancaImposto() {
		return ImovelCTBService.cobrar(im, strategy);
	}
}
