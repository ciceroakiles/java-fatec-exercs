package model.builder;

import model.builder.iface.IAddValor;
import model.impl.JogoEletro;
import model.util.EJogoEletroConsole;

public class JogoEletroBuilder implements IAddValor<JogoEletroBuilder> {

	private JogoEletro jogoEletro;
	
	public JogoEletroBuilder() {
		this.jogoEletro = new JogoEletro();
	}
	
	public static JogoEletroBuilder builder() {
		return new JogoEletroBuilder();
	}
	
	public JogoEletro getObject() {
		return this.jogoEletro;
	}
	
	public JogoEletroBuilder addNome(String nome) {
		jogoEletro.setNome(nome);
		return this;
	}
	
	public JogoEletroBuilder addConsole(EJogoEletroConsole console) {
		jogoEletro.setConsole(console);
		return this;
	}

	@Override
	public JogoEletroBuilder addValor(double valor) {
		jogoEletro.setValor(valor);
		return this;
	}
}
