package service.strategy;

public class MuitoAntigoStr implements _IStrategy {

	@Override
	public double cobrarPorIdade(int idadeImovel) {
		if (idadeImovel > 50) {
			return (idadeImovel * 3);
		}
		return -1;
	}
}
