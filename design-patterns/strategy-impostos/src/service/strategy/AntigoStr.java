package service.strategy;

public class AntigoStr implements _IStrategy {

	@Override
	public double cobrarPorIdade(int idadeImovel) {
		if (idadeImovel > 20 && idadeImovel < 50) {
			return (idadeImovel * 2.5);
		}
		return -1;
	}
}
