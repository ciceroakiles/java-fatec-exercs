package model.impl;

import model.util.EMemAuxiliarTipo;

public class MemAuxiliar extends Produto {

	private EMemAuxiliarTipo tipo;
	private int capacidade;
	private String fabricante;
	
	public EMemAuxiliarTipo getTipo() {
		return tipo;
	}
	public void setTipo(EMemAuxiliarTipo tipo) {
		this.tipo = tipo;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	@Override
	public String toString() {
		return "MemoriaAuxiliar [tipo=" + tipo + ", capacidade=" + capacidade + ", fabricante=" + fabricante
				+ ", valor=" + this.getValor() + "]";
	}
}
