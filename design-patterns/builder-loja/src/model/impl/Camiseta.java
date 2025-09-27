package model.impl;

import model.util.ECamisetaTamanho;

public class Camiseta extends Produto {

	private ECamisetaTamanho tamanho;
	private String cor;
	private String marca;
	
	public ECamisetaTamanho getTamanho() {
		return tamanho;
	}
	public void setTamanho(ECamisetaTamanho tamanho) {
		this.tamanho = tamanho;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public String toString() {
		return "Camiseta [tamanho=" + tamanho + ", cor=" + cor + ", marca=" + marca + ", valor=" + this.getValor() + "]";
	}
}
