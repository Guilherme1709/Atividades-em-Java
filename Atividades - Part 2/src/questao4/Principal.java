package questao4;

public class Principal {
	public static void main(String[] args) {
		FabricaAbstrataDeSanduiche sanduicheObj1 = new LanchoneteCG();
		Sanduiche gourmet = sanduicheObj1.FactorySanduiche("Integral", "Prato", "De Frango", "Sem Verdura");
		System.out.println(gourmet);
		
		FabricaAbstrataDeSanduiche sanduicheObj2 = new LanchonteJP();
		Sanduiche padrao = sanduicheObj2.FactorySanduiche("Francês", "Mussarela", "De Frango", "Com Verdura");
		System.out.println(padrao);
		
		FabricaAbstrataDeSanduiche sanduicheObj3 = new LanchoneteRT();
		Sanduiche doChef = sanduicheObj3.FactorySanduiche("Bola", "Cheddar", "De Peru", "Sem Verdura");
		System.out.println(doChef);
	}
}
