package view;

import controller.ImovelBHController;
import controller.ImovelCTBController;
import controller.ImovelPAController;
import controller.ImovelPAGrgController;
import controller.ImovelSPController;
import model.ImovelBH;
import model.ImovelCTB;
import model.ImovelPA;
import model.ImovelPAGrg;
import model.ImovelSP;
import service.strategy.AntigoStr;
import service.strategy.MuitoAntigoStr;
import service.strategy.NovoStr;

public class Principal {

	public static void main(String[] args) {
		ImovelBH iBH = new ImovelBH(60, 2);
		ImovelCTB iCTB1 = new ImovelCTB(80, 15);
		ImovelCTB iCTB2 = new ImovelCTB(50, 30);
		ImovelCTB iCTB3 = new ImovelCTB(40, 60);
		ImovelPA iPA = new ImovelPA(40);
		ImovelPAGrg iPAGrg = new ImovelPAGrg(60, 30);
		ImovelSP iSP = new ImovelSP(90, 3);
		
		ImovelBHController iBHCtrl = new ImovelBHController();
		iBHCtrl.setImovelBH(iBH);
		System.out.println("(BH) Valor imposto: " + iBHCtrl.cobrancaImposto());
		
		ImovelPAController iPACtrl = new ImovelPAController();
		iPACtrl.setImovelPA(iPA);
		System.out.println("(PA) Valor imposto: " + iPACtrl.cobrancaImposto());
		
		ImovelPAGrgController iPAGrgCtrl = new ImovelPAGrgController();
		iPAGrgCtrl.setImovelPAGrg(iPAGrg);
		System.out.println("(PA, garagem) Valor imposto: " + iPAGrgCtrl.cobrancaImposto());
		
		ImovelSPController iSPCtrl = new ImovelSPController();
		iSPCtrl.setImovelSP(iSP);
		System.out.println("(SP) Valor imposto: " + iSPCtrl.cobrancaImposto());
		
		ImovelCTBController iCTBCtrl = new ImovelCTBController();
		iCTBCtrl.setImovelCTBeStr(iCTB1, new NovoStr());
		System.out.println("(CTB-1) Valor imposto: " + iCTBCtrl.cobrancaImposto());
		iCTBCtrl.setImovelCTBeStr(iCTB2, new AntigoStr());
		System.out.println("(CTB-2) Valor imposto: " + iCTBCtrl.cobrancaImposto());
		iCTBCtrl.setImovelCTBeStr(iCTB3, new MuitoAntigoStr());
		System.out.println("(CTB-3) Valor imposto: " + iCTBCtrl.cobrancaImposto());
	}
}
