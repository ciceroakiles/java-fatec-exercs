package model.impl;

import model.util.EJogoEletroConsole;

public class JogoEletro extends Produto {

	private String nome;
	private EJogoEletroConsole console;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EJogoEletroConsole getConsole() {
		return console;
	}
	public void setConsole(EJogoEletroConsole console) {
		this.console = console;
	}
	
	@Override
	public String toString() {
		return "JogoEletronico [nome=" + nome + ", console=" + console + ", valor=" + this.getValor() + "]";
	}
}
