package model.impl;

import model.util.ECalcadoTipo;

public class Calcado extends Produto {

	private int tamanho;
	private String cor;
	private ECalcadoTipo tipo;
	
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public ECalcadoTipo getTipo() {
		return tipo;
	}
	public void setTipo(ECalcadoTipo tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public String toString() {
		return "Calcado [tamanho=" + tamanho + ", cor=" + cor + ", tipo=" + tipo + ", valor=" + this.getValor() + "]";
	}
}
