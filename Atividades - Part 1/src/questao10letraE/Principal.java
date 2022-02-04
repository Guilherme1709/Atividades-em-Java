package questao10letraE;
import java.util.*;

public class Principal {
	public static void main(String[] args) {
		Scanner leNums = new Scanner(System.in);
		int opcao = 0;
		Calculator teste = new Calculator();
		
		while(true) {
			System.out.println("Digite a operação que deseja realizar\n1 - Divisão\n2 - Logaritmo\n");
			opcao = leNums.nextInt();
			
			if(opcao == 1)
				teste.div(0, 0);

			
			if(opcao == 2)
				teste.log10(0);
	
			
			if(opcao == 0)
				System.out.println("Calculadora encerrada!");
				break;
		}
		
		leNums.close();
	}
}
