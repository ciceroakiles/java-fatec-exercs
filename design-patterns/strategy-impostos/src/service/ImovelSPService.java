package service;

import model.ImovelSP;

public class ImovelSPService {

	public static double cobrar(ImovelSP im) {
		return ((im.getAreaTotal() * 10) + (im.getNumComodos() * 2));
	}
}
