package model.builder;

import model.builder.iface.IAddValor;
import model.impl.Camiseta;
import model.util.ECamisetaTamanho;

public class CamisetaBuilder implements IAddValor<CamisetaBuilder> {

	private Camiseta camiseta;
	
	public CamisetaBuilder() {
		this.camiseta = new Camiseta();
	}
	
	public static CamisetaBuilder builder() {
		return new CamisetaBuilder();
	}
	
	public Camiseta getObject() {
		return this.camiseta;
	}
	
	public CamisetaBuilder addTamanho(ECamisetaTamanho tamanho) {
		camiseta.setTamanho(tamanho);
		return this;
	}
	
	public CamisetaBuilder addCor(String cor) {
		camiseta.setCor(cor);
		return this;
	}
	
	public CamisetaBuilder addMarca(String marca) {
		camiseta.setMarca(marca);
		return this;
	}

	@Override
	public CamisetaBuilder addValor(double valor) {
		camiseta.setValor(valor);
		return this;
	}
}
