package service;

import model.ImovelPAGrg;

public class ImovelPAGrgService {

	public static double cobrar(ImovelPAGrg im) {
		return ((im.getAreaTotal() * 7.5) + (im.getAreaGaragem() * 2.5));
	}
}
