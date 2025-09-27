package service;

import model.ImovelCTB;
import service.strategy._IStrategy;

public class ImovelCTBService {

	public static double cobrar(ImovelCTB im, _IStrategy strategy) {
		if (strategy.cobrarPorIdade(im.getIdadeImovel()) != -1) {
			return (im.getAreaTotal() * 5) + strategy.cobrarPorIdade(im.getIdadeImovel());
		}
		return -1;
	}
}
