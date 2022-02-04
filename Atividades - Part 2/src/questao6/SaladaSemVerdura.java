package questao6;

import questao6Intefaces.SaladaIF;

public class SaladaSemVerdura implements SaladaIF {

	@Override
	public void exibirSalada() {
		System.out.println("Sem verdura");
	}

}
