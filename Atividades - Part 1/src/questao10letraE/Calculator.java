package questao10letraE;
import java.util.*;

public class Calculator {
	Scanner geral = new Scanner(System.in);
	
	public double div(double x, double y) throws InvalidOperationException {
		System.out.println("Digite o primeiro n�mero: ");
		x = geral.nextDouble();
		System.out.println("Digite o segundo n�mero: ");
		y = geral.nextDouble();
		
		if(y == 0) {
			InvalidOperationException excecao = new InvalidOperationException("\nN�o existe divis�o por 0!\n");
			
			throw excecao;
		} else {
			System.out.println(x/y);
		}
		return 0;
	}
	
	public double log10(double x) throws InvalidOperationException {
		System.out.println("Digite o n�mero: ");
		x = geral.nextDouble();
		if(x < 0) {
			InvalidOperationException excecao = new InvalidOperationException("\nN�meros negativos n�o possuem logaritmos no "
																				+ "conjunto dos n�meros reais!!\n");
			throw excecao;
		} else {
			System.out.println(Math.log10(x));
		}
		
		return 0;
	}
}
