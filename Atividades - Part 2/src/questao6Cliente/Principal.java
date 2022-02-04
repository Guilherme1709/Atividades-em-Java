package questao6Cliente;

import questao6Factories.*;
import questao6Intefaces.*;

public class Principal {
	public static void main(String[] args) {
		SanduichesIngredientFactory paozin = SanduichesFactory.GetFactoryCG("pão");
		SanduichesIngredientFactory presuntin = SanduichesFactory.GetFactoryCG("presunto");
		SanduichesIngredientFactory queijin = SanduichesFactory.GetFactoryCG("queijo");
		SanduichesIngredientFactory saladinha = SanduichesFactory.GetFactoryCG("salada");
		
		System.out.println("Sanduíche da lanchonete CG:");
		PaoIF pao1 = paozin.escolhePao("integral");
		pao1.exibirPao();
		PresuntoIF presunto1 = presuntin.escolhePresunto("frango");
		presunto1.exibirPresunto();
		QueijoIF queijin1 = queijin.escolhQueijo("prato");
		queijin1.exibirQueijo();
		SaladaIF saladinha1 = saladinha.escolheSalada("sem verdura");
		saladinha1.exibirSalada();
		
		System.out.println("\nSanduíche da lanchonete JP:");
		PaoIF pao2 = paozin.escolhePao("francês");
		pao2.exibirPao();
		PresuntoIF presunto2 = presuntin.escolhePresunto("frango");
		presunto2.exibirPresunto();
		QueijoIF queijin2 = queijin.escolhQueijo("mussarela");
		queijin2.exibirQueijo();
		SaladaIF saladinha2 = saladinha.escolheSalada("com verdura");
		saladinha2.exibirSalada();
		
		System.out.println("\nSanduíche da lanchonete RT:");
		PaoIF pao3 = paozin.escolhePao("bola");
		pao3.exibirPao();
		PresuntoIF presunto3 = presuntin.escolhePresunto("peru");
		presunto3.exibirPresunto();
		QueijoIF queijin3 = queijin.escolhQueijo("cheddar");
		queijin3.exibirQueijo();
		SaladaIF saladinha3 = saladinha.escolheSalada("sem verdura");
		saladinha3.exibirSalada();
	}
}
