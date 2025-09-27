package service;

import model.ImovelBH;

public class ImovelBHService {

	public static double cobrar(ImovelBH im) {
		return ((im.getAreaTotal() * 7) + (im.getNumQuartos() * 4));
	}
}
