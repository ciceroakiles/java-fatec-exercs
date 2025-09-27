package model.builder;

import model.builder.iface.IAddValor;
import model.impl.MemAuxiliar;
import model.util.EMemAuxiliarTipo;

public class MemAuxiliarBuilder implements IAddValor<MemAuxiliarBuilder> {

	private MemAuxiliar memAuxiliar;
	
	public MemAuxiliarBuilder() {
		this.memAuxiliar = new MemAuxiliar();
	}
	
	public static MemAuxiliarBuilder builder() {
		return new MemAuxiliarBuilder();
	}
	
	public MemAuxiliar getObject() {
		return this.memAuxiliar;
	}
	
	public MemAuxiliarBuilder addTipo(EMemAuxiliarTipo tipo) {
		memAuxiliar.setTipo(tipo);
		return this;
	}
	
	public MemAuxiliarBuilder addCapacidade(int capacidade) {
		memAuxiliar.setCapacidade(capacidade);
		return this;
	}
	
	public MemAuxiliarBuilder addFabricante(String fabricante) {
		memAuxiliar.setFabricante(fabricante);
		return this;
	}
	
	@Override
	public MemAuxiliarBuilder addValor(double valor) {
		memAuxiliar.setValor(valor);
		return this;
	}
}
