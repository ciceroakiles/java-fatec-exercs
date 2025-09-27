package view;

import java.util.ArrayList;
import java.util.List;
import model.builder.CalcadoBuilder;
import model.builder.CamisetaBuilder;
import model.builder.JogoEletroBuilder;
import model.builder.MemAuxiliarBuilder;
import model.impl.Calcado;
import model.impl.Camiseta;
import model.impl.JogoEletro;
import model.impl.MemAuxiliar;
import model.impl.Produto;
import model.util.ECalcadoTipo;
import model.util.ECamisetaTamanho;
import model.util.EJogoEletroConsole;
import model.util.EMemAuxiliarTipo;

public class Principal {

	private static List<Produto> produtos = new ArrayList<>();
	
	public static void main(String[] args) {
		incluirObjetos();
		for (Produto p: produtos) {
			System.out.println(p.toString());
		}
	}
	
	private static void incluirObjetos() {
		Calcado clc1 = new CalcadoBuilder()
				.addValor(100)
				.addTamanho(36)
				.addCor("Preto")
				.addTipo(ECalcadoTipo.SOCIAL)
				.getObject();
		
		Calcado clc2 = new CalcadoBuilder()
				.addValor(75.50)
				.addTamanho(44)
				.addTipo(ECalcadoTipo.TENIS)
				.getObject();
		
		Calcado clc3 = new CalcadoBuilder()
				.addValor(75.50)
				.addCor("Branco")
				.getObject();
		
		Camiseta cms1 = new CamisetaBuilder()
				.addValor(250)
				.addTamanho(ECamisetaTamanho.M)
				.addCor("Azul")
				.addMarca("Navy")
				.getObject();
		
		Camiseta cms2 = new CamisetaBuilder()
				.addValor(1000)
				.addTamanho(ECamisetaTamanho.PP)
				.addMarca("Prada")
				.getObject();
		
		Camiseta cms3 = new CamisetaBuilder()
				.addValor(60)
				.addTamanho(ECamisetaTamanho.M)
				.addCor("Cinza")
				.getObject();
		
		JogoEletro gam1 = new JogoEletroBuilder()
				.addValor(29.99)
				.addNome("The Witcher 3: Wild Hunt")
				.addConsole(EJogoEletroConsole.PLAYSTATION)
				.getObject();
		
		JogoEletro gam2 = new JogoEletroBuilder()
				.addValor(119.60)
				.addNome("Diablo Collection")
				.addConsole(EJogoEletroConsole.XBOX)
				.getObject();
		
		JogoEletro gam3 = new JogoEletroBuilder()
				.addValor(50)
				.addNome("Portal 2")
				.getObject();
		
		MemAuxiliar mem1 = new MemAuxiliarBuilder()
				.addValor(300)
				.addTipo(EMemAuxiliarTipo.SSD)
				.addCapacidade(480)
				.addFabricante("Kingston")
				.getObject();
		
		MemAuxiliar mem2 = new MemAuxiliarBuilder()
				.addValor(290)
				.addTipo(EMemAuxiliarTipo.HDD)
				.addCapacidade(1000)
				.getObject();
		
		MemAuxiliar mem3 = new MemAuxiliarBuilder()
				.addValor(150)
				.addTipo(EMemAuxiliarTipo.NVME)
				.getObject();
		
		produtos.add(clc1);
		produtos.add(clc2);
		produtos.add(clc3);
		produtos.add(cms1);
		produtos.add(cms2);
		produtos.add(cms3);
		produtos.add(gam1);
		produtos.add(gam2);
		produtos.add(gam3);
		produtos.add(mem1);
		produtos.add(mem2);
		produtos.add(mem3);
	}
}
