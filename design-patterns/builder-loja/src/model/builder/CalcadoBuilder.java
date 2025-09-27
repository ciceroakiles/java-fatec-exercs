package model.builder;

import model.builder.iface.IAddValor;
import model.impl.Calcado;
import model.util.ECalcadoTipo;

public class CalcadoBuilder implements IAddValor<CalcadoBuilder> {

	private Calcado calcado;
	
	public CalcadoBuilder() {
		this.calcado = new Calcado();
	}
	
	public static CalcadoBuilder builder() {
		return new CalcadoBuilder();
	}
	
	public Calcado getObject() {
		return this.calcado;
	}
	
	public CalcadoBuilder addTamanho(int tamanho) {
		if (tamanho >= 35 && tamanho <= 44) {
			calcado.setTamanho(tamanho);
		}
		return this;
	}
	
	public CalcadoBuilder addCor(String cor) {
		calcado.setCor(cor);
		return this;
	}
	
	public CalcadoBuilder addTipo(ECalcadoTipo tipo) {
		calcado.setTipo(tipo);
		return this;
	}

	@Override
	public CalcadoBuilder addValor(double valor) {
		calcado.setValor(valor);
		return this;
	}
}
