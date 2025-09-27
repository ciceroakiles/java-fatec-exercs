package service.strategy;

public class NovoStr implements _IStrategy {

	@Override
	public double cobrarPorIdade(int idadeImovel) {
		if (idadeImovel < 20) {
			return (idadeImovel * 2);
		}
		return -1;
	}
}
