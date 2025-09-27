package service;

import model.ImovelPA;

public class ImovelPAService {

	public static double cobrar(ImovelPA im) {
		return (im.getAreaTotal() * 8);
	}
}
